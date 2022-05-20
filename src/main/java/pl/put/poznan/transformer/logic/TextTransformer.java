package pl.put.poznan.transformer.logic;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {

    private TransformerInterface transformer;

    public String transform(String text){
        return transformer.transform(text);
    }

    public TextTransformer(String[] todo){
        transformer = new DoNothing();
        for(String operation : todo){
            switch (operation) {
                case "upper":
                    this.transformer = new ToUpper(transformer);
                    break;
                case "lower":
                    this.transformer = new ToLower(transformer);
                    break;
                case "capitalize":
                    this.transformer = new Capitalize(transformer);
                    break;
                case "inverse":
                    this.transformer = new ToInverse(transformer);
                    break;
//                case "numbersToText":
//                    this.transformer = new NumbersToText(transformer);
//                    break;
                case "to-acronyms":
                    this.transformer = new ToAcronym(transformer);
                    break;
                case "to-full-form":
                    this.transformer = new ToFull(transformer);
                    break;
                case "latex":
                    this.transformer = new ToLatex(transformer);
                    break;
                case "remove-repetitions":
                    this.transformer = new EliminateRepetitions(transformer);
                    break;
                default:
                    //throw new exception
            }
        }
    }

}
