import java.time.*;

class Workshop extends Event {

	private int number;
	private Speaker speaker;

	public Workshop(String description, LocalDate date, LocalTime time, String location, int number) {
		super(description, date, time, location);
		this.number = number;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.printf("%s speaking at '%s' (%d)\n", speaker.getName(), this.getDescription(), this.number);	
		this.speaker = speaker;
	}

}