package pl.put.poznan.transformer.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.logic.*;

import static org.junit.jupiter.api.Assertions.*;

class TransformerInterfaceTest {

    public TransformerInterface transforminterface;

    @BeforeEach
    private void setUp(){
        transforminterface = new DoNothing();
    }

    @Test
    public void testCapitalize(){
        transforminterface = new Capitalize(transforminterface);
        String check = transforminterface.transform("capitalize all");
        assertEquals(check, "Capitalize All");
    }

    @Test
    public void testEliminateRepetitions(){
        transforminterface = new EliminateRepetitions(transforminterface);
        String check = transforminterface.transform("Remove rep rep");
        assertEquals(check, "Remove rep ");
    }

    @Test
    public void testNumbersToText(){
        transforminterface = new NumbersToText(transforminterface);
        String check = transforminterface.transform("147.89");
        assertEquals(check, "one hundred forty seven and eighty nine hundredth");
    }

    @Test
    public void testToAcronym(){
        transforminterface = new ToAcronym(transforminterface);
        String check = transforminterface.transform("for example");
        assertEquals(check, "e.g.");
    }

    @Test
    public void testToFull(){
        transforminterface = new ToFull(transforminterface);
        String check = transforminterface.transform("aso");
        assertEquals(check, "and so on");
    }

    @Test
    public void testToInverse(){
        transforminterface = new ToInverse(transforminterface);
        String check = transforminterface.transform("inverse test");
        assertEquals(check, "tset esrevni");
    }

    @Test
    public void testToLatex(){
        transforminterface = new ToLatex(transforminterface);
        String check = transforminterface.transform("$ latex &");
        assertEquals(check, "\\$ latex \\&");
    }

    @Test
    public void testToLower(){
        transforminterface = new ToLower(transforminterface);
        String check = transforminterface.transform("Lower TEST");
        assertEquals(check, "lower test");
    }

    @Test
    public void testToUpper(){
        transforminterface = new ToUpper(transforminterface);
        String check = transforminterface.transform("Upper test");
        assertEquals(check, "UPPER TEST");
    }
}