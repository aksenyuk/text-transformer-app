package pl.put.poznan.transformer.logic;

public class Decorator implements InterfaceTransformer{
    protected InterfaceTransformer transformer;

    public Decorator(InterfaceTransformer transformer){
        this.transformer = transformer;
    }

    @Override
    public String transform(String text){
        return text;
    }
}
