package aadeshJun20;
public class MeetingRoom {
	static boolean nalandaBookingStatus, takshashilaBookingStatus, agraFortBookingStatus, pratapGadhBookingStatus;
	static int nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;

	enum MEETINGROOM {
		NALANDA, TAKSHASHILA, AGRAFORT, PRATPGADH;
	}

	void bookMeetingRoom() {
		if (!nalandaBookingStatus) {
			System.out.println(" Nalanda Meeting room is booked for 1 hr ");
			nalandaBookingStatus = true;
			nalandaBookingHours++;
		} else {
			System.out.println(" Nalanda Meeting room is already Booked.Try other meeting room ");
			availableRooms();
		}
	}

	void bookMeetingRoom(MEETINGROOM roomName) {
		if (roomName == MEETINGROOM.NALANDA)
			System.out.println(" \n Use default method to book Meeting room - Nalanda ");
		else
			bookMeetingRoom(roomName, 1);
	}

	void bookMeetingRoom(MEETINGROOM roomName, int hours) {
		if (roomName == MEETINGROOM.NALANDA) {
			if (!nalandaBookingStatus) {
				System.out.println(" \n Meeting room " + roomName + " is booked for " + hours + " hrs.");
				nalandaBookingStatus = true;
				nalandaBookingHours = hours;
			} else {
				System.out.println(" \n Meeting room " + roomName + " is already booked for " + nalandaBookingHours + " hrs.");
				availableRooms();
			}
		} else if (roomName == MEETINGROOM.TAKSHASHILA) {
			if (!takshashilaBookingStatus) {
				System.out.println(" \n Meeting room " + roomName + " is booked for " + hours + " hrs.");
				takshashilaBookingStatus = true;
				takshashilaBookingHours = hours;
			} else {
				System.out.println(" \n Meeting room " + roomName + " is already booked for " + takshashilaBookingHours + " hrs.");
				availableRooms();
			}
		} else if (roomName == MEETINGROOM.AGRAFORT) {
			if (!agraFortBookingStatus) {
				System.out.println(" \n Meeting room " + roomName + " is booked for " + hours + " hrs.");
				agraFortBookingStatus = true;
				agraFortBookingHours = hours;
			} else {
				System.out.println(" \n Meeting room " + roomName + " is already booked for " + agraFortBookingHours + " hrs.");
				availableRooms();
			}
		} else if (roomName == MEETINGROOM.PRATPGADH) {
			if (!pratapGadhBookingStatus) {
				System.out.println(" \n Meeting room " + roomName + " is booked for " + hours + " hrs.");
				pratapGadhBookingStatus = true;
				pratapGadhBookingHours = hours;
			} else {
				System.out.println(" \n Meeting room " + roomName + " is already booked for " + pratapGadhBookingHours + " hrs.");
				availableRooms();
			}
		}
	}

	void displayInfo() {
		System.out.println();
		System.out.println(" Booking Details of Meeting Rooms is: ");
		if (nalandaBookingStatus == true)
			System.out.println(" Nalanda Meeting room is booked for " + nalandaBookingHours + " hrs.");
		if (takshashilaBookingStatus == true)
			System.out.println(" Takshashila Meeting room is booked for " + takshashilaBookingHours + " hrs.");
		if (agraFortBookingStatus == true)
			System.out.println(" AgraFort Meeting room is booked for " + agraFortBookingHours + " hrs.");
		if (pratapGadhBookingStatus == true)
			System.out.println(" PratapGadh Meeting room is booked for " + pratapGadhBookingHours + " hrs.");
	}

	void availableRooms() {
		if (!nalandaBookingStatus && !takshashilaBookingStatus && !agraFortBookingStatus && !pratapGadhBookingStatus)
			System.out.println("\n All meeting romms are currently available for booking \n");
		else {
			if (nalandaBookingStatus && takshashilaBookingStatus && agraFortBookingStatus && pratapGadhBookingStatus)
				System.out.println("\n All Meeting Rooms are currently Booked \n");
			else {
				System.out.println("\n Meeting room Availabiity information \nAvailable Rooms:");
				if (!nalandaBookingStatus)
					System.out.println("NALANDA");
				if (!takshashilaBookingStatus)
					System.out.println("TAKSHSHILA");
				if (!agraFortBookingStatus)
					System.out.println("AGRAFORT");
				if (!pratapGadhBookingStatus)
					System.out.println("PRATAPGADH");
			}
		}
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.availableRooms();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom(MEETINGROOM.AGRAFORT);
		meetingRoom.displayInfo();
	    meetingRoom.bookMeetingRoom(MEETINGROOM.TAKSHASHILA, 2);
		meetingRoom.bookMeetingRoom(MEETINGROOM.PRATPGADH);
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom(MEETINGROOM.PRATPGADH,5);
		meetingRoom.displayInfo();
		meetingRoom.availableRooms();
	}
}