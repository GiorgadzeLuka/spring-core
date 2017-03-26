package beans;

public class Developer {
    private String name;
    private String skill;
    private int level;
    private boolean drinksCoffee;

    public Developer() {
    }

    public Developer(String name, String skill, int level, boolean drinksCoffee) {
        this.name = name;
        this.skill = skill;
        this.level = level;
        this.drinksCoffee = drinksCoffee;
    }

    public Developer(String name) {
        this.name = name;
    }

    public Developer(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isDrinksCoffee() {
        return drinksCoffee;
    }

    public void setDrinksCoffee(boolean drinksCoffee) {
        this.drinksCoffee = drinksCoffee;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", level=" + level +
                ", drinksCoffee=" + drinksCoffee +
                '}';
    }
}
