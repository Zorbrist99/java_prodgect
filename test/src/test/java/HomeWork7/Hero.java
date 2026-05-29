package HomeWork7;

public class Hero {

    private String name;
    private int level;
    private int health;
    private final int MAX_LEVEL = 100;

    public static int heroesCreated;

    public Hero(String name, int level, int health) {
        setName(name);
        setLevel(level);
        setHealth(health);
        heroesCreated += 1;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("У персонажа обязательно должно быть имя");
        } else {
            this.name = name;
        }
    }

    public void setLevel(int level) {
        if (level < 0) {
            throw new IllegalArgumentException("Значение level у персонажа не может быть отрицательным");
        } else if (level > MAX_LEVEL) {
            throw new IllegalArgumentException("Значение level у персонажа не может быть больше 100");
        } else {
            this.level = level;
        }
    }

    public void setHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException("У персонажа не может быть значение health отрицательным");
        } else {
            this.health = health;
        }
    }

    public Hero() {

    }

    public void printInfo() {
        System.out.printf(
                "Имя героя: %s\n" +
                        "Уровень героя: %d\n" +
                        "Текущее здоровье героя: %d", name, level, health);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (damage < 0) {
            health = 0;
        }
    }

    public void levelUp() {
        level += 1;
        if (health > MAX_LEVEL) {
            health = MAX_LEVEL;
        }
    }

    public void attack() {
        System.out.println("Герой наносит обычный удар");
    }

    public void attack(String target) {
        System.out.printf("Герой наносит обычный удар. Цель: %s", target);
    }

    public void attack(String target, int items) {
        System.out.printf("Герой атакует цель %s %d раза", target, items);
    }

    public static void printHeroesCreated() {
        System.out.printf("Всего создано героев: %d", heroesCreated);
    }

    public final void rest() {
        System.out.println("Герой отдыхает и восстанавливает силы.");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}
