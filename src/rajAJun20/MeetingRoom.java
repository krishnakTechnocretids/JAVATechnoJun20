package rajAJun20;

public class MeetingRoom {
	enum ROOMS {
		NALANDA, TAKSHASHILA, AGRAFORT, PRATPGADH;
	}

	static boolean nalandaBookingStatus, takshashilaBookingStatus, agraFortBookingStatus, pratapGadhBookingStatus;

	static int nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;

	void bookMeetingRoom() {
		if (!nalandaBookingStatus) { // Meeting room is not booked
			System.out.println("Nalanda Meeting Room is booked for 1 hour");
			nalandaBookingStatus = true; // Meeting room is booked
			nalandaBookingHours = 1;
		} else
			System.out.println("Nalada Meeting Room is already booked. Try for other available rooms...!");
		displayAvilableMeetingRoomForBooking();
	}

	void bookMeetingRoom(ROOMS roomName) {
		bookMeetingRoom(roomName, 1);
	}

	void bookMeetingRoom(ROOMS roomName, int hours) {
		if (roomName.equals(ROOMS.NALANDA)) {
			if (nalandaBookingStatus == false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hours");
				nalandaBookingStatus = true;
				nalandaBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");
			displayAvilableMeetingRoomForBooking();
		} else if (roomName.equals(ROOMS.TAKSHASHILA)) {
			if (takshashilaBookingStatus == false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hours");
				takshashilaBookingStatus = true;
				takshashilaBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");
			displayAvilableMeetingRoomForBooking();

		} else if (roomName.equals(ROOMS.AGRAFORT)) {
			if (agraFortBookingStatus == false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hours");
				agraFortBookingStatus = true;
				agraFortBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");
			displayAvilableMeetingRoomForBooking();
		} else if (roomName.equals(ROOMS.PRATPGADH)) {
			if (pratapGadhBookingStatus == false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hours");
				pratapGadhBookingStatus = true;
				pratapGadhBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");
			displayAvilableMeetingRoomForBooking();
		}
	}

	void displayInfo() {
		System.out.println("Booking Details of Rooms: ");
		if (nalandaBookingStatus == true)
			System.out.println("Nalanda Meeting room is booked for " + nalandaBookingHours + " hours");
		if (takshashilaBookingStatus == true)
			System.out.println("Takshashila Meeting room is booked for " + takshashilaBookingHours + " hours");
		if (agraFortBookingStatus == true)
			System.out.println("AgraFort Meeting room is booked for " + agraFortBookingHours + " hours");
		if (pratapGadhBookingStatus == true)
			System.out.println("PratapGadh Meeting room is booked for " + pratapGadhBookingHours + " hours");
	}

	void displayAvilableMeetingRoomForBooking() {
		if (nalandaBookingStatus && takshashilaBookingStatus && agraFortBookingStatus && pratapGadhBookingStatus)
			System.out.println("\nNo Rooms Available\n");
		else {
			System.out.println("\nAvailable Meeting Rooms:-");
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

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.displayAvilableMeetingRoomForBooking();
		System.out.println();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.bookMeetingRoom(ROOMS.TAKSHASHILA);
		System.out.println();
		meetingRoom.bookMeetingRoom(ROOMS.AGRAFORT, 2);
		System.out.println();
		meetingRoom.bookMeetingRoom(ROOMS.PRATPGADH, 4);
		System.out.println();
		meetingRoom.bookMeetingRoom(ROOMS.PRATPGADH, 3);
		meetingRoom.displayInfo();
		meetingRoom.displayAvilableMeetingRoomForBooking();
	}

}
