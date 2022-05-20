package pl.put.poznan.transformer.logic;

public class ToUpper extends Decorator{
    
    public ToUpper(TransformerInterface transformer){
        super(transformer);
    }
    
    public String transform(String text){
        return upperCase(transformer.transform(text));
    }

    private String upperCase(String text){
        return text.toUpperCase();
    }
}
