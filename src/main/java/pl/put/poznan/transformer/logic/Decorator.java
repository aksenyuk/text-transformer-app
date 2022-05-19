package pl.put.poznan.transformer.logic;

public class Decorator implements TransformerInterface {
    protected TransformerInterface transformer;

    public Decorator(TransformerInterface transformer){
        this.transformer = transformer;
    }

    @Override
    public String transform(String text){
        return text;
    }
}
