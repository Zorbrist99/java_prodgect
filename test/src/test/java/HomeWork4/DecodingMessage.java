package HomeWork4;

import java.util.Scanner;

public class DecodingMessage {

    static void main(String[] args) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        while (i < 5) {
            String partPassword = scanner.nextLine();
            if (partPassword.equalsIgnoreCase("NULL")) {
                System.out.println("Часть сообщения повреждена! Используем резервный формат...");
                stringBuilder.append("XX#");
            } else {
                stringBuilder.append(String.format("%s#", partPassword));
            }
            i++;
        }

        String decipheredMessage = stringBuilder.toString();
        System.out.printf("Расшифрованное послание: %s", decipheredMessage);


    }
}
