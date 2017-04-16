package bean

import spock.lang.Specification


class TicketBookingServiceSpec extends Specification {
    def repository = Mock(TicketRepository)
    def service = new TicketBookingService(repository)

    def "get available tickets should fetch available tickets"() {
        given:
        def tickets = [new Ticket(), new Ticket()]
        repository.findAvailableTickets() >> tickets

        when:
        def availableTickets = service.getAvailableTickets()

        then:
        availableTickets != null
        availableTickets == tickets
    }

    def "buy ticket should mark ticket as used"() {
        given:
        def ticket = new Ticket()

        when:
        service.buyTicket(ticket)

        then:
        1 * repository.markTicketUsed(ticket)
    }
}
