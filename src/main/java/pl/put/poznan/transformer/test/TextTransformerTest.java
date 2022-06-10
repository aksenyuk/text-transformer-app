package pl.put.poznan.transformer.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.logic.*;

import static org.junit.jupiter.api.Assertions.*;

class TextTransformerTest {

    public TextTransformer texttransformer;

    @BeforeEach
    void setUp() { texttransformer = new TextTransformer(new String[]{}); }

    @Test
    public void testCapitalizeInverse(){
        texttransformer = new TextTransformer(new String[]{"capitalize", "inverse"});
        String check = texttransformer.transform("capitalize and inverse");
        assertEquals(check, "Esrevni dna eziLatipac");
    }

    @Test
    public void testInverseLower(){
        texttransformer = new TextTransformer(new String[]{"inverse", "lower"});
        String check = texttransformer.transform("InveRSe aNd LOWer");
        assertEquals(check, "rewol dna esrevni");
    }

    @Test
    public void testUpperAcronim(){
        texttransformer = new TextTransformer(new String[]{"to-acronyms", "upper"});
        String check = texttransformer.transform("Upper professor for example");
        assertEquals(check, "UPPER PROF. E.G.");
    }

    @Test
    public void testFullFormLatex(){
        texttransformer = new TextTransformer(new String[]{"to-full-form", "latex"});
        String check = texttransformer.transform("aso $ and dr&");
        assertEquals(check, "and so on \\$ and doctor\\&");
    }

    @Test
    public void testRemoveDuplicatesNumbersToText(){
        texttransformer = new TextTransformer(new String[]{"remove-repetitions", "numbers-to-text"});
        String check = texttransformer.transform("cool 105.73 105.73 test");
        assertEquals(check, "cool one hundred five and seventy three hundredth test");
    }

    @Test
    public void testCapitalizeFullFormLatex(){
        texttransformer = new TextTransformer(new String[]{"capitalize", "to-full-form", "latex"});
        String check = texttransformer.transform("oh $ prof. oh &");
        assertEquals(check, "Oh \\$ Professor Oh \\&");
    }

    @Test
    public void testLowerAcronymRemoveDuplicates(){
        texttransformer = new TextTransformer(new String[]{"lower", "to-acronyms", "remove-repetitions"});
        String check = texttransformer.transform("I TESt tESt Among Others Others");
        assertEquals(check, "i test i.a. others ");
    }

    @Test
    public void testLatexNumbersToText(){
        texttransformer = new TextTransformer(new String[]{"latex", "numbers-to-text"});
        String check = texttransformer.transform("$& 14 aNd 123.07 &");
        assertEquals(check, "\\$\\& fourteen aNd one hundred twenty three and seven tenth \\&");
    }

    @Test
    public void testNumbersToTextUpper(){
        texttransformer = new TextTransformer(new String[]{"numbers-to-text", "upper"});
        String check = texttransformer.transform("2 35.7 and 147.92");
        assertEquals(check, "TWO THIRTY FIVE AND SEVEN TENTH AND ONE HUNDRED FORTY SEVEN AND NINETY TWO HUNDREDTH");
    }

    @Test
    public void testRemoveDuplicatesCapitalizeToFullFormInverse(){
        texttransformer = new TextTransformer(new String[]{"remove-repetitions", "to-full-form", "capitalize", "inverse"});
        String check = texttransformer.transform("e.g. e.g. i think dr is sUs");
        assertEquals(check, "Sus Si rotcoD Kniht I elpmaXe ROf");
    }

    @Test
    public void testAll(){
        texttransformer = new TextTransformer(new String[]{"to-acronyms", "to-full-form", "upper", "lower", "capitalize", "latex", "remove-repetitions", "numbers-to-text", "inverse"});
        String check = texttransformer.transform("To convert numbers followed by a a sign, e.g, 148.75$, \"space\" needed, i.e.: 10.3 $.");
        assertEquals(check, ".$\\ htnet eErht dna net :.e.I ,DeDeen \"EcapS\" ,$\\57.841 elpmaxe rof ,Ngis a yB dewollof srebmun trevnoc ot");
    }

}