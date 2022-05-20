package pl.put.poznan.transformer.logic;
import java.util.*;
import java.lang.*;
public class ToInverse extends Decorator{

    public ToInverse(TransformerInterface transformer){
        super(transformer);
    }

    public String transform(String text){
        return InverseFunction(transformer.transform(text));
    }

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
