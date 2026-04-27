package HomeWork3;

public class ValidatorPassword {

    static void main(String[] args) {
        String[] passwords = {"sdfdsf123423@", "dddsqz", "SDFff3345df"};

        for (String s : passwords) {
            if (!s.contains("qwerty") &
                    !s.contains("1234") &
                    !s.endsWith("z") &
                    !s.startsWith("1") &
                    s.length() > 8) {
                System.out.println("Пароль " + s + "прошел проверку: true");
            } else {
                System.out.println("Пароль " + s + "прошел проверку: false");
            }
        }
    }
}

