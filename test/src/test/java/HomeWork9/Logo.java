package HomeWork9;

import com.github.lalyos.jfiglet.FigletFont;
import net.datafaker.Faker;

import java.io.IOException;
import java.util.Random;

public class Logo {
    String[] surname = {"Bennett", "Hawthorne", "Kendall", "Sullivan", "Whitaker"};
    Random random = new Random();

    public String randomSurname() {
        return surname[random.nextInt(0, 5)];
    }

    static void main(String[] args) throws IOException {
        Logo logo = new Logo();
        Faker faker = new Faker();

        String oneSurname = logo.randomSurname();
        String separator = "&";
        String secondSurname = faker.name().lastName();

        System.out.println(FigletFont.convertOneLine(oneSurname));
        System.out.println(FigletFont.convertOneLine(separator));
        System.out.println(FigletFont.convertOneLine(secondSurname));

        System.out.println(faker.name().fullName());
        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.address().fullAddress());

    }
}
