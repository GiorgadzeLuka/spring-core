package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketBookingService {
    @Autowired
    private TicketRepository ticketRepository;

    public TicketBookingService() {
    }

    public TicketBookingService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAvailableTickets() {
        return ticketRepository.findAvailableTickets();
    }

    public boolean buyTicket(Ticket ticket) {
        return ticketRepository.markTicketUsed(ticket);
    }

}
