import java.util.*;

class Speaker extends Attendee {
	
	private String company;
	private List<Workshop> speaksAt = new ArrayList<>();

	public Speaker(String name, String email, Status status, String company) {
		super(name, email, status);
		this.company = company;
	}

	public void hostWorkshop(Workshop workshop) {
		this.speaksAt.add(workshop);
		workshop.setSpeaker(this);
	}

	public void removeWorkshop(Workshop workshop) {
		this.speaksAt.remove(workshop);
		workshop.setSpeaker(null);
	}

}