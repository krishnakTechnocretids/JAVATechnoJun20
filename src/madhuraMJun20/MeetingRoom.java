/*Program to demonstrate overloading behavior.

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
package madhuraMJun20;

public class MeetingRoom {
	enum MEETINGROOMNAMES {
		NALANDA, TAKSHASHILA, AGRAFORT, PRATAPGADH;
	}

	static boolean nalandaAvailStatus, takshashilaAvailStatus, agraFortAvailStatus, pratapGadhAvailStatus;
	static int nalandaTiming, takshashilaTiming, agraFortTiming, pratapGadhTiming;

	void bookMeetingRoom() {
		if (!nalandaAvailStatus) {
			System.out.println("Meeting room booked : Nalanda, For 1 hour");
			nalandaAvailStatus = true;
			nalandaTiming = 1;
		} else
			System.out.println("Nalanda meeting room is already booked");
	}

	void bookMeetingRoom(MEETINGROOMNAMES meetingRoomName) {
		bookMeetingRoom(meetingRoomName, 1);
	}

	void bookMeetingRoom(MEETINGROOMNAMES meetingRoomName, int hours) {

		if (meetingRoomName.equals(MEETINGROOMNAMES.NALANDA)) {
			if (!nalandaAvailStatus) {
				System.out.println("Meeting room booked : " + meetingRoomName + ", For " + hours + " hour");
				nalandaAvailStatus = true;
				nalandaTiming = hours;
			} else {
				System.out.println("Meeting room " + meetingRoomName + " is already booked for " + hours + " hours");
			}
		} else if (meetingRoomName.equals(MEETINGROOMNAMES.TAKSHASHILA)) {
			if (!takshashilaAvailStatus) {
				System.out.println("Meeting room booked : " + meetingRoomName + ", For " + hours + " hour");
				takshashilaAvailStatus = true;
				takshashilaTiming = hours;
			} else {
				System.out.println("Meeting room " + meetingRoomName + " is already booked for " + hours + " hours");
			}
		} else if (meetingRoomName.equals(MEETINGROOMNAMES.AGRAFORT)) {
			if (!agraFortAvailStatus) {
				System.out.println("Meeting room booked : " + meetingRoomName + ", For " + hours + " hour");
				agraFortAvailStatus = true;
				agraFortTiming = hours;
			} else {
				System.out.println("Meeting room " + meetingRoomName + " is already booked for " + hours + " hours");
			}
		} else if (meetingRoomName.equals(MEETINGROOMNAMES.PRATAPGADH)) {
			if (!pratapGadhAvailStatus) {
				System.out.println("Meeting room booked : " + meetingRoomName + ", For " + hours + " hour");
				pratapGadhAvailStatus = true;
				pratapGadhTiming = hours;
			} else {
				System.out.println("Meeting room " + meetingRoomName + " is already booked for " + hours + " hours");
			}
		}
	}

	void displayInfo() {
		if (nalandaAvailStatus)
			System.out.println("Nalanda Meeting room is booked, For " + nalandaTiming + " hours");
		if (takshashilaAvailStatus)
			System.out.println("Takshashila Meeting room is booked, For " + takshashilaTiming + " hours");
		if (agraFortAvailStatus)
			System.out.println("AgraFort Meeting room is booked, For " + agraFortTiming + " hours");
		if (pratapGadhAvailStatus)
			System.out.println("PratapGadh Meeting room is booked, For " + pratapGadhTiming + " hours");
	}

	void displayAvilableMeetingRoomForBooking() {
		System.out.println("Available meeting rooms : ");
		if (!nalandaAvailStatus)
			System.out.println("Nalanda");
		if (!takshashilaAvailStatus)
			System.out.println("Takshashila");
		if (!agraFortAvailStatus)
			System.out.println("AgraFort");
		if (!pratapGadhAvailStatus)
			System.out.println("PratapGadh");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		System.out.println("Meeting Room Names : Nalanda, Takshashila, AgraFort, PratapGadh");
		System.out.println("---------------------------------------------------------------");
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom(MEETINGROOMNAMES.TAKSHASHILA);
		meetingRoom.bookMeetingRoom(MEETINGROOMNAMES.PRATAPGADH,3);
		System.out.println("---------------------------------------------------------------");
		meetingRoom.displayAvilableMeetingRoomForBooking();
		System.out.println("===============================================================");
	}
}