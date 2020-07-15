
package ajitSJune20;

public class MeetingRoom {
	static boolean nalandaBookingStatus, takshashilaBookingStatus, agraFortBookingStatus, pratapGadhBookingStatus;
	static double nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;

	public enum MEETINGROOM {
		NALANDA, TAKSHASHILA, AGRAFORT, PRATAPGADH;
	}

	void bookMeetingRoom() {
		if (!nalandaBookingStatus) {
			System.out.println("NALANDA meeting room is booked for 1 hour");
			nalandaBookingStatus = true;
			nalandaBookingHours = 1;
		} else {
			System.out.println("NALANDA meeting room is booked for " + nalandaBookingHours + " hour(s) ");
			displayAvilableMeetingRoomForBooking();
		}
	}

	void bookMeetingRoom(MEETINGROOM meetingRoomName) {
		bookMeetingRoom(meetingRoomName, 1);
	}

	void bookMeetingRoom(MEETINGROOM meetingRoomName, double hours) {
		if (meetingRoomName.equals(MEETINGROOM.NALANDA)) {
			if (nalandaBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is currently booked for " + hours + " hr.");
				nalandaBookingStatus = true;
				nalandaBookingHours = hours;
			} else {
				System.out.println(
						meetingRoomName + " meeting room is currently booked for " + nalandaBookingHours + " hr.");
				displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoomName.equals(MEETINGROOM.TAKSHASHILA)) {
			if (takshashilaBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + " hr.");
				takshashilaBookingStatus = true;
				takshashilaBookingHours = hours;
			} else {
				System.out.println(
						meetingRoomName + " meeting room is currently booked for " + takshashilaBookingHours + " hr.");
				displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoomName.equals(MEETINGROOM.AGRAFORT)) {
			if (agraFortBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + " hr.");
				agraFortBookingStatus = true;
				agraFortBookingHours = hours;
			} else {
				System.out.println(
						meetingRoomName + " meeting room is already booked for " + agraFortBookingHours + " hr.");
				displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoomName.equals(MEETINGROOM.PRATAPGADH)) {
			if (pratapGadhBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + " hr.");
				pratapGadhBookingStatus = true;
				pratapGadhBookingHours = hours;
			} else {
				System.out.println(
						meetingRoomName + " meeting room is already booked for " + pratapGadhBookingHours + " hr.");
				displayAvilableMeetingRoomForBooking();
			}
		}
	}

	void displayInfo() {
		System.out.println("\n=============Meeting Room Booking Information===============");
		if (nalandaBookingStatus)
			System.out.println("NALANDA meeting room is booked for " + nalandaBookingHours + " hrs");
		if (takshashilaBookingStatus)
			System.out.println("TAKSHASHILA meeting room is booked for " + takshashilaBookingHours + " hrs");
		if (agraFortBookingStatus)
			System.out.println("AGRAFORT meeting room is booked for " + agraFortBookingHours + " hrs");
		if (pratapGadhBookingStatus)
			System.out.println("PRATAPGADH meeting room is booked for " + pratapGadhBookingHours + " hrs");
	}

	void displayAvilableMeetingRoomForBooking() {
		if (nalandaBookingStatus && takshashilaBookingStatus && agraFortBookingStatus && pratapGadhBookingStatus) {
			System.out.println("All meeting rooms are fully occupied/Booked...");
		} else {
			System.out.println("\nAvailable Meeting Rooms Are :- ");
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
		meetingRoom.bookMeetingRoom(MEETINGROOM.NALANDA);
		meetingRoom.displayAvilableMeetingRoomForBooking();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.TAKSHASHILA);
		meetingRoom.displayInfo();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.AGRAFORT, 3);
		System.out.println();
		MeetingRoom meetingRoom1 = new MeetingRoom();
		System.out.println();
		meetingRoom1.bookMeetingRoom(MEETINGROOM.AGRAFORT, 3);
		System.out.println();
		meetingRoom1.bookMeetingRoom(MEETINGROOM.PRATAPGADH, 3.5);
	}
}