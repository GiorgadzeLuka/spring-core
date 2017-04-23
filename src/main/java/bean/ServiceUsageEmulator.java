package bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceUsageEmulator {

    public void emulate(AbstractApplicationContext context) {
        TicketBookingService bookingSystem = context.getBean(TicketBookingService.class);

        List<Ticket> tickets = bookingSystem.getAvailableTickets();
        bookingSystem.buyTicket(tickets.get(0));
    }
}
