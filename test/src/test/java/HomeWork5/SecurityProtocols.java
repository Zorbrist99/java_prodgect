package HomeWork5;

import java.util.Random;

public class SecurityProtocols {


    static void main(String[] args) {
        String codeAccess = generateAccessCode();
        System.out.println(isValidCode(codeAccess, 8));
        logEvent("Server protection activated");
        logEvent("Intrusion attempt detected", true);
        System.out.println();
        System.out.println(generateAgentId("AGENT", 42));
        System.out.println(generateAgentId("AGENT", 77));
        System.out.println(generateAgentId("AGENT", 13));
    }

    public static String generateAccessCode() {
        int primer = (int) Math.pow(3, 7);
        return String.format("2026-%d", primer);
    }

    private static Boolean isValidCode(String code, int minLength) {
        if (code.equalsIgnoreCase("null")) {
            return false;
        } else if (code.length() < minLength) {
            return false;
        } else if (!code.contains("-")) {
            return false;
        } else {
            return true;
        }
    }

    public static void logEvent(String message) {
        System.out.printf("[INFO]{%s}%n", message);
    }

    public static void logEvent(String message, Boolean isCritical) {
        if (isCritical) {
            System.out.printf("[CRITICAL]{%s}", message);
        } else {
            logEvent(message);
        }
    }

    public static String generateAgentId(String prefix, int seed) {
        Random random = new Random(seed);
        int idAgent = random.nextInt(1000, 9999);
        return String.format("{%s}-{%d}", prefix, idAgent);
    }
}
