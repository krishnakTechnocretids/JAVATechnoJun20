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

package rachanaGJun20.Assignment27;

public class MeetingRoom {

	static double roomNalanda = 0, roomTakshashila = 0, roomAgrafort = 0, roomPratapgadh = 0;
	
	// overloaded method which will book default 
	void bookMeetingRoom() {
		roomNalanda = 1;
		System.out.println("Your booking is accepted, room Nalanda has been booked for 1 hour");
	}
	//overloaded method which will book meeting room as per user choice for default 1 hr. 
	void bookMeetingRoom(String bookingRoomName) {

		if (checkAvailability(bookingRoomName, 1)) {
			System.out.println("Your Booking is accepted, room " + bookingRoomName + " has been booked for 1 hour.");
		} else
			System.out.println("Meeting room " + bookingRoomName + " is already booked");
	}
	//overloaded method which will book meeting room for number of hrs, as per user choice 
	void bookMeetingRoom(String bookingRoomName, double bookinghrs) {

		if (checkAvailability(bookingRoomName, bookinghrs)) {
			System.out.println("Your Booking is accepted, room " + bookingRoomName + " has been booked for "
					+ bookinghrs + " hour.");
		} else
			System.out.println("Meeting room " + bookingRoomName + " is already booked");

	}
	// method will show all booked meeting rooms
	void displayBookedMeetingRoom() {

		System.out.println("Booked Meeting rooms are:");
		if (roomNalanda > 0)
			System.out.println("Nalanda :" + roomNalanda + " hour");
		if (roomTakshashila > 0)
			System.out.println("Takshashila :" + roomNalanda + " hour");
		if (roomAgrafort > 0)
			System.out.println("AgraFort : " + roomAgrafort + " hour");
		if (roomPratapgadh > 0)
			System.out.println("Pratapgadh :" + roomPratapgadh + " hour");
	}
	//method will show all available meeting rooms
	void displayAvailableMeetingRoom() {

		System.out.println("Available meetingrooms are:");
		if (roomNalanda == 0)
			System.out.println("Nalanda");
		if (roomTakshashila == 0)
			System.out.println("Takshashila");
		if (roomAgrafort == 0)
			System.out.println("AgraFort");
		if (roomPratapgadh == 0)
			System.out.println("Pratapgadh");
	}
	// method will check meeting room's availability
	boolean checkAvailability(String meetingRoomBooking, double hr) {
		meetingRoomBooking = meetingRoomBooking.toUpperCase();

		switch (meetingRoomBooking) {
		case "NALANDA":
			if (roomNalanda == 0) {
				roomNalanda = hr;
				return true;
			} else
				return false;
		case "TAKSHASHILA":
			if (roomTakshashila == 0) {
				roomTakshashila = hr;
				return true;
			} else
				return false;
		case "AGRAFORT":
			if (roomAgrafort == 0) {
				roomAgrafort = hr;
				return true;
			} else
				return false;
		case "PRATAPGADH":
			if (roomPratapgadh == 0) {
				roomPratapgadh = hr;
				return true;
			} else
				return false;
		default:
			return false;
		}
	}

	public static void main(String[] args) {

		MeetingRoom meetingroom = new MeetingRoom();
		meetingroom.displayAvailableMeetingRoom();
		meetingroom.bookMeetingRoom();
		meetingroom.bookMeetingRoom("Takshashila");
		new MeetingRoom().bookMeetingRoom("Takshashila");
		meetingroom.displayAvailableMeetingRoom();
		meetingroom.bookMeetingRoom("AGRAFORT", 2);
		meetingroom.displayAvailableMeetingRoom();
		meetingroom.displayBookedMeetingRoom();
		

	}
}