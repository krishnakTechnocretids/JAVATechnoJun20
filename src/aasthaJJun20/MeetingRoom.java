package aasthaJJun20;
/*Assignment 27 : 14th July 2020

Program to demonstrate overloading behavior.

Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility:
meeting room names: Nalanda, Takshashila, AgraFort, and PratapGadh

a. If any user call method bookMeetingRoom() at that time "Nalanda" meeting room will be booked for 1 hr.
b. Write a method that helps to book a meeting room other than "Nalanda" for default timing would be 1 hr.
c. Write a method which helps to book a meeting room by giving the name of the meeting room and given hrs.
d. displayInfo() method should print booked meeting room info [i.e. meeting room,
booked for how many hrs].
e. displayAvailableMeetingRoomForBooking() method will print available meeting room names. 
     [i.e. If Nalanda and Takshashila is booked then this method should print "Available meeting rooms: AgraFort and 
     PratapGadh"] */

public class MeetingRoom {
	static boolean nalandaBookingStatus, takshashilaBookingStatus, agraFortBookingStatus, pratapGadhBookingStatus;
	static int nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;
	enum MEETINGROOMS {
		NALANDA, AGRAFORT, TAKSHASHILA, PRATAPGADH
	}
	
	//method to book the default - Nalanda meeting room
	void bookMeetingRoom() {
		if (!nalandaBookingStatus) {
			System.out.println("NALANDA meeting room is booked for 1 hr");
			nalandaBookingStatus = true;
			nalandaBookingHours++;
		} else {
			System.out.println("NALANDA meeting room is already booked");
		}
	}
	
	//method to book given meeting room for default time - 1 hr
	void bookMeetingRoom(MEETINGROOMS meetingRoom) {
		bookMeetingRoom(meetingRoom, 1);
	}
	
	//method to book given meeting room for given no. of hours
	void bookMeetingRoom(MEETINGROOMS meetingRoom, int hours) {
		if (meetingRoom == MEETINGROOMS.NALANDA) {
			if (!nalandaBookingStatus) {
				System.out.println(meetingRoom + " meeting room is booked for " + hours + " hr");
				nalandaBookingStatus = true;
				nalandaBookingHours = hours;
			} else
				System.out.println(meetingRoom + " meeting room is already booked for " + hours + " hr");
		} else if (meetingRoom == MEETINGROOMS.TAKSHASHILA) {
			if (!takshashilaBookingStatus) {
				System.out.println(meetingRoom + " meeting room is booked for " + hours + " hr");
				takshashilaBookingStatus = true;
				takshashilaBookingHours = hours;
			} else
				System.out.println(meetingRoom + " meeting room is already booked for " + hours + " hr");
		} else if (meetingRoom == MEETINGROOMS.AGRAFORT) {
			if (!agraFortBookingStatus) {
				System.out.println(meetingRoom + " meeting room is booked for " + hours + " hr");
				agraFortBookingStatus = true;
				agraFortBookingHours = hours;
			} else
				System.out.println(meetingRoom + " meeting room is already booked for " + hours + " hr");
		} else if (meetingRoom == MEETINGROOMS.PRATAPGADH) {
			if (!pratapGadhBookingStatus) {
				System.out.println(meetingRoom + " meeting room is booked for " + hours + " hr");
				pratapGadhBookingStatus = true;
				pratapGadhBookingHours = hours;
			} else
				System.out.println(meetingRoom + " meeting room is already booked for " + hours + " hr");
		}
	}
	
	//method to display the current status of all the meeting rooms
	void displayInfo() {
		System.out.println("Current Booking status:");
		if (nalandaBookingStatus)
			System.out.println("  ->NALANDA meeting room is booked for " + nalandaBookingHours + " hr");
		if (takshashilaBookingStatus)
			System.out.println("  ->TAKSHASHILA meeting room is booked for " + takshashilaBookingHours + " hr");
		if (agraFortBookingStatus)
			System.out.println("  ->AGRAFORT meeting room is booked for " + agraFortBookingHours + " hr");
		if (pratapGadhBookingStatus)
			System.out.println("  ->PRATAPGADH meeting room is booked for " + pratapGadhBookingHours + " hr");
	}
	
	//method to show the available meeting rooms
	void displayAvailableMeetingRoomForBooking() {
		if (nalandaBookingStatus && takshashilaBookingStatus && agraFortBookingStatus && pratapGadhBookingStatus) {
			System.out.println("Sorry, all the meeting rooms are booked at the moment");
		} else {
			System.out.println("Below meeting rooms are available for booking");
			if (!nalandaBookingStatus)
				System.out.println("  ->NALANDA");
			if (!takshashilaBookingStatus)
				System.out.println("  ->TAKSHASHILA");
			if (!agraFortBookingStatus)
				System.out.println("  ->AGRAFORT");
			if (!pratapGadhBookingStatus)
				System.out.println("  ->PRATAPGADH");
		}
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.displayAvailableMeetingRoomForBooking();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.TAKSHASHILA);
		System.out.println();
		meetingRoom.displayInfo();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.AGRAFORT, 2);
		System.out.println();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.displayAvailableMeetingRoomForBooking();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.PRATAPGADH, 3);
		System.out.println();
		MeetingRoom meetingRoom2 = new MeetingRoom();
		meetingRoom2.bookMeetingRoom();
		meetingRoom2.displayAvailableMeetingRoomForBooking();
		System.out.println();
		meetingRoom2.displayInfo();
	}
}
