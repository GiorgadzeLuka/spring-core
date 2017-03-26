package bean;

import java.util.Set;

public class Manager implements Employee {
    private String name;
    private int emailPerHour;
    private Set<Engineer> engineers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmailPerHour() {
        return emailPerHour;
    }

    public void setEmailPerHour(int emailPerHour) {
        this.emailPerHour = emailPerHour;
    }

    public Set<Engineer> getEngineers() {
        return engineers;
    }

    public void setEngineers(Set<Engineer> engineers) {
        this.engineers = engineers;
    }

    public void initManager() {
        System.out.println(name + " will go through " + emailPerHour + " emails in the next hour.");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", emailPerHour=" + emailPerHour +
                ", engineers=" + engineers +
                '}';
    }
}
