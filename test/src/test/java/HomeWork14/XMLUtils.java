package HomeWork14;

import java.text.MessageFormat;

public class XMLUtils {

    public static String createEmptyElement(String tagName) {
        if (tagName == null || tagName.equals("null") || tagName.isEmpty()) {
            return "<invalid/>";
        }
        return MessageFormat.format("<{0}></{0}>", tagName);
    }
}
