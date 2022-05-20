package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.put.poznan.transformer.logic.TextTransformer;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class TextTransformerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextTransformerApplication.class, args);

        System.out.println("You can transform your text with various options.");

        System.out.println("Input the text:");
        Scanner sc= new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Available options:\n" +
                "upper - to make the text UPPER-CASE\n" +
                "lower - to make the text lower-case\n" +
                "capitalize - to make all word Capital\n" +
                "inverse - to inverse the order (preserves case)\n" +
                "to-acronyms - change full form to acronyms\n" +
                "to-full-form - change acronyms to full form\n" +
                "latex - to make the text LaTeX suitable\n" +
                "remove-repetitions - to remove consecutive repetitive words");
        System.out.println("Please type your options (separated by semicolon if more thar one):");

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
