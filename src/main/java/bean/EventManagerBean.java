package bean;

import model.Event;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class EventManagerBean {
    private static Set<Event> events = new HashSet<>();

    public void registerEvent(Event event) {
        events.add(event);
    }

    public Event findEventByName(String eventName) {
        return events.stream()
                .filter(event -> Objects.equals(event.getEventName(), eventName))
                .findFirst()
                .get();
    }

    public Set<Event> findEventsByDate(LocalDateTime fromDate, LocalDateTime toDate) {
        return events.stream()
                .filter(event -> event.getEventDate().isAfter(fromDate) && event.getEventDate().isBefore(toDate))
                .collect(Collectors.toSet());
    }

    public double getEventTicketPrice(String eventName) {
        Event event = findEventByName(eventName);
        return event != null ? event.getTicketPrice() : 0;
    }
}
