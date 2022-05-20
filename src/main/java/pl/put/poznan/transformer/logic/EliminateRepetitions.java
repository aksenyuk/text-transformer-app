package pl.put.poznan.transformer.logic;

public class EliminateRepetitions extends Decorator{

    public EliminateRepetitions(TransformerInterface transformer){
        super(transformer);
    }

    public String transform(String text){
        return eliminateRepetitions(transformer.transform(text));
    }

    private String eliminateRepetitions(String text){
        String tokenized[] = text.split(" ");
        StringBuilder result = new StringBuilder();

        result.append(tokenized[0] + " ");
        for (int i = 1; i < tokenized.length; i++) {
            if (!( tokenized[i].equals(tokenized[i-1]) )) {
                result.append(tokenized[i] + " ");
            }
        }

        return result.toString();
    }

}
