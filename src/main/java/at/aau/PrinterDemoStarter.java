package at.aau;

import at.aau.service.PrinterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

 @Configuration
 @ComponentScan("at.aau")
 public class PrinterDemoStarter {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        PrinterDemoStarter.class);

        PrinterService s = context.getBean(PrinterService.class);
        s.run();
    }
 }



