/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.unicam.cs.pa.Racetrack098994;

import it.unicam.cs.pa.Racetrack098994.view.PromptGUI;

import java.io.FileNotFoundException;

public class App {


    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 1) {
            System.err.println("Atteso un numero di parametri uguale a 1, invece di " + args.length);
            System.exit(-1);
        }

        PromptGUI promptGUI = new PromptGUI(args[0]);
        promptGUI.runGameAndWaitUserInputs();


    }


}