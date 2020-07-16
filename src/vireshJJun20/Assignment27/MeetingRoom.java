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
Note: Using enum
*/
package vireshJJun20.Assignment27;

public class MeetingRoom {

	static int nalandaCtr, takshashilaCtr, agraFortCtr, pratapGadhCtr, nalandahours, takshashilahours, agraforthours, pratapgadhahours;

	enum MEETINGROOM {
		NALANDA, TAKSHASHILA, AGRAFORT, PRATAPGADH
	}

	// “Nalanda” meeting room will be booked for 1 hr.
	void bookMeetingRoom() {
		if (nalandaCtr == 0) {
			System.out.println("Booking NALANDA Confirmed.");
			nalandaCtr = 1;
			nalandahours += 1;
		} else
			System.out.println(MEETINGROOM.NALANDA + " is already booked");
	}

	// For booking meeting room other than Nalanda for 1 hr.
	void bookMeetingRoom(MEETINGROOM mRoom) {
		bookMeetingRoom(mRoom, 1);
	}

	// To book a meeting room by giving the name of the meeting room and given hrs.
	void bookMeetingRoom(MEETINGROOM mRoom, int duration) {
		if (mRoom == MEETINGROOM.NALANDA && nalandaCtr == 0) {
			System.out.println("Booking NALANDA Confirmed");
			nalandaCtr = 1;
			nalandahours += duration;
		} else if (mRoom == MEETINGROOM.TAKSHASHILA && takshashilaCtr == 0) {
			System.out.println("Booking TAKSHASHILA Confirmed");
			takshashilaCtr = 1;
			takshashilahours += duration;
		} else if (mRoom == MEETINGROOM.AGRAFORT && agraFortCtr == 0) {
			System.out.println("Booking AGRAFORT Confirmed");
			agraFortCtr = 1;
			agraforthours += duration;
		} else if (mRoom == MEETINGROOM.PRATAPGADH && pratapGadhCtr == 0) {
			System.out.println("Booking PRATAPGADH Confirmed");
			pratapGadhCtr = 1;
			pratapgadhahours += duration;
		} else {
			System.out.println("Trying to book " + mRoom + " again? " + " This meeting room is already booked.");
		}
	}

	// print booked meeting room info
	void displayInfo() {
		System.out.println(" -- Booking Status : ");
		if (nalandaCtr == 1)
			System.out.println("Meeting room " + MEETINGROOM.NALANDA + " is booked for : " + nalandahours + " hrs.");
		if (takshashilaCtr == 1)
			System.out.println(
					"Meeting room " + MEETINGROOM.TAKSHASHILA + " is booked for : " + takshashilahours + " hrs.");
		if (agraFortCtr == 1)
			System.out.println("Meeting room " + MEETINGROOM.AGRAFORT + " is booked for : " + agraforthours + " hrs.");
		if (pratapGadhCtr == 1)
			System.out.println("Meeting room " + MEETINGROOM.PRATAPGADH + " is booked for : " + pratapgadhahours + " hrs.");
	}

	// It will print available meeting room name.
	void displayAvilableMeetingRoomForBooking() {
		System.out.println("Available meeting rooms: ");
		if (nalandaCtr == 0)
			System.out.println(" - " + MEETINGROOM.NALANDA);
		if (agraFortCtr == 0)
			System.out.println(" - " + MEETINGROOM.AGRAFORT);
		if (takshashilaCtr == 0)
			System.out.println(" - " + MEETINGROOM.TAKSHASHILA);
		if (pratapGadhCtr == 0)
			System.out.println(" - " + MEETINGROOM.PRATAPGADH);
		else
			System.out.print(" - All meeting rooms are currenty booked.");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.NALANDA);
		System.out.println();
		meetingRoom.displayAvilableMeetingRoomForBooking();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.AGRAFORT);
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.TAKSHASHILA, 3);
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.PRATAPGADH, 2);
		System.out.println();
		meetingRoom.displayInfo();
		System.out.println();
		meetingRoom.displayAvilableMeetingRoomForBooking();
	}
}