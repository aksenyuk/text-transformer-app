package pl.put.poznan.transformer.logic;

public class ToLatex extends Decorator{

    public ToLatex(TransformerInterface transformer){
        super(transformer);
    }

    public String transform(String text){
        return ToLatexFormat(transformer.transform(text));
    }

    private String ToLatexFormat(String text){
        text.replace("$", "\\$");
        text.replace("&", "\\&");
        return text;
    }
}
