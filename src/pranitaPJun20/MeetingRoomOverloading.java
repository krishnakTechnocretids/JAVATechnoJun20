package pranitaPJun20;

public class MeetingRoomOverloading {
	int bookingTime;
	String selectedMeetingRoom;
	String[] rooms = { "Nalanda", "Takshashila", "AgraFort", "PratapGadh" };

	void bookMeetingRoom() {
		selectedMeetingRoom = "Nalanda";
		bookingTime = 1;
		displayInfo();
		for (int index = 0; index < rooms.length; index++) {
			if (rooms[index].equals("Nalanda")) {
				rooms[index] = " ";
			}
		}
	}

	void bookMeetingRoom(String meetingRoomName) {
		if (!meetingRoomName.equals("Nalanda")) {
			selectedMeetingRoom = meetingRoomName;
			bookingTime = 1;
			for (int index = 0; index < rooms.length; index++) {
				if (rooms[index].equals(meetingRoomName)) {
					rooms[index] = " ";
				}
			}
			displayInfo();
		} else {
			System.out.println("\nThe meeting room Nalanda is already booked.Please book any other meeting room");
		}

	}

	void bookMeetingRoom(String meetingRoomName, int time) {
		selectedMeetingRoom = meetingRoomName;
		bookingTime = time;
		for (int index = 0; index < rooms.length; index++) {
			if (rooms[index].equals(meetingRoomName)) {
				rooms[index] = " ";
			}
		}
		displayInfo();
	}

	void displayInfo() {
		System.out.println("\nMeeting room " + selectedMeetingRoom + " is booked for " + bookingTime + " hour");
	}

	void displayAvilableMeetingRoomForBooking() {
		for (int index = 0; index < rooms.length; index++) {
			if (!rooms[index].equals(" "))
				System.out.println("\nAvailable meeting rooms : " + rooms[index]);
		}

	}

	public static void main(String[] args) {
		MeetingRoomOverloading meetingRoomOverloading = new MeetingRoomOverloading();
		meetingRoomOverloading.bookMeetingRoom();
		meetingRoomOverloading.bookMeetingRoom("Nalanda");
		meetingRoomOverloading.bookMeetingRoom("Takshashila");
		meetingRoomOverloading.bookMeetingRoom("AgraFort", 1);
		meetingRoomOverloading.displayAvilableMeetingRoomForBooking();
	}

}
