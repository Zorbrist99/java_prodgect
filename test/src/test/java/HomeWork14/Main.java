package HomeWork14;


import org.junit.jupiter.api.Assertions;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import static HomeWork14.XMLUtils.createEmptyElement;

public class Main {
    static void main(String[] args) {

        System.out.println("Первая часть задания!");
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Интерстеллар", 8.7));
        movies.add(new Movie("Шрек", 8.1));
        movies.add(new Movie("Начало", 8.8));
        movies.add(new Movie("Веном", 6.6));
        System.out.println(movies);

        movies.sort(new MovieRatingComparator());
        System.out.println(movies);


        System.out.println("Вторая часть задания!");
        String expectedValueError = "<invalid/>";

        System.out.println("Test.1");
        String actualValueEmptyLine = createEmptyElement("");

        Assertions.assertEquals(expectedValueError, actualValueEmptyLine,
                MessageFormat.format(
                        "Тег который ожидаем мы: {0}, тег который вернул метод: {1}",
                        expectedValueError, actualValueEmptyLine));
        System.out.println("Test.1: Complete");

        System.out.println("Test.2");
        String actualValueNull = createEmptyElement("null");

        Assertions.assertEquals(expectedValueError, actualValueNull,
                MessageFormat.format(
                        "Тег который ожидаем мы: {0}, тег который вернул метод: {1}",
                        expectedValueError, actualValueNull));
        System.out.println("Test.2: Complete");

        System.out.println("Test.3");
        String expectedValue = "<primer></primer>";
        String actualValue = createEmptyElement("primer");

        Assertions.assertEquals(expectedValue, actualValue,
                MessageFormat.format(
                        "Тег который ожидаем мы: {0}, тег который вернул метод: {1}",
                        expectedValue, actualValue));
        System.out.println("Test.3: Complete");

        System.out.println("Test.4");
        String actualValueEmpty = createEmptyElement(null);

        Assertions.assertEquals(expectedValueError, actualValueEmpty,
                MessageFormat.format(
                        "Тег который ожидаем мы: {0}, тег который вернул метод: {1}",
                        expectedValueError, actualValueEmpty));
        System.out.println("Test.4: Complete");


    }
}
