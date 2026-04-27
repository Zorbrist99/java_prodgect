package HomeWork3;

import java.util.Arrays;
import java.util.Collections;

public class MarketingResearch {

    static void main(String[] args) {
        String[] shoppingCartPetr = {"chicken", "bananas", "curd"};
        String[] shoppingCartNikolay = {"chicken", "bananas", "curd"};
        String[] shoppingCartTerenty = {"beer", "dumplings", "weasel the magic of black"};

        // Сравнение корзин по количеству товаров
        comparingNumberOfProducts(shoppingCartPetr, shoppingCartNikolay);
        comparingNumberOfProducts(shoppingCartPetr, shoppingCartTerenty);

        // Сравнение содержимого корзин
        checkingCartContents(shoppingCartPetr, shoppingCartNikolay);
        checkingCartContents(shoppingCartPetr, shoppingCartTerenty);

        // Самые короткие слова
        String ShortPetrTitle = getShortestWord(shoppingCartPetr);
        String ShortNikolayTitle = getShortestWord(shoppingCartNikolay);
        String ShortTerentyTitle = getShortestWord(shoppingCartTerenty);
        String[] ShortValue = {ShortPetrTitle, ShortNikolayTitle, ShortTerentyTitle};
        Arrays.sort(ShortValue);
        System.out.println("Самое короткое слово: " + ShortValue[0]);

        // Самые длинные слова
        String LongPetrTitle = getLongestWord(shoppingCartPetr);
        String LongNikolayTitle = getLongestWord(shoppingCartNikolay);
        String LongTerentyTitle = getLongestWord(shoppingCartTerenty);
        String[] LongValue = {LongPetrTitle, LongNikolayTitle, LongTerentyTitle};
        Arrays.sort(LongValue, Collections.reverseOrder());
        System.out.println("Самое длинное слово: " + LongValue[0]);

        // Средняя длина слова
        int AverageLengthPetr = getAverageLengthProducts(shoppingCartPetr);
        int AverageLengthNikolay = getAverageLengthProducts(shoppingCartNikolay);
        int AverageLengthTerenty = getAverageLengthProducts(shoppingCartTerenty);
        int AverageLength = (AverageLengthPetr + AverageLengthNikolay + AverageLengthTerenty) / 3;
        System.out.println("Средняя длинна названия товара среди всех корзин: " + AverageLength);


    }

    public static void comparingNumberOfProducts(String[] shoppingCartOne, String[] shoppingCartTwo) {
        if (shoppingCartOne.length > shoppingCartTwo.length) {
            System.out.println("Первая корзина больше второй");
        } else if (shoppingCartOne.length < shoppingCartTwo.length) {
            System.out.println("Первая корзина меньше второй");
        } else {
            System.out.println("Корзина один идентична корзине два");
        }
    }

    public static void checkingCartContents(String[] shoppingCartOne, String[] shoppingCartTwo) {
        if (Arrays.equals(shoppingCartOne, shoppingCartTwo)) {
            System.out.println("Корзины идентичны по составу");
        } else {
            System.out.println("Корзины имеют разный состав");
        }
    }

    public static String getShortestWord(String[] shoppingCart) {
        String shortestTitle = shoppingCart[0];


        for (String s : shoppingCart) {
            if (shortestTitle.length() > s.length()) {
                shortestTitle = s;
            }
        }

        return shortestTitle;
    }

    public static String getLongestWord(String[] shoppingCart) {
        String longestTitle = "";


        for (String s : shoppingCart) {
            if (longestTitle.length() < s.length()) {
                longestTitle = s;
            }
        }

        return longestTitle;
    }

    public static Integer getAverageLengthProducts(String[] shoppingCart) {
        int sumLengthsNames = 0;

        for (String s : shoppingCart) {
            sumLengthsNames += s.length();
        }

        return sumLengthsNames / shoppingCart.length;
    }
}

