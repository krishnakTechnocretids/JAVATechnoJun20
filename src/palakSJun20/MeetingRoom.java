/*Program to demonstrate overloading behavior.

Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility:
meeting room names: Nalanda, Takshashila, AgraFort, and PratapGadh

a. If any user call method bookMeetingRoom() at that time“Nalanda” meeting room will be booked for 1 hr.
b. Write a method that helps to book a meeting room other than "Nalanda" for default timing would be 1 hr.
c. Write a method which helps to book a meeting room by giving the name of the meeting room and given hrs.
d. displayInfo() method should print booked meeting room info [i.e. meeting room,
booked for how many hrs].

e. displayAvilableMeetingRoomForBooking() method will print available meeting room names. 
     [i.e. If Nalanda and Takshashila is booked then this method should print "Available meeting rooms: AgraFort and 
     PratapGadh"] */
package palakSJun20;

public class MeetingRoom {
	enum MEETINGROOM {
		NALANDA, TAKSHASHILA, AGRAFORT, PRATAPGADH
	};

	static boolean isNalandaBooked, isTakshashilaBooked, isAgraBooked, isPratapBooked;
	static int nalandaHours, takshashilaHours, agraHours, pratapHours;

	void bookMeetingRoom() {
		if (!isNalandaBooked) {
			nalandaHours = 1;
			isNalandaBooked = true;
		} else
			System.out.println("Nalanda Meeting room is already booked");
	}

	void bookingMeetingRoom(MEETINGROOM meetingRoom) {
		bookingMeetingRoom(meetingRoom, 1);
	}

	void bookingMeetingRoom(MEETINGROOM meetingRoom, int hours) {
		if (meetingRoom.equals(MEETINGROOM.NALANDA)) {
			if (!isNalandaBooked) {
				nalandaHours = hours;
				isNalandaBooked = true;
			} else {
				System.out.println("Nalanda Meeting room is already booked");
			}
		}

		if (meetingRoom.equals(MEETINGROOM.TAKSHASHILA)) {
			if (!isTakshashilaBooked) {
				takshashilaHours = hours;
				isTakshashilaBooked = true;
			} else
				System.out.println("Takshashila Meeting room is already booked");
		}
		if (meetingRoom.equals(MEETINGROOM.AGRAFORT)) {
			if (!isAgraBooked) {
				agraHours = hours;
				isAgraBooked = true;
			} else
				System.out.println("AgraFort Meeting room is already booked");
		}

		if (meetingRoom.equals(MEETINGROOM.PRATAPGADH)) {
			if (!isPratapBooked) {
				pratapHours = hours;
				isPratapBooked = true;
			} else
				System.out.println("PratapGadh Meeting Room is already booked");
		}
	}

	void displayInfo() {
		System.out.println("\n--- Meeting Rooms Booked Details --- ");
		if (isNalandaBooked) {
			System.out.println("Nalada Meeting room is booked for " + nalandaHours + " hour");
		}
		if (isNalandaBooked) {
			System.out.println("Takshashila Meeting room is booked for " + takshashilaHours + " hour");
		}
		if (isAgraBooked) {
			System.out.println("AgraFort Meeting room is booked for " + agraHours + " hour");
		}
		if (isPratapBooked) {
			System.out.println("PratapGadh Meeting room is booked for " + pratapHours + " hour");
		}

	}

	// Printing Available Meeting Room
	void displayAvilableMeetingRoomForBooking() {
		System.out.println("\n--- Available Meeting Room ---");
		if (!isNalandaBooked) {
			System.out.println("Nalanda Meeting room is available for booking");
		}
		if (!isTakshashilaBooked) {
			System.out.println("TakshaShila Meeting room is available for booking");
		}
		if (!isAgraBooked) {
			System.out.println("AgraFort Meeting room is available for booking");
		}
		if (!isPratapBooked) {
			System.out.println("PrataGadh Meeting room is available for booking");
		}
		if (isNalandaBooked && isTakshashilaBooked && isAgraBooked && isPratapBooked) {
			System.out.println("Currently all Metting rooms are booked");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookingMeetingRoom(MEETINGROOM.TAKSHASHILA);
		meetingRoom.bookingMeetingRoom(MEETINGROOM.AGRAFORT, 5);
		meetingRoom.bookingMeetingRoom(MEETINGROOM.TAKSHASHILA, 3);
		meetingRoom.bookingMeetingRoom(MEETINGROOM.NALANDA);
		meetingRoom.displayInfo();
		meetingRoom.displayAvilableMeetingRoomForBooking();
	}
}