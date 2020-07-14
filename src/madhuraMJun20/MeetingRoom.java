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
	String meetingRoomName = "Nalanda";
	int timing = 1;
	int counterN, counterT, counterA, counterP;

	void bookMeetingRoom() {
		displayInfo();
		this.counterN++;
	}

	void bookMeetingRoom(String meetingRoomName) {
		if (meetingRoomName.equals("Nalanda") && counterN == 0) {
			this.meetingRoomName = meetingRoomName;
			this.counterN++;
		} else if (meetingRoomName.equals("Takshashila") && counterT == 0) {
			this.meetingRoomName = meetingRoomName;
			this.counterT++;
		} else if (meetingRoomName.equals("AgraFort") && counterA == 0) {
			this.meetingRoomName = meetingRoomName;
			this.counterA++;
		} else if (meetingRoomName.equals("PratapGadh") && counterP == 0) {
			this.meetingRoomName = meetingRoomName;
			this.counterP++;
		} else
			System.out.println("Please enter valid meeting room name");
		displayInfo();
	}

	void bookMeetingRoom(String meetingRoomName, int timing) {

		if (meetingRoomName.equals("Nalanda") && counterN == 0) {
			this.meetingRoomName = meetingRoomName;
			this.counterN++;
		} else if (meetingRoomName.equals("Takshashila") && counterT == 0) {
			this.meetingRoomName = meetingRoomName;
			this.counterT++;
		} else if (meetingRoomName.equals("AgraFort") && counterA == 0) {
			this.meetingRoomName = meetingRoomName;
			this.counterA++;
		} else if (meetingRoomName.equals("PratapGadh") && counterP == 0) {
			this.meetingRoomName = meetingRoomName;
			this.counterP++;
		} else
			System.out.println("Please enter valid meeting room name");
		this.timing = timing;
		displayInfo();
	}

	void displayInfo() {
		System.out.println("Meeting room booked : " + meetingRoomName + ", For " + timing + " hour");
	}

	String displayAvilableMeetingRoomForBooking() {
		System.out.println("Available meeting rooms : ");
		if (counterN == 0) {
			return "Nalanda";
		}
		if (counterT == 0) {
			return "Takshashila";
		}
		if (counterA == 0) {
			return "AgraFort";
		}
		if (counterP == 0) {
			return "PratapGadh";
		}
		return "";
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		System.out.println("Meeting Room Names : Nalanda, Takshashila, AgraFort, PratapGadh");
		System.out.println("---------------------------------------------------------------");
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom("Takshashila");
		meetingRoom.bookMeetingRoom("PratapGadh", 2);
		System.out.println("---------------------------------------------------------------");
		System.out.println(meetingRoom.displayAvilableMeetingRoomForBooking());
	}
}