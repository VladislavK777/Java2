package com.javarush.task.task37.task3708.retrievers;

import com.javarush.task.task37.task3708.cache.LRUCache;
import com.javarush.task.task37.task3708.storage.Storage;

/**
 * Created by vladislavklockov on 14.07.17.
 */
public class CachingProxyRetriever implements Retriever {
    OriginalRetriever originalRetriever;
    LRUCache<Object, Object> lruCache = new LRUCache<>(1);

    public CachingProxyRetriever(Storage storage) {
        this.originalRetriever = new OriginalRetriever(storage);
    }

    @Override
    public Object retrieve(long id) {
        if (lruCache.find(id) == null) {
            Object value = originalRetriever.retrieve(id);
            lruCache.set(id, value);
            return value;
        } else {
            return lruCache.find(id);
        }
    }
}
