package HomeWork13;

import java.text.MessageFormat;
import java.util.List;

public class MissionReport {

    private String misssionName;
    private List<Alien> capturedAlien;
    private int squadSize;

    public MissionReport(String misssionName, List<Alien> capturedAlien, int squadSize) {
        this.misssionName = misssionName;
        this.capturedAlien = capturedAlien;
        this.squadSize = squadSize;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Миссия: {0} \n" +
                "Поймано пришельцев: {1} \n" +
                "Размер отряда: {2}", misssionName, capturedAlien.size(), squadSize);
    }
}
