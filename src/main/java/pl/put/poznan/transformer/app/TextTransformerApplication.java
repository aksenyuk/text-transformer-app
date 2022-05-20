package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.put.poznan.transformer.logic.TextTransformer;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class TextTransformerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextTransformerApplication.class, args);

        System.out.println("Intro");

        System.out.println("Input the text:");
        Scanner sc= new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Options");

        String[] todo = sc.nextLine().split(";");
        try {
            TextTransformer transformer = new TextTransformer(todo);
            text = transformer.transform(text);
        }
        catch(Exception ex){
            System.out.println("ERROR!");
        }

        System.out.println("Transformed text:");
        System.out.println(text);
    }
}
