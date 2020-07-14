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

import java.time.LocalDate;

public class MeetingRoom {

	static {
		System.out.println("User can book meeting room for total 24 hours ");
		System.out.println("--------------------------------------------------");
	}

	String[] meetingRoomName = { "Nalanda", "Takshashila", "AgraFort", "PratapGadh" };
	static int bookedHoursNalanda = 0, bookedHoursTakshashila = 0, bookedHoursAgraFort = 0, bookedHoursPratapGadh = 0;
	final int maxBookinghours = 24;

	void bookMeetingRoom() {
		if (roomAvailibility("Nalanda") && bookedHoursNalanda < maxBookinghours)
			bookedHoursNalanda++;
		else
			System.out.println("Room is booked for next 24 hours. Try other meeting room");
	}

	void bookMeetingRoom(String meetingRoom) {
		if (!roomAvailibility(meetingRoom))
			return;
		if (!meetingRoom.equalsIgnoreCase("Nalanda")) {
			if (roomAvailibility("Takshashila") && bookedHoursTakshashila < maxBookinghours)
				bookedHoursTakshashila++;
			else if (roomAvailibility("AgraFort") && bookedHoursAgraFort < maxBookinghours)
				bookedHoursAgraFort++;
			else if (roomAvailibility("PratapGadh") && bookedHoursPratapGadh < maxBookinghours)
				bookedHoursPratapGadh++;
		} else {
			System.out.println("Use default method to book Meeting room - Nalanda");
		}

	}

	void bookMeetingRoom(String meetingRoom, int bookingHours) {
		if (!roomAvailibility(meetingRoom))
			return;
		if (meetingRoom.equalsIgnoreCase("Nalanda") && (bookedHoursNalanda + bookingHours) < maxBookinghours)
			bookedHoursNalanda += bookingHours;
		else if (meetingRoom.equalsIgnoreCase("Takshshila")
				&& (bookedHoursTakshashila + bookingHours) < maxBookinghours)
			bookedHoursTakshashila += bookingHours;
		else if (meetingRoom.equalsIgnoreCase("AgraFort") && (bookedHoursAgraFort + bookingHours) < maxBookinghours)
			bookedHoursAgraFort += bookingHours;
		else if (meetingRoom.equalsIgnoreCase("Pratapgadh") && (bookedHoursPratapGadh + bookingHours) < maxBookinghours)
			bookedHoursPratapGadh += bookingHours;
		else
			System.out.println("Meeting room " + meetingRoom + " can not be booked for" + bookingHours + " hours");
	}

	void displayInfo() {
		System.out.println("\n---Meeting room Booking information---");
		if (bookedHoursNalanda != 0)
			System.out.println("Meeting room Nalanda is booked for next -> " + bookedHoursNalanda + "hrs");
		if (bookedHoursTakshashila != 0)
			System.out.println("Meeting room Takshashila is booked for next -> " + bookedHoursTakshashila + "hrs");
		if (bookedHoursAgraFort != 0)
			System.out.println("Meeting room AgraFort is booked for next -> " + bookedHoursAgraFort + "hrs");
		if (bookedHoursPratapGadh != 0)
			System.out.println("Meeting room PratapGadh is booked for next -> " + bookedHoursPratapGadh + " hrs");
	}

	void displayAvilableMeetingRoomForBooking() {
		if (bookedHoursNalanda == 0 && bookedHoursTakshashila == 0 && bookedHoursAgraFort == 0
				&& bookedHoursPratapGadh == 0)
			System.out.println("\nAll meeting romms are available for booking\n");
		else {
			if (bookedHoursNalanda != 0 && bookedHoursTakshashila != 0 && bookedHoursAgraFort != 0
					&& bookedHoursPratapGadh != 0)
				System.out.println("\nAll meeting romms are currently Booked\n");
			else {
				System.out.println("\n---Meeting room Availabiity information--- \nAvailable Rooms:");
				if (bookedHoursNalanda == 0)
					System.out.println("Nalanda");
				if (bookedHoursTakshashila == 0)
					System.out.println("Takshshila");
				if (bookedHoursAgraFort == 0)
					System.out.println("AgraFort");
				if (bookedHoursPratapGadh == 0)
					System.out.println("PratapGadh");
			}
		}
	}

	boolean roomAvailibility(String meetingRoom) {
		meetingRoom = meetingRoom.toUpperCase();
		switch (meetingRoom) {
		case "NALANDA":
			if (bookedHoursNalanda < maxBookinghours)
				return true;

		case "TAKSHASHILA":
			if (bookedHoursTakshashila < maxBookinghours)
				return true;

		case "AGRAFORT":
			if (bookedHoursAgraFort < maxBookinghours)
				return true;

		case "PRATAPGADH":
			if (bookedHoursPratapGadh < maxBookinghours)
				return true;
		}
		System.out.println("Invalid Room name " + meetingRoom + "- Room can not be booked");
		return false;
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.displayAvilableMeetingRoomForBooking();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom("Nalanda");
		meetingRoom.bookMeetingRoom("RedFort");
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom("Takshashila");
		meetingRoom.bookMeetingRoom("AgraFort", 5);
		meetingRoom.displayInfo();
		meetingRoom.displayAvilableMeetingRoomForBooking();
		meetingRoom.bookMeetingRoom("Pratapgadh", 4);
		meetingRoom.bookMeetingRoom();
		meetingRoom.displayInfo();
	}
}
