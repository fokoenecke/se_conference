import java.util.*;

public class Attendee {

	private String name;
	private String email;
	private List<Event> attended_events = new ArrayList<>();
	private Status status;

	public Attendee(String name, String email, Status status) {
		this.name = name;
		this.email = email;
		this.status = status;
		System.out.printf("new attendee: %s (%s)\n", name, email);
	}

	public String getName() {
		return this.name;
	}

	public void attendEvent(Event event) {
		System.out.printf("%s attending '%s' \n", this.name, event.getDescription());
		this.attended_events.add(event);
		event.addAttendee(this);
	}

	public void leaveEvent(Event event) {
		System.out.printf("%s has left '%s' \n", this.name, event.getDescription());
		this.attended_events.remove(event);
		event.removeAttendee(this);
	}

}