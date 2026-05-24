package HomeWork7;

public class Mage extends Hero {

    private String mana;

    public Mage(String name, int level, int health, String mana) {
        super(name, level, health);
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println("Маг запускает огненный шар!");
    }
}
