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
	String[] meetingRoomNames = { "Nalanda", "Takshashila", "AgraFort", "PratapGadh" };
	int hours = 1;

	boolean booking(String meetingRoomName) {
		for (int index = 0; index < meetingRoomNames.length; index++) {
			if (meetingRoomNames[index].equals(meetingRoomName)) {
				meetingRoomNames[index] = "booked";
				return true;
			}
		}
		return false;
	}

	void bookMeetingRoom() {
		if (booking("Nalanda"))
			displayInfo("Nalanda", this.hours);
		else
			System.out.println("\nNalanda Meeting room is already booked");
	}

	void bookMeetingRoom(String meetingRoomName) {
		if (booking(meetingRoomName))
			displayInfo(meetingRoomName, this.hours);
		else
			System.out.println("\n" + meetingRoomName + " Meeting room is already booked");
	}

	void bookMeetingRoom(String meetingRoomName, int hours) {
		if (booking(meetingRoomName))
			displayInfo(meetingRoomName, hours);
		else
			System.out.println("\n" + meetingRoomName + " Meeting room is already booked");
	}

	void displayInfo(String meetingRoomName, int hours) {
		System.out.println("\nMeeting Room: " + meetingRoomName + " booked for " + hours + " hours");
	}

	void displayAvailableMeetingRoomForBooking() {
		int count = 0;
		System.out.println("\nBelow meeting rooms are available:");
		for (int index = 0; index < meetingRoomNames.length; index++) {
			if (!meetingRoomNames[index].equalsIgnoreCase("booked"))
				System.out.println(" ->" + meetingRoomNames[index]);
			else
				count++;
		}
		if (count == meetingRoomNames.length)
			System.out.println("Sorry, all the meeting rooms are booked at the moment");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.displayAvailableMeetingRoomForBooking();
		meetingRoom.bookMeetingRoom("Takshashila");
		meetingRoom.displayAvailableMeetingRoomForBooking();
		meetingRoom.bookMeetingRoom("AgraFort", 2);
		meetingRoom.bookMeetingRoom("AgraFort", 3);
		meetingRoom.bookMeetingRoom();
		meetingRoom.displayAvailableMeetingRoomForBooking();
		meetingRoom.bookMeetingRoom("PratapGadh");
		meetingRoom.displayAvailableMeetingRoomForBooking();
	}
}
