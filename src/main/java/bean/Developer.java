package bean;

import java.util.Map;

public class Developer extends Engineer{
    private Map<String, Integer> frameworkToYears;
    private boolean drinksCoffee;

    public Map<String, Integer> getFrameworkToYears() {
        return frameworkToYears;
    }

    public void setFrameworkToYears(Map<String, Integer> frameworkToYears) {
        this.frameworkToYears = frameworkToYears;
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
                "frameworkToYears=" + frameworkToYears +
                ", drinksCoffee=" + drinksCoffee +
                "} " + super.toString();
    }
}
