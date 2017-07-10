package com.javarush.task.task36.task3601;

import java.util.List;

/**
 * Created by vladislavklockov on 10.07.17.
 */
public class Model {
    Service service = new Service();
    public List<String> getStringDataList() {
        return service.getData();
    }
}
