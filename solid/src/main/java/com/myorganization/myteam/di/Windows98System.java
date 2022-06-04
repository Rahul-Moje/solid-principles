package com.myorganization.myteam.di;

/**
 * This class is using monitor and keyboard directly.
 * What if keyboard and monitor changes, hard to test, and problems enhancing
 */
public class Windows98System {

    Keyboard keyboard;
    Monitor monitor;

    public Windows98System() {
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
    }
}

class Keyboard {

}

class Monitor {

}

/**
 * Adhering to DI example
 */
class Windows98UsingDI {

    KeyBoardUsingDI keyBoardUsingDI;
    MonitorUsingDI monitorUsingDI;

    /**
     * Dependent on abstractions
     * @param keyBoardUsingDI
     * @param monitorUsingDI
     */
    public Windows98UsingDI(KeyBoardUsingDI keyBoardUsingDI, MonitorUsingDI monitorUsingDI) {
        this.keyBoardUsingDI = keyBoardUsingDI;
        this.monitorUsingDI = monitorUsingDI;
    }
}

interface KeyBoardUsingDI {

}

interface MonitorUsingDI {

}

class WiredKeyboard implements KeyBoardUsingDI {

}

class StandardMonitor implements  MonitorUsingDI {

}