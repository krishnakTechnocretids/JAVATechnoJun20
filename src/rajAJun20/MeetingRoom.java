package rajAJun20;

public class MeetingRoom {
	
	int roomBookingTime;
	String selectedMeetingRoom;
	String[] totalRooms = { "Nalanda", "Takshashila", "AgraFort", "PratapGadh" };

	void bookMeetingRoom() {
		selectedMeetingRoom = "Nalanda";
		roomBookingTime = 1;
		displayInfo();
		for (int index = 0; index < totalRooms.length; index++) {
			if (totalRooms[index].equals("Nalanda")) {
				totalRooms[index] = " ";
			}
		}
	}

	void bookMeetingRoom(String otherMeetingRoomName) {
		if (!otherMeetingRoomName.equals("Nalanda")) {
			selectedMeetingRoom = otherMeetingRoomName;
			roomBookingTime = 1;
			for (int index = 0; index < totalRooms.length; index++) {
				if (totalRooms[index].equals(otherMeetingRoomName)) {
					totalRooms[index] = " ";
				}
			}
			displayInfo();
		} else {
			System.out.println("\nNalanda meeting room is already booked. Choose any other room for meeting !");
		}

	}

	void bookMeetingRoom(String meetingRoomName, int time) {
		selectedMeetingRoom = meetingRoomName;
		roomBookingTime = time;
		for (int index = 0; index < totalRooms.length; index++) {
			if (totalRooms[index].equals(meetingRoomName)) {
				totalRooms[index] = " ";
			}
		}
		displayInfo();
	}

	void displayInfo() {
		System.out.println("\nMeeting room " + selectedMeetingRoom + " is booked for " + roomBookingTime + " hour");
	}

	void displayAvailableMeetingRoomForBooking() {
		for (int index = 0; index < totalRooms.length; index++) {
			if (!totalRooms[index].equals(" "))
				System.out.println("\nAvailable rooms for Meeting are : " + totalRooms[index]);
		}

	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom("AgraFort");
		meetingRoom.bookMeetingRoom("PratapGadh", 1);
		meetingRoom.bookMeetingRoom("Nalanda");
		meetingRoom.displayAvailableMeetingRoomForBooking();
	}

}
