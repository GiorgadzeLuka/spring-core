package bean;

import model.Event;
import model.Ticket;
import model.User;

import java.util.HashSet;
import java.util.Set;

public class TicketManagerBean {
    private static Set<Ticket> tickets = new HashSet<>();

    public void buyTicket(Event event, User user) {
        Ticket ticket = new Ticket(event, user);
        user.addTicket(ticket);
        tickets.add(ticket);
    }

}
