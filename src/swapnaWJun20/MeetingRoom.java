package swapnaWJun20;

/* Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility:
meeting room names: Nalanda, Takshashila, AgraFort, and PratapGadh

a. If any user call method bookMeetingRoom() at that time“Nalanda” meeting room will be booked for 1 hr.
b. Write a method that helps to book a meeting room other than "Nalanda" for default timing would be 1 hr.
c. Write a method which helps to book a meeting room by giving the name of the meeting room and given hrs.
d. displayInfo() method should print booked meeting room info [i.e. meeting room,
booked for how many hrs].
e. displayAvilableMeetingRoomForBooking() method will print available meeting room names. 
     [i.e. If Nalanda and Takshashila is booked then this method should print "Available meeting rooms: AgraFort and 
     PratapGadh"] 
*/

public class MeetingRoom {

	private static boolean nalandaBookingstatus, takshashilaBookingstatus, agraFortBookingstatus,
			pratapGadhBookingstatus;
	private static int nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;

	enum MEETINGROOMS {
		NALANDA, TAKSHASHILA, AGRAFORT, PRATAPGADH;
	}

	void bookMeetingRoom() {
		if (!nalandaBookingstatus) {
			System.out.println("Nalanda Room is booked for 1 Hour");
			nalandaBookingstatus = true;
			nalandaBookingHours = 1;
		} else {
			System.out.println("Nalanda Meeting room is already booked");
			displayAvailableMeetingRoomForBooking();
		}
	}

	void bookMeetingRoom(MEETINGROOMS meetingRoom) {
		bookMeetingRoom(meetingRoom, 1);
	}

	void bookMeetingRoom(MEETINGROOMS meetingRoom, int hours) {
		if (meetingRoom.equals(MEETINGROOMS.NALANDA)) {
			if (!nalandaBookingstatus) {
				System.out.println(meetingRoom + " room is booked for " + hours + " Hour");
				nalandaBookingstatus = true;
				nalandaBookingHours = hours;
			} else {
				System.out.println(meetingRoom + " room is already booked for " + hours + " Hour");
				displayAvailableMeetingRoomForBooking();
			}
		} else if (meetingRoom.equals(MEETINGROOMS.TAKSHASHILA)) {
			if (!takshashilaBookingstatus) {
				System.out.println(meetingRoom + " room is booked for " + hours + " Hour");
				takshashilaBookingstatus = true;
				takshashilaBookingHours = hours;
			} else {
				System.out.println(meetingRoom + " room is already booked for " + hours + " Hour");
				displayAvailableMeetingRoomForBooking();
			}
		} else if (meetingRoom.equals(MEETINGROOMS.AGRAFORT)) {
			if (!agraFortBookingstatus) {
				System.out.println(meetingRoom + " room is booked for " + hours + " Hour");
				agraFortBookingstatus = true;
				agraFortBookingHours = hours;
			} else {
				System.out.println(meetingRoom + " room is already booked for " + hours + " Hour");
				displayAvailableMeetingRoomForBooking();
			}
		} else if (meetingRoom.equals(MEETINGROOMS.PRATAPGADH)) {
			if (!pratapGadhBookingstatus) {
				System.out.println(meetingRoom + " room is booked for " + hours + " Hour");
				pratapGadhBookingstatus = true;
				pratapGadhBookingHours = hours;
			} else {
				System.out.println(meetingRoom + " room is already booked for " + hours + " Hour");
				displayAvailableMeetingRoomForBooking();
			}
		}
	}

	void displayInfo() {
	//	System.out.println("--------Rooms Booking status----------");
		if (nalandaBookingstatus)
			System.out.println("Nalanda room is booked for " + nalandaBookingHours + " hours");
		if (agraFortBookingstatus)
			System.out.println("Agrafort room is booked for " + agraFortBookingHours + " hours");
		if (takshashilaBookingstatus)
			System.out.println("Takshashila room is booked for " + takshashilaBookingHours + " hours");
		if (pratapGadhBookingstatus)
			System.out.println("PratapGadh room is booked for " + pratapGadhBookingHours + " hours");
	}

	void displayAvailableMeetingRoomForBooking() {
	//	System.out.println("---------Available for booking------------");
		if (nalandaBookingstatus && agraFortBookingstatus && takshashilaBookingstatus && pratapGadhBookingstatus) {
			System.out.println("All meeting rooms are currently booked .");
		} else {
			if (!nalandaBookingstatus)
				System.out.println("Nalanda meeting room is available.");
			if (!takshashilaBookingstatus)
				System.out.println("Takshashila meeting room is available.");
			if (!agraFortBookingstatus)
				System.out.println("AgraFort meeting room is available.");
			if (!pratapGadhBookingstatus)
				System.out.println("PratapGadh meeting room is available.");
		}
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.AGRAFORT);
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.TAKSHASHILA, 5);
		System.out.println();
		meetingRoom.displayInfo();
		System.out.println();
		meetingRoom.displayAvailableMeetingRoomForBooking();
		System.out.println();

		MeetingRoom meetingRoom2 = new MeetingRoom();
		meetingRoom2.bookMeetingRoom(MEETINGROOMS.NALANDA);
		System.out.println();
		meetingRoom2.bookMeetingRoom(MEETINGROOMS.PRATAPGADH, 5);
		System.out.println();
		meetingRoom2.bookMeetingRoom(MEETINGROOMS.AGRAFORT);
	}
}
