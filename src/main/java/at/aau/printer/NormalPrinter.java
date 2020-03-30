package at.aau.printer;

import org.springframework.stereotype.Component;

public class NormalPrinter implements IPrinter {

    public void print(String toPrint) {

        System.out.println("\n" + toPrint);
    }
 }



