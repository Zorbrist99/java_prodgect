package HomeWork4;

public class TestReport {

    static void main(String[] args) {
        int pass = 0;
        int flaky = 0;
        int bug = 0;
        int critical = 0;
        boolean showOnlyIssues = true;
        boolean stopSignal = true;


        for (int i = 1; i < 101; i++) {
            // Условие прерывания программы
            if (stopSignal) {
                if (critical == 3) {
                    System.out.println("Слишком много критических багов - буди тимлида!");
                    break;
                }
            }

            // Проверка числа на остаток от деления
            if (i % 5 == 0 & i % 3 == 0) {
                critical += 1;
                System.out.printf("Тест #%d: Critical!\n", i);
            }
            else if (i % 3 == 0) {
                flaky += 1;
                System.out.printf("Тест #%d: Flaky\n", i);
            }
            else if (i % 5 == 0) {
                bug += 1;
                System.out.printf("Тест #%d: Bug\n", i);
            }
            else {
                pass += 1;
                if (!showOnlyIssues) {
                    System.out.printf("Тест #%d: Pass\n", i);
                }
            }
        }

        System.out.printf("""
                =====ИТОГИ НОЧНОЙ СМЕНЫ=====
                Всего тестов: 100
                Pass:      %d
                Flaky:     %d
                Bug:       %d
                Critical:  %d
                """, pass, flaky, bug, critical);
    }
}
