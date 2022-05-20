package pl.put.poznan.transformer.logic;
import java.util.*;
import java.lang.*;

/**
 * The given class is reverse the sequence of characters, retaining the case of letters in specific positions (inverse) in an input text
 */

public class ToInverse extends Decorator{

    /**
     * Decorator transformer constructor
     * @param transformer - Decorator interface component of TransformerInterface type
     */

    public ToInverse(TransformerInterface transformer){
        super(transformer);
    }

    /**
     * The method to activate this class text modifications
     * @param text - an input text to be processed of String type
     * @return modified text
     */

    public String transform(String text){
        return InverseFunction(transformer.transform(text));
    }

    /**
     * The method to reverse the sequence of characters, retaining the case of letters in specific positions (inverse) in a parsed input text
     * @param text - an input text to be processed of String type
     * @return modified text
     */

    private String InverseFunction(String text){
        Set<Integer> IndexSet = new HashSet<Integer>();

        for (int i = 0; i < text.length(); i++){
            if (Character.isUpperCase(text.charAt(i))){
                IndexSet.add(i);
            }
        }

        StringBuilder text2 = new StringBuilder();
        text2.append(text);
        text2.reverse();
        text = text2.toString().toLowerCase();
        char[] text3 = text.toCharArray();
        for (Integer idx : IndexSet){
            text3[idx] = Character.toUpperCase(text3[idx]);
        }
        return new String(text3);
    }

}
