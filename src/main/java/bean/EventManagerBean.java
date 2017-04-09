package bean;

import model.Event;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EventManagerBean {
    private static Set<Event> events = new HashSet<>();

    public void registerEvent(Event event) {
        events.add(event);
    }

    public Event findEventByName(String eventName) {
        Event resultEvent = null;
        for (Event event : events) {
            if (Objects.equals(event.getEventName(), eventName)) {
                resultEvent = event;
            }
        }
        return resultEvent;
    }

    public Set<Event> findEventsByDate(LocalDateTime fromDate, LocalDateTime toDate) {
        Set<Event> resultEvents = new HashSet<>();
        for (Event event : events) {
            LocalDateTime eventDate = event.getEventDate();
            if (eventDate.isAfter(fromDate) && eventDate.isBefore(toDate)) {
                resultEvents.add(event);
            }
        }
        return resultEvents;
    }

    public double getEventTicketPrice(String eventName) {
        Event event = findEventByName(eventName);
        return event != null ? event.getTicketPrice() : 0;
    }
}
