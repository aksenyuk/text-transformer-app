package pl.put.poznan.transformer.logic;

public class ToLower extends Decorator{
    
    public ToLower(TransformerInterface transformer){
        super(transformer);
    }
    
    public String transform(String text){
        return lowerCase(transformer.transform(text));
    }

    private String lowerCase(String text){
        return text.toLowerCase();
    }
}
