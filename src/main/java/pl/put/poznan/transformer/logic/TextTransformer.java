package pl.put.poznan.transformer.logic;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {

    private final String[] transforms;

    public TextTransformer(String[] transforms){
        // this.transforms = transforms;
        switch (transforms) {
            case "upper":
                this.transforms = new ToUpper(transforms);
                break;
            case "lower":
                this.transforms = new ToLower(transforms);
                break;
            case "capitalize":
                this.transforms = new Capitalize(transforms);
                break;
            case "inverse":
                this.transforms = new ToInverse(transforms);
                break;
            case "numbersToText":
                this.transforms = new NumbersToText(transforms);
                break;
            case "stringsToAcronyms":
                this.transforms = new ToAcronym(transforms);
                break;
            case "acronymsToStrings":
                this.transforms = new ToFull(transforms);
                break;
            case "latex":
                this.transforms = new ToLatex(transforms);
                break;
            case "removeRepetitions":
                this.transforms = new removeRepetitions(transforms);
                break;
            default:
                //throw new exception
        }
    }

    public String transform(String text){
        // of course, normally it would do something based on the transforms
        // return text.toUpperCase();
    }
}
