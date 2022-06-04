package com.myorganization.myteam.openclose;

public class Guitar {

    String brand;
    String price;
    //remaining methods

    //Now if you add attributes and methods related to acoustic and electric guitar here, it will violate Open Closed Principle
}


/**
 * Adheres to open-closed principle by extending base Guitar
 */
class AcousticGuitar extends Guitar {

    String stringType;
}

/**
 * Adheres to open-closed principle by extending base Guitar
 */
class ElectricGuitar extends Guitar{

    String voltage;
}