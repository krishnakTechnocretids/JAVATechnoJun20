package technoCredits;
/*
 * Program to demonstrate overloading behavior.

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
public class MeetingRoom {

	private static boolean nalandaBookingStatus, takshashilaBookingStatus, agraFortBookingStatus, pratapGadhBookingStatus;
	private static int nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;

	void bookMeetingRoom() {
		if (!nalandaBookingStatus) {
			System.out.println("Nalanda meeting room is booked for 1hr.");
			nalandaBookingStatus = true;
			nalandaBookingHours = 1;
		} else {
			System.out.println("Nalanda meeting room is already booked.");
		}
	}

	void bookMeetingRoom(String meetingRoomName) {
		bookMeetingRoom(meetingRoomName, 1);
	}

	void bookMeetingRoom(String meetingRoomName, int hours) {
		if (meetingRoomName.equals("Nalanda")) {
			if (nalandaBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				nalandaBookingStatus = true;
				nalandaBookingHours = hours;
			} else {
				System.out.println(meetingRoomName + " meeting room is already booked for " + hours + "hr.");
				//displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoomName.equals("Takshashila")) {
			if (takshashilaBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				takshashilaBookingStatus = true;
				takshashilaBookingHours = hours;
			} else {
				System.out.println(meetingRoomName + " meeting room is already booked for " + hours + "hr.");
				displayAvilableMeetingRoomForBooking();
			}
		} else if (meetingRoomName.equals("AgraFort")) {
			if (agraFortBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				agraFortBookingStatus = true;
				agraFortBookingHours = hours;
			} else
				System.out.println(meetingRoomName + " meeting room is already booked for " + hours + "hr.");
		} else if (meetingRoomName.equals("PratapGadh")) {
			if (pratapGadhBookingStatus == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				pratapGadhBookingStatus = true;
				pratapGadhBookingHours = hours;
			} else
				System.out.println(meetingRoomName + " meeting room is already booked for " + hours + "hr.");
		}
	}

	void displayInfo() {
		System.out.println();
		if (nalandaBookingStatus)
			System.out.println("Nalanda meeting room is booked for " + nalandaBookingHours + "hr.");
		if (takshashilaBookingStatus)
			System.out.println("Takshashila meeting room is booked for " + takshashilaBookingHours + "hr.");
		if (agraFortBookingStatus)
			System.out.println("AgraFort meeting room is booked for " + agraFortBookingHours + "hr.");
		if (pratapGadhBookingStatus)
			System.out.println("PratapGadh meeting room is booked for " + pratapGadhBookingHours + "hr.");
	}

	void displayAvilableMeetingRoomForBooking() {
		System.out.println();
		if (!nalandaBookingStatus)
			System.out.println("Nalanda meeting room is available.");
		if (!takshashilaBookingStatus)
			System.out.println("Takshashila meeting room is available.");
		if (!agraFortBookingStatus)
			System.out.println("AgraFort meeting room is available.");
		if (!pratapGadhBookingStatus)
			System.out.println("PratapGadh meeting room is available.");
		
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.bookMeetingRoom("Takshashila");
		System.out.println();
		meetingRoom.bookMeetingRoom("AgraFort", 2);
		System.out.println();
		meetingRoom.bookMeetingRoom("Takshashila");
		meetingRoom.displayInfo();
		meetingRoom.displayAvilableMeetingRoomForBooking();
		
		MeetingRoom meetingRoom1 = new MeetingRoom();
		System.out.println();
		meetingRoom1.bookMeetingRoom("AgraFort", 3);
		System.out.println();

	}

}