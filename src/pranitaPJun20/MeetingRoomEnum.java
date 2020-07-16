/*
 * Assignment 27 : 14th July 2020

Program to demonstrate overloading behavior.
WAP same program using enum type.
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
     PratapGadh"] 
 */
package pranitaPJun20;

public class MeetingRoomEnum {
	enum MEETINGROOM {
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
			System.out.println("Nalada Meeting Room is already Booked.");
		displayAvilableMeetingRoomForBooking();
	}

	void bookMeetingRoom(MEETINGROOM roomName) {
		bookMeetingRoom(roomName, 1);
	}

	void bookMeetingRoom(MEETINGROOM roomName, int hours) {
		if (roomName.equals(MEETINGROOM.NALANDA)) {
			if (nalandaBookingStatus == false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hours");
				nalandaBookingStatus = true;
				nalandaBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");
			displayAvilableMeetingRoomForBooking();
		} else if (roomName.equals(MEETINGROOM.TAKSHASHILA)) {
			if (takshashilaBookingStatus == false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hours");
				takshashilaBookingStatus = true;
				takshashilaBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");
			displayAvilableMeetingRoomForBooking();

		} else if (roomName.equals(MEETINGROOM.AGRAFORT)) {
			if (agraFortBookingStatus == false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hrours");
				agraFortBookingStatus = true;
				agraFortBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");
			displayAvilableMeetingRoomForBooking();
		} else if (roomName.equals(MEETINGROOM.PRATPGADH)) {
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
			System.out.println("\nAll meeting romms are currently Booked\n");
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
		MeetingRoomEnum meetingRoomEnum = new MeetingRoomEnum();
		meetingRoomEnum.displayAvilableMeetingRoomForBooking();
		System.out.println();
		meetingRoomEnum.bookMeetingRoom();
		System.out.println();
		meetingRoomEnum.bookMeetingRoom(MEETINGROOM.AGRAFORT);
		System.out.println();
		meetingRoomEnum.bookMeetingRoom(MEETINGROOM.TAKSHASHILA, 2);
		System.out.println();
		meetingRoomEnum.bookMeetingRoom(MEETINGROOM.AGRAFORT, 2);
		System.out.println();
		meetingRoomEnum.bookMeetingRoom(MEETINGROOM.PRATPGADH, 3);
		meetingRoomEnum.displayInfo();
		meetingRoomEnum.displayAvilableMeetingRoomForBooking();
	}
}
