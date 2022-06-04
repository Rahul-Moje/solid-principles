package com.myorganization.myteam.srp;

public class Book {

    //member variables

    //methods

    /**
     * Violating SRP
     */
    public void printToPDF() {

    }

    /**
     * Violating SRP
     */
    public void printToConsole() {

    }
}

/**
 *Extracted printing methods and created a separate class. Adheres to SRP
 */
class BookPrinter {


    public void printToPDF() {

    }


    public void printToConsole() {

    }
}
