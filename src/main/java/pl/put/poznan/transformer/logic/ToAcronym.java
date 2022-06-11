package pl.put.poznan.transformer.logic;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * The given class is created to transform full form into acronyms in an input text
 */

public class ToAcronym extends Decorator{

    /**
     * Decorator transformer constructor
     * @param transformer - Decorator interface component of TransformerInterface type
     */

    public ToAcronym(TransformerInterface transformer){
        super(transformer);
    }

    /**
     * The method to activate this class text modifications
     * @param text - an input text to be processed of String type
     * @return modified text
     */

    public String transform(String text){
        return toShortForm(super.transform(text));
    }

    /**
     * The method to transform full form into acronyms in the parsed input text
     * @param text - an input text to be processed of String type
     * @return modified text
     */

    private String toShortForm(String text){
        Map<String, String> map = new HashMap<String, String>();

        map.put("for example", "e.g.");
        map.put("among others", "i.a.");
        map.put("and so on", "aso");
        map.put("professor", "prof.");

        for (Map.Entry<String, String> entry : map.entrySet()){
            text = text.replaceAll("(?i)"+ Pattern.quote(entry.getKey()), entry.getValue());
        }
        return text;
    }

}