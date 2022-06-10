package pl.put.poznan.transformer.logic;

import java.util.regex.Pattern;

public class ToLatex extends Decorator{

    public ToLatex(TransformerInterface transformer){
        super(transformer);
    }

    public String transform(String text){
        return ToLatexFormat(super.transform(text));
    }

    private String ToLatexFormat(String text){
        text = text.replace("$", "\\$");
        text = text.replace("&", "\\&");
        return text;
    }
}
