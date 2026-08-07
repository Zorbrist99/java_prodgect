package HomeWork14;


import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XMLUtilsTests {
    String expectedValueError = "<invalid/>";

    @Test
    void valueEmptyLineTest() {
        String actualValueEmptyLine = XMLUtils.createEmptyElement("");

        assertEquals(expectedValueError, actualValueEmptyLine,
                MessageFormat.format(
                        "Тег который ожидаем мы: {0}, тег который вернул метод: {1}",
                        expectedValueError, actualValueEmptyLine));
    }

    @Test
    void valueNullTest() {
        String actualValueNull = XMLUtils.createEmptyElement("null");

        assertEquals(expectedValueError, actualValueNull,
                MessageFormat.format(
                        "Тег который ожидаем мы: {0}, тег который вернул метод: {1}",
                        expectedValueError, actualValueNull));
    }

    @Test
    public void actualValueTest() {
        String expectedValue = "<primer></primer>";
        String actualValue = XMLUtils.createEmptyElement("primer");

        assertEquals(expectedValue, actualValue,
                MessageFormat.format(
                        "Тег который ожидаем мы: {0}, тег который вернул метод: {1}",
                        expectedValue, actualValue));
    }

    @Test
    public void ValueEmptyTest() {
        String actualValueEmpty = XMLUtils.createEmptyElement(null);

        assertEquals(expectedValueError, actualValueEmpty,
                MessageFormat.format(
                        "Тег который ожидаем мы: {0}, тег который вернул метод: {1}",
                        expectedValueError, actualValueEmpty));
    }
}
