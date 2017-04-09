package model;

import java.util.HashSet;
import java.util.Set;

public class User extends Person {
    private Set<Ticket> tickets = new HashSet<>();

    public User(String name) {
        super(name);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    @Override
    public String toString() {
        return "User: " + super.toString();
    }
}
