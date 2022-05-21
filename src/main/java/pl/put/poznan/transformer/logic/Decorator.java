package pl.put.poznan.transformer.logic;

public abstract class Decorator implements TransformerInterface {
    private TransformerInterface transformer;

    public Decorator(TransformerInterface transformer){
        this.transformer = transformer;
    }

    @Override
    public String transform(String text){
        return this.transformer.transform(text);
    }
}
