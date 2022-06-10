package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.put.poznan.transformer.logic.TextTransformer;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class TextTransformerApplication {

        /*
         for Rest GET request use e.g. localhost/8080/your text?operations=op1;op2
         then select 'Raw Data' tab and receive your transformed text
         */
        public static void main(String[] args) {
                ControlPanel panel = new ControlPanel("Text Transformer");
                panel.setVisible(true);
                SpringApplication.run(TextTransformerApplication.class, args);
/*
        CLI version
 */
//                System.out.println("You can transform your text with various options.");
//
//                System.out.println("Input the text:");
//                Scanner sc= new Scanner(System.in);
//                String text = sc.nextLine();
//
//                System.out.println("Available options:\n" +
//                        "upper - to make the text UPPER-CASE\n" +
//                        "lower - to make the text lower-case\n" +
//                        "capitalize - to make all word Capital\n" +
//                        "inverse - to inverse the order (preserves case)\n" +
//                        "to-acronyms - to change full form to acronyms\n" +
//                        "to-full-form - to change acronyms to full form\n" +
//                        "latex - to make the text LaTeX suitable\n" +
//                        "remove-repetitions - to remove consecutive repetitive words\n" +
//                        "numbers-to-text - to convert numbers into text form");
//                System.out.println("Please type your options (separated by semicolon if more thar one):");
//
//                String[] todo = sc.nextLine().split(";");
//                try {
//                        TextTransformer transformer = new TextTransformer(todo);
//                        text = transformer.transform(text);
//                }
//                catch(Exception ex){
//                        System.out.println("ERROR!");
//                }
//
//                System.out.println("Transformed text:");
//                System.out.println(text);
        }
}