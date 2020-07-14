package abhishekSJun20;

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
public class MeetingRoom {
	int bookingTime;
	String selectedMeetingRoom;
	String[] rooms = { "Nalanda", "Takshashila", "AgraFort", "PratapGadh" };

	void bookMeetingRoom() {
		selectedMeetingRoom = "Nalanda";
		bookingTime = 1;
		displayInfo();
		for (int index = 0; index < rooms.length; index++) {
			if (rooms[index].equals("Nalanda")) {
				rooms[index] = " ";
			}
		}
	}

	void bookOtherMeetingRoom(String meetingRoomName) {
		if (!meetingRoomName.equals("Nalanda")) {
			selectedMeetingRoom = meetingRoomName;
			bookingTime = 1;
			for (int index = 0; index < rooms.length; index++) {
				if (rooms[index].equals(meetingRoomName)) {
					rooms[index] = " ";
				}
			}
			displayInfo();
		} else {
			System.out.println("The meeting room Nalanda is already booked.Please book any other meeting room");
		}

	}

	void bookOtherMeetingRoom(String meetingRoomName, int time) {
		selectedMeetingRoom = meetingRoomName;
		bookingTime = time;
		for (int index = 0; index < rooms.length; index++) {
			if (rooms[index].equals(meetingRoomName)) {
				rooms[index] = " ";
			}
		}
		displayInfo();
	}

	void displayInfo() {
		System.out.println("Meeting room " + selectedMeetingRoom + " is booked for " + bookingTime + " hour");
	}

	void displayAvilableMeetingRoomForBooking() {
		for (int index = 0; index < rooms.length; index++) {
			if (!rooms[index].equals(" "))
				System.out.println("Available meeting rooms : " + rooms[index]);
		}
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookOtherMeetingRoom("Nalanda");
		meetingRoom.bookOtherMeetingRoom("Takshashila");
		meetingRoom.bookOtherMeetingRoom("AgraFort", 1);
		meetingRoom.displayAvilableMeetingRoomForBooking();
	}

}