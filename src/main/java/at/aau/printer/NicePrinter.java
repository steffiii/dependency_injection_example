package at.aau.printer;

import org.springframework.stereotype.Component;

@Component
 public class NicePrinter implements IPrinter {

    public void print(String toPrint) {
        System.out.println("*** nice print ***");
        System.out.println(toPrint);
    }
 }





