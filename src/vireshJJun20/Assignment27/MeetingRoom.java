package vireshJJun20.Assignment27;

public class MeetingRoom {

	static String rName;
	static double duration = 1.00;
	static int nalandaCtr;
	static int takshashilaCtr;
	static int agraFortCtr;
	static int pratapGadhCtr;

	void bookMeetingRoom() { // “Nalanda” meeting room will be booked for 1 hr.
		if (nalandaCtr == 0) {
			this.rName = "Nalanda";
			nalandaCtr = 1;
		} else
			System.out.println("Nalanda is already booked");
	}

	void bookMeetingRoom(String rName) { // For booking meeting room other than Nalanda for 1 hr

		if (rName != "Nalanda") {
			this.rName = rName;
			if (rName.equalsIgnoreCase("Takshashila") && takshashilaCtr == 0)
				takshashilaCtr = 1;
			else if (rName.equalsIgnoreCase("AgraFort") && agraFortCtr == 0)
				agraFortCtr = 1;
			else if (rName.equalsIgnoreCase("PratapGadh") && pratapGadhCtr == 0)
				pratapGadhCtr = 1;
			else if (rName.equalsIgnoreCase("Nalanda"))
				System.out.println("Nalanda can not be booked");
			else
				System.out.println("Trying to book " + rName + " ? " + rName + " is already booked.");
		}
	}

	void bookMeetingRoom(String rName, double duration) { // To book a meeting room by giving the name of the meeting
															// room and given hrs.
		int tempCnt = 0;
		if (rName.equalsIgnoreCase("Nalanda") && nalandaCtr == 0) {
			nalandaCtr = 1;
			tempCnt = 1;
		}

		else if (rName.equalsIgnoreCase("Takshashila") && takshashilaCtr == 0) {
			takshashilaCtr = 1;
			tempCnt = 1;
		}

		else if (rName.equalsIgnoreCase("AgraFort") && agraFortCtr == 0) {
			agraFortCtr = 1;
			tempCnt = 1;
		}

		else if (rName.equalsIgnoreCase("PratapGadh") && pratapGadhCtr == 0) {
			pratapGadhCtr = 1;
			tempCnt = 1;
		}

		if (tempCnt == 0) {
			System.out.println("Trying to book " + rName + " ? " + "Meeting room " + rName + " is already booked.");
		} else {
			this.rName = rName;
			this.duration = duration;
		}
	}

	void displayInfo() { // print booked meeting room info
		System.out.println("meeting room: " + rName + " booked for : " + duration + " hrs.");
	}

	void displayAvilableMeetingRoomForBooking() { // It will print available meeting room name.
		int tempCnt = 0;
		System.out.println("Available meeting rooms: ");

		if (nalandaCtr == 0) {
			System.out.print(" - Nalanda");
			tempCnt = 1;
		}
		if (takshashilaCtr == 0) {
			System.out.println(" - Takshashila");
			tempCnt = 1;
		}
		if (agraFortCtr == 0) {
			System.out.println(" - AgraFort");
			tempCnt = 1;
		}
		if (pratapGadhCtr == 0) {
			System.out.println(" - PratapGadh");
			tempCnt = 1;
		}
		if (tempCnt == 0)
			System.out.print(" - No meeting room available");
	}

	public static void main(String[] args) {

		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom("Takshashila");
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom("Takshashila", 2.00);
		meetingRoom.bookMeetingRoom("AgraFort", 2.00);
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom("AgraFort");
		// meetingRoom.displayInfo();
		meetingRoom.displayAvilableMeetingRoomForBooking();
	}
}
