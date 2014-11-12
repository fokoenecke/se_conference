import java.time.*;

class Conference {
	public static void main(String[] args) {
		Workshop game_ai = new Workshop("AI in Games", LocalDate.of(2014, Month.JANUARY, 1), LocalTime.of(12,20,0,0), "Hall 1", 5);
		Speaker larry = new Speaker("Larry Page", "larry@google.com", Status.MEMBER, "Google");
		larry.hostWorkshop(game_ai);

		Attendee fok = new Attendee("Finn Ole Koenecke", "ole.koenecke@haw-hamburg.de", Status.STUDENT);
		fok.attendEvent(game_ai);
		fok.leaveEvent(game_ai);

		Event metallica = new Event("Metallica Show", LocalDate.of(2014, Month.JANUARY, 1), LocalTime.of(22,0,0,0), "Concert Hall");
		fok.attendEvent(metallica);
		larry.attendEvent(metallica);
	}
}