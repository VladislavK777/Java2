package com.javarush.task.task36.task3601;

import java.util.List;

/**
 * Created by vladislavklockov on 10.07.17.
 */
public class Controller {
    Model model = new Model();
    public List<String> onDataListShow() {
        return model.getStringDataList();
    }
}
