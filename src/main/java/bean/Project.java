package bean;

import java.util.List;

public class Project {
    private String name;
    private List<Employee> engineers;

    public Project(List<Employee> engineers, String name) {
        this.engineers = engineers;
        this.name = name;
    }

    public void initProject() {
        System.out.println("Checking budget for the project " + name + " with " + engineers.size() + " engineers.");
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", engineers=" + engineers +
                '}';
    }

    public List<Employee> getEmployees() {
        return engineers;
    }

    public void setEmployees(List<Employee> engineers) {
        this.engineers = engineers;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void finishProject() {
        System.out.println("Project: " + name + " was finished");
    }
}
