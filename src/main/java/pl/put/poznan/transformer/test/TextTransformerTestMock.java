package pl.put.poznan.transformer.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.logic.*;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class TextTransformerTestMock {

    public TransformerInterface transformerInterface;

    @BeforeEach
    public void setUp() {
        transformerInterface = mock(TransformerInterface.class);
    }

    @Test
    public void testCapitalize(){
        Capitalize check = new Capitalize(transformerInterface);
        when(transformerInterface.transform("capitalize all")).thenReturn("Capitalize All");
        check.transform("capitalize all");
        verify(transformerInterface).transform("capitalize all");
        assertEquals("Capitalize All", transformerInterface.transform("capitalize all"));
    }

    @Test
    public void testEliminateRepetitions(){
        EliminateRepetitions check = new EliminateRepetitions(transformerInterface);
        when(transformerInterface.transform("Remove rep rep")).thenReturn("Remove rep ");
        check.transform("Remove rep rep");
        verify(transformerInterface).transform("Remove rep rep");
        assertEquals("Remove rep ", transformerInterface.transform("Remove rep rep"));
    }

    @Test
    public void testNumbersToText(){
        NumbersToText check = new NumbersToText(transformerInterface);
        when(transformerInterface.transform("147.89")).thenReturn("one hundred forty seven and eighty nine hundredth");
        check.transform("147.89");
        verify(transformerInterface).transform("147.89");
        assertEquals("one hundred forty seven and eighty nine hundredth", transformerInterface.transform("147.89"));
    }

    @Test
    public void testToAcronym(){
        ToAcronym check = new ToAcronym(transformerInterface);
        when(transformerInterface.transform("for example")).thenReturn("e.g.");
        check.transform("for example");
        verify(transformerInterface).transform("for example");
        assertEquals("e.g.", transformerInterface.transform("for example"));
    }

    @Test
    public void testToFull(){
        ToFull check = new ToFull(transformerInterface);
        when(transformerInterface.transform("aso")).thenReturn("and so on");
        check.transform("aso");
        verify(transformerInterface).transform("aso");
        assertEquals("and so on", transformerInterface.transform("aso"));
    }

    @Test
    public void testToInverse(){
        ToInverse check = new ToInverse(transformerInterface);
        when(transformerInterface.transform("inverse test")).thenReturn("tset esrevni");
        check.transform("inverse test");
        verify(transformerInterface).transform("inverse test");
        assertEquals("tset esrevni", transformerInterface.transform("inverse test"));
    }

    @Test
    public void testToLatex(){
        ToLatex check = new ToLatex(transformerInterface);
        when(transformerInterface.transform("$ latex &")).thenReturn("\\$ latex \\&");
        check.transform("$ latex &");
        verify(transformerInterface).transform("$ latex &");
        assertEquals("\\$ latex \\&", transformerInterface.transform("$ latex &"));
    }

    @Test
    public void testToLower(){
        ToLower check = new ToLower(transformerInterface);
        when(transformerInterface.transform("Lower TEST")).thenReturn("lower test");
        check.transform("Lower TEST");
        verify(transformerInterface).transform("Lower TEST");
        assertEquals("lower test", transformerInterface.transform("Lower TEST"));
    }

    @Test
    public void testToUpper(){
        ToUpper check = new ToUpper(transformerInterface);
        when(transformerInterface.transform("Upper test")).thenReturn("UPPER TEST");
        check.transform("Upper test");
        verify(transformerInterface).transform("Upper test");
        assertEquals("UPPER TEST", transformerInterface.transform("Upper test"));

    }

    @Test
    public void testNumbersToText2(){
        NumbersToText check = new NumbersToText(transformerInterface);
        when(transformerInterface.transform("1111")).thenReturn("1111");
        check.transform("1111");
        verify(transformerInterface).transform("1111");
        assertEquals("1111", transformerInterface.transform("1111"));
    }
}