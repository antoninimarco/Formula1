package it.unicam.cs.pa.Racetrack098994.view;

import it.unicam.cs.pa.Racetrack098994.controller.Controller;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PromptGUI implements IPromptGUI{
    private final Controller controller;

    public PromptGUI(String path) throws FileNotFoundException {
        if (path==null)
            throw new NullPointerException("Il file del path non puo essere nullo");
        this.controller =  new Controller(path);
    }

    private void printFirstMessage() {
        System.out.println("\nIl gioco e' stato caricato con successo, per giocare inserisci i numeri\n");

    }

    private void printTerminalCommands() {
        System.out.println( "\n\t1- se vuoi far muovere i bot" +
                            "\n\t2- se vuoi controllare la classifica" +
                            "\n\t3- se vuoi uscire dall'applicazione" +
                            "\n\t4- se vuoi far partire una nuova gara" );
    }

    @Override
    public void runGameAndWaitUserInputs() {
        printFirstMessage();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            printTerminalCommands();
            try{
                int command= scanner.nextInt();
                if (command<1 || command>4) {
                    throw new Exception();
                } else {
                    checkUserInput(command);
                }
            }
            catch (Exception exception) {
                System.out.println("\n Inserire soltanto un numero da 1 a 4\n");
                exception.printStackTrace();
            }
        }
    }

    private void checkUserInput(int command) throws FileNotFoundException {
        switch (command) {
            case 1:
                System.out.println(controller.makeNewMove());
                break;

            case 2:
                System.out.println(controller.getStatus());
                break;

            case 3:
                System.out.println("\nTermino il gioco\n");
                System.exit(0);
                break;

            case 4:
                System.out.println("\nSto caricando una nuova gara\n");
                controller.startGame();
                break;

        }
    }


}
