package com.javarush.task.task37.task3711;

/**
 * Created by vladislavklockov on 15.07.17.
 */
public class Computer {
    Memory memory = new Memory();
    CPU cpu = new CPU();
    HardDrive hardDrive = new HardDrive();

    public void run() {
        cpu.calculate();
        memory.allocate();
        hardDrive.storeData();
    }
}
