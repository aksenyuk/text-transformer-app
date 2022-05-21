package pl.put.poznan.transformer.logic;

public class Capitalize extends Decorator{
    
    public Capitalize(TransformerInterface transformer){
        super(transformer);
    }
    
    public String transform(String text){
        return capitalize(super.transform(text));
    }

    private String capitalize(String text){
        String[] list_text = text.split(" ");

        for (int i = 0; i < list_text.length; i++){
            list_text[i] = list_text[i].substring(0, 1).toUpperCase() + list_text[i].substring(1);
        }
        
        text = String.join(" ", list_text);
        return text;
    }
}
