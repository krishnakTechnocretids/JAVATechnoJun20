/*Assignment 27 : 14th July 2020
Program to demonstrate overloading behavior.
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

package amitaRJun20;

public class MeetingRoom {
	static boolean nalandaBookingStatus, takshashilaBookingStatus, agraFortBookingStatus, pratapGadhBookingStatus;
	static double nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;

	enum MEETINGROOM {
		NALANDA, TAKSHASHILA, AGRAFORT, PRATAPGADH;
	}

	void bookMeetingRoom() {
		if (!nalandaBookingStatus) {
			System.out.println("NALANDA meeting room is booked for 1hr.");
			nalandaBookingStatus = true;
			nalandaBookingHours = 1;
		} else {
			System.out.println("NALANDA meeting room is already booked for " + nalandaBookingHours + " hours ");
			displayAvilableMeetingRoomForBooking();
		}
	}

	void bookMeetingRoom(MEETINGROOM meetingRoomName) {
		bookMeetingRoom(meetingRoomName, 1.0);
	}

	void bookMeetingRoom(MEETINGROOM meetingRoomName, double hours) {
		if (meetingRoomName.equals(MEETINGROOM.NALANDA)) {
			if (nalandaBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				nalandaBookingStatus = true;
				nalandaBookingHours = hours;
			} else {
				System.out.println(
						meetingRoomName + " meeting room is already booked for " + nalandaBookingHours + "hr.");
				displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoomName.equals(MEETINGROOM.TAKSHASHILA)) {
			if (takshashilaBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				takshashilaBookingStatus = true;
				takshashilaBookingHours = hours;
			} else {
				System.out.println(
						meetingRoomName + " meeting room is already booked for " + takshashilaBookingHours + "hr.");
				displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoomName.equals(MEETINGROOM.AGRAFORT)) {
			if (agraFortBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				agraFortBookingStatus = true;
				agraFortBookingHours = hours;
			} else {
				System.out.println(
						meetingRoomName + " meeting room is already booked for " + agraFortBookingHours + "hr.");
				displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoomName.equals(MEETINGROOM.PRATAPGADH)) {
			if (pratapGadhBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				pratapGadhBookingStatus = true;
				pratapGadhBookingHours = hours;
			} else {
				System.out.println(
						meetingRoomName + " meeting room is already booked for " + pratapGadhBookingHours + "hr.");
				displayAvilableMeetingRoomForBooking();
			}
		}
	}

	void displayInfo() {
		System.out.println("\nBooking Room Information: --->");
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
			System.out.println("All meeting rooms are cureently booked...No room is available now");
		} else {
			System.out.println("\nMeeting Rooms Available Now :- ");
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
		meetingRoom.bookMeetingRoom();
		meetingRoom.displayAvilableMeetingRoomForBooking();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.TAKSHASHILA);
		meetingRoom.displayInfo();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.AGRAFORT, 2);
		System.out.println();
		meetingRoom.displayInfo();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.AGRAFORT, 3);
		System.out.println();
		MeetingRoom meetingRoom1 = new MeetingRoom();
		System.out.println();
		meetingRoom1.bookMeetingRoom(MEETINGROOM.PRATAPGADH, 2.5);
		System.out.println();
		meetingRoom1.bookMeetingRoom(MEETINGROOM.AGRAFORT, 2);
	}
}
