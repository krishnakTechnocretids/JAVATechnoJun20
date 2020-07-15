package shrutiDJun20Assignments;

public class MeetingRoom {

	boolean nalandaBookingStatus, takshashilaBookingStatus,
			agraFortBookingStatus, pratapGadhBookingStatus;
	static double nalandaBookingHours, takshashilaBookingHours,
			agraFortBookingHours, pratapGadhBookingHours;

	enum MEETINGROOMS {
		NALANDA, AGRAFORT, TAKSHASHILA, PRATAPGADH
	}

	void bookMeetingRoom() {
		if (nalandaBookingStatus == false) {
			System.out.println("NALANDA meeting room is booked for 1hr.");
			nalandaBookingStatus = true;
			nalandaBookingHours++;
		} else {
			System.out.println("NALANDA meeting room is already booked.");
		}
	}

	void bookMeetingRoom(MEETINGROOMS room) {
		if (room == MEETINGROOMS.NALANDA)
			System.out.println("Nalanda meeting room is already booked.");
		else
			bookMeetingRoom(room, 1);
	}

	void bookMeetingRoom(MEETINGROOMS room, double hours) {
		if (room == MEETINGROOMS.NALANDA) {
			if (nalandaBookingStatus == false) {
				System.out.println(MEETINGROOMS.NALANDA
						+ " meeting room is booked for " + hours + "hr.");
				nalandaBookingStatus = true;
				nalandaBookingHours = hours;
			} else
				System.out.println(MEETINGROOMS.NALANDA
						+ " meeting room is already booked for " + hours
						+ "hr.");
		} else if (room == MEETINGROOMS.AGRAFORT) {
			if (agraFortBookingStatus == false) {
				System.out.println(MEETINGROOMS.AGRAFORT
						+ " meeting room is booked for " + hours + "hr.");
				agraFortBookingStatus = true;
				agraFortBookingHours = hours;
			} else
				System.out.println(MEETINGROOMS.AGRAFORT
						+ " meeting room is already booked for " + hours
						+ "hr(s).");
		} else if (room == MEETINGROOMS.TAKSHASHILA) {
			if (takshashilaBookingStatus == false) {
				System.out.println(MEETINGROOMS.TAKSHASHILA
						+ " meeting room is booked for " + hours + "hr(s).");
				takshashilaBookingStatus = true;
				takshashilaBookingHours = hours;
			} else
				System.out.println(MEETINGROOMS.TAKSHASHILA
						+ " meeting room is already booked for " + hours
						+ "hr(s).");
		} else if (room == MEETINGROOMS.PRATAPGADH) {
			if (pratapGadhBookingStatus == false) {
				System.out.println(MEETINGROOMS.PRATAPGADH
						+ " meeting room is booked for " + hours + "hr(s)");
				pratapGadhBookingStatus = true;
				pratapGadhBookingHours = hours;
			} else
				System.out.println(MEETINGROOMS.PRATAPGADH
						+ " meeting room is already booked for " + hours
						+ "hr(s).");
		}

	}

	void displayInfo() {
		System.out.println();
		if (nalandaBookingStatus)
			System.out.println("Nalanda meeting room is booked for "
					+ nalandaBookingHours + "hr(s).");
		if (takshashilaBookingStatus)
			System.out.println("Takshashila meeting room is booked for "
					+ takshashilaBookingHours + "hr(s)");
		if (agraFortBookingStatus)
			System.out.println("AgraFort meeting room is booked for "
					+ agraFortBookingHours + "hr(s).");
		if (pratapGadhBookingStatus)
			System.out.println("PratapGadh meeting room is booked for "
					+ pratapGadhBookingHours + "hr(s).");
	}

	void displayAvilableMeetingRoomForBooking() {
		System.out.println();
		if (!nalandaBookingStatus)
			System.out.println("Nalanda meeting room is available.");
		if (!takshashilaBookingStatus)
			System.out.println("Takshashila meeting room is available.");
		if (!agraFortBookingStatus)
			System.out.println("AgraFort meeting room is available.");
		if (!pratapGadhBookingStatus)
			System.out.println("PratapGadh meeting room is available.");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		// meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.PRATAPGADH);
		meetingRoom.bookMeetingRoom(MEETINGROOMS.TAKSHASHILA, 20);
		meetingRoom.displayAvilableMeetingRoomForBooking();

	}

}
