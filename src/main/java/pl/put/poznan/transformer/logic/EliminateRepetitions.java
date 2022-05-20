package pl.put.poznan.transformer.logic;

/**
 * The given class is created to remove repetitions in an input text
 */

public class EliminateRepetitions extends Decorator{

    /**
     * Decorator transformer constructor
     * @param transformer - Decorator interface component of TransformerInterface type
     */

    public EliminateRepetitions(TransformerInterface transformer){
        super(transformer);
    }

    /**
     * The method to activate this class text modifications
     * @param text - an input text to be processed of String type
     * @return modified text
     */

    public String transform(String text){
        return eliminateRepetitions(transformer.transform(text));
    }

    /**
     * The method to remove repetitions in the parsed input text
     * @param text - an input text to be processed of String type
     * @return modified text
     */

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
