package bean;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {
    private static List<Ticket> availableTickets = new ArrayList<>();
    private static List<Ticket> usedTickets = new ArrayList<>();

    static {
        availableTickets.add(new Ticket(1));
        availableTickets.add(new Ticket(2));
        availableTickets.add(new Ticket(3));
    }

    public List<Ticket> findAvailableTickets() {
        return availableTickets;
    }

    public boolean markTicketUsed(Ticket ticket) {
        System.out.println("Marking ticket: " + ticket.getId() + " as used");
        return availableTickets.remove(ticket) && usedTickets.add(ticket);
    }
}
