import java.time.*;
import java.util.*;

class Event {

	private String description;
	private LocalDate date;
	private LocalTime time;
	private String location;
	private List<Attendee> attendees = new ArrayList<>();

	public Event(String description, LocalDate date, LocalTime time, String location) {
		this.description = description;
		this.date = date;
		this.time = time;
		this.location = location;
	}

	public String getDescription(){
		return this.description;
	}

	public void addAttendee(Attendee attendee) {
		this.attendees.add(attendee);
		System.out.printf("%s now registered at '%s' \n", attendee.getName(), this.description);
	}

	public void removeAttendee(Attendee attendee) {
		this.attendees.remove(attendee);
		System.out.printf("%s now removed from '%s' \n", attendee.getName(), this.description);	
	}

}