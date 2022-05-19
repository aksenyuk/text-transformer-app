package pl.put.poznan.transformer.logic;

import java.util.HashMap;
import java.util.Map;

public class ToFull extends Decorator{

    public ToFull(InterfaceTransformer transformer){
        super(transformer);
    }

    public String transform(String text){
        return toFullForm(transformer.transform(text));
    }

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
