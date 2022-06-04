package com.myorganization.myteam.is;

public class BearAssistant implements BearCleaner, BearPetter {
    @Override
    public void washTheBear() {

    }

    @Override
    public void petTheBear() {

    }
}

class Expert implements BearFeeder {

    @Override
    public void feedTheBear() {

    }
}

/**
 * This is wrong, what if there is no requirement to pet the bear, the method would still have to be implemented
 */
interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}


/**
 * Correct way
 */
interface BearCleaner {
    void washTheBear();
}

interface BearFeeder {
    void feedTheBear();
}

interface BearPetter {
    void petTheBear();
}