package pl.put.poznan.transformer.logic;

import java.util.HashMap;
import java.util.Map;

/**
 * The given class is created to transform acronyms into their full forms in an input text
 */

public class ToFull extends Decorator{

    /**
     * Decorator transformer constructor
     * @param transformer - Decorator interface component of TransformerInterface type
     */

    public ToFull(TransformerInterface transformer){
        super(transformer);
    }

    /**
     * The method to activate this class text modifications
     * @param text - an input text to be processed of String type
     * @return modified text
     */

    public String transform(String text){
        return toFullForm(super.transform(text));
    }

    /**
     * The method to transform acronyms into their full forms in the parsed input text
     * @param text - an input text to be processed of String type
     * @return modified text
     */

    private String toFullForm(String text){
        Map<String, String> map = new HashMap<String, String>();

        map.put("prof.", "professor");
        map.put("dr", "doctor");
        map.put("e.g.", "for example");
        map.put("aso", "and so on");

        for (Map.Entry<String, String> entry : map.entrySet()){
            // lower
            text = text.replaceAll(entry.getKey(), entry.getValue());

            // upper
            String candidate = entry.getKey().substring(0, 1).toUpperCase() + entry.getKey().substring(1);
            String acronym = entry.getValue().substring(0, 1).toUpperCase() + entry.getValue().substring(1);
            text = text.replaceAll(candidate, acronym);
        }
        return text;
    }

}
