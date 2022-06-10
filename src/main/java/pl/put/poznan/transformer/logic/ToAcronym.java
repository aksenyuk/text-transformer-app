package pl.put.poznan.transformer.logic;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class ToAcronym extends Decorator{

    public ToAcronym(TransformerInterface transformer){
        super(transformer);
    }

    public String transform(String text){
        return toShortForm(super.transform(text));
    }

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