package pl.put.poznan.transformer.logic;

public class DoNothing implements TransformerInterface{

    @Override
    public String transform(String text) {
        return text;
    }
}
