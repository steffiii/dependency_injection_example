package at.aau.service;

import org.springframework.beans.factory.annotation.Autowired;
import at.aau.printer.IPrinter;
import org.springframework.stereotype.Service;


@Service
public class PrinterService {

    @Autowired
    private IPrinter printer;

    public void setWriter(IPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        String s = "This is my test";
        printer.print(s);
    }
}

