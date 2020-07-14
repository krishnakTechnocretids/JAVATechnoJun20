package vaishnaviVJun20_arrayExamples;

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

import java.util.Scanner;

public class MeetingRoom {

	int nalandaCount, takshashilaCount, agraFortCount, pratapGadhCount;

	void bookMeetingRoom() {
		nalandaCount++;
		displayInfo("Nalanda", 1);
	}

	void bookMeetingRoom(String meetingRoomName) {

		if (meetingRoomName.equals("Takshashila")) {
			takshashilaCount++;
			displayInfo(meetingRoomName, 1);
		} else if (meetingRoomName.equals("AgraFort")) {
			agraFortCount++;
			displayInfo(meetingRoomName, 1);
		} else if (meetingRoomName.equals("PratapGadh")) {
			pratapGadhCount++;
			displayInfo(meetingRoomName, 1);
		} else
			System.out.println("Inavlid Entry");
	}

	void bookMeetingRoom(String meetingRoomName, int hrs) {

		if (meetingRoomName.equals("Takshashila")) {
			takshashilaCount++;
			displayInfo(meetingRoomName, hrs);
		} else if (meetingRoomName.equals("AgraFort")) {
			agraFortCount++;
			displayInfo(meetingRoomName, hrs);
		} else if (meetingRoomName.equals("PratapGadh")) {
			pratapGadhCount++;
			displayInfo(meetingRoomName, hrs);
		} else if (meetingRoomName.equals("Nalanda")) {
			nalandaCount++;
			displayInfo(meetingRoomName, hrs);
		} else
			System.out.println("Inavlid Entry");

	}

	void displayInfo(String meetingRoomName, int hrs) {
		System.out.println("You have booked " + meetingRoomName + " for " + hrs + " hour");
	}

	void displayAvilableMeetingRoomForBooking() {
		if (nalandaCount == 0)
			System.out.println("Nalanda is available for booking");
		if (takshashilaCount == 0)
			System.out.println("Takshashila is available for booking");
		if (agraFortCount == 0)
			System.out.println("AgraFort is available for booking");
		if (pratapGadhCount == 0)
			System.out.println("PratapGadh is available for booking");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		Scanner scanner = new Scanner(System.in);
		meetingRoom.bookMeetingRoom();
		System.out.println("Which Meeting room would you like to book : Takshashila/AgraFort/PratapGadh ? ");
		String meetingRoomName = scanner.next();
		meetingRoom.bookMeetingRoom(meetingRoomName);
		System.out.println("Which Meeting room would you like to book and for how many hours : Takshashila/AgraFort/PratapGadh/Nalanda ? ");
		meetingRoomName = scanner.next();
		int hrs = scanner.nextInt();
		meetingRoom.bookMeetingRoom(meetingRoomName, hrs);
		meetingRoom.displayAvilableMeetingRoomForBooking();
		scanner.close();
	}

}
