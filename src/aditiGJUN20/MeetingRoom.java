/*
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
     PratapGadh"] 
*/

package aditiGJUN20;

public class MeetingRoom {

	enum MEETINGROOM {
		NALANDA, TAKSHSHILA, AGRAFORT, PRATAPGADH
	}

	static int bookedHoursNalanda = 0, bookedHoursTakshashila = 0, bookedHoursAgraFort = 0, bookedHoursPratapGadh = 0;
	static boolean nalandaBookingStatus, takshshilaBookingStatus, agraFortBookingStatus, pratapGadhBookingStatus;

	void bookMeetingRoom() {
		if (!nalandaBookingStatus) {
			System.out.println("Nalanda Meeting room is booked for 1 hr");
			nalandaBookingStatus = true;
			bookedHoursNalanda++;
		} else {
			System.out.println("Nalanda Meeting room is already Booked.Try other meeting room");
			displayAvilableMeetingRoomForBooking();
		}
	}

	void bookMeetingRoom(MEETINGROOM meetingRoom) {

		if (meetingRoom == MEETINGROOM.NALANDA)
			System.out.println("\nUse default method to book Meeting room - Nalanda");
		else
			bookMeetingRoom(meetingRoom, 1);
	}

	void bookMeetingRoom(MEETINGROOM meetingRoom, int bookingHours) {
		if (meetingRoom == MEETINGROOM.NALANDA) {
			if (!nalandaBookingStatus) {
				System.out.println("\nMeeting room " + meetingRoom + " is booked for " + bookingHours + " hrs.");
				nalandaBookingStatus = true;
				bookedHoursNalanda = bookingHours;
			} else {
				System.out.println("\nMeeting room " + meetingRoom + " is already booked for " + bookedHoursNalanda + " hrs.");
				displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoom == MEETINGROOM.TAKSHSHILA) {
			if (!takshshilaBookingStatus) {
				System.out.println("\nMeeting room " + meetingRoom + " is booked for " + bookingHours + " hrs.");
				takshshilaBookingStatus = true;
				bookedHoursTakshashila = bookingHours;
			} else {
				System.out.println("\nMeeting room " + meetingRoom + " is already booked for " + bookedHoursTakshashila + " hrs.");
				displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoom == MEETINGROOM.AGRAFORT) {
			if (!agraFortBookingStatus) {
				System.out.println("\nMeeting room " + meetingRoom + " is booked for " + bookingHours + " hrs.");
				agraFortBookingStatus = true;
				bookedHoursAgraFort = bookingHours;
			} else {
				System.out.println("\nMeeting room " + meetingRoom + " is already booked for " + bookedHoursAgraFort + " hrs.");
				displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoom == MEETINGROOM.PRATAPGADH) {
			if (!pratapGadhBookingStatus) {
				System.out.println("\nMeeting room " + meetingRoom + " is booked for " + bookingHours + " hrs.");
				pratapGadhBookingStatus = true;
				bookedHoursPratapGadh = bookingHours;
			} else {
				System.out.println("\nMeeting room " + meetingRoom + " is already booked for " + bookedHoursPratapGadh + " hrs.");
				displayAvilableMeetingRoomForBooking();
			}
		}
	}

	void displayInfo() {
		System.out.println("\n---Meeting room Booking information---");
		if (nalandaBookingStatus)
			System.out.println("Meeting room NALANDA is booked for next -> " + bookedHoursNalanda + "hrs.");
		if (takshshilaBookingStatus)
			System.out.println("Meeting room TAKSHSHILA is booked for next -> " + bookedHoursTakshashila + "hrs.");
		if (agraFortBookingStatus)
			System.out.println("Meeting room AGRAFORT is booked for next -> " + bookedHoursAgraFort + "hrs.");
		if (pratapGadhBookingStatus)
			System.out.println("Meeting room PRATAPGADH is booked for next -> " + bookedHoursPratapGadh + " hrs.");
	}

	void displayAvilableMeetingRoomForBooking() {
		if (!nalandaBookingStatus && !takshshilaBookingStatus && !agraFortBookingStatus && !pratapGadhBookingStatus)
			System.out.println("\nAll meeting romms are currently available for booking\n");
		else {
			if (nalandaBookingStatus && takshshilaBookingStatus && agraFortBookingStatus && pratapGadhBookingStatus)
				System.out.println("\nAll meeting romms are currently Booked\n");
			else {
				System.out.println("\n---Meeting room Availabiity information--- \nAvailable Rooms:");
				if (!nalandaBookingStatus)
					System.out.println("NALANDA");
				if (!takshshilaBookingStatus)
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
		meetingRoom.displayAvilableMeetingRoomForBooking();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom(MEETINGROOM.AGRAFORT);
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom(MEETINGROOM.TAKSHSHILA, 5);
		meetingRoom.bookMeetingRoom(MEETINGROOM.AGRAFORT, 3);
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom(MEETINGROOM.PRATAPGADH, 4);
		meetingRoom.displayInfo();
		meetingRoom.displayAvilableMeetingRoomForBooking();
	}
}
