import bean.Ticket;
import bean.TicketBookingConfig;
import bean.TicketBookingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(TicketBookingConfig.class);

        TicketBookingService bookingSystem = context.getBean(TicketBookingService.class);

        List<Ticket> tickets = bookingSystem.getAvailableTickets();
        bookingSystem.buyTicket(tickets.get(0));
    }
}
