package swapnaWJun20;

/* Create a class MeetingRoom having method bookMeetingRoom which should provide
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

	String[] roomNames = { "Nalanda", "Takshashila", "AgraFort", "PratapGadh" };
	String optedRoom;
	int optedHours;

	void bookMeetingRoom() {
		optedRoom = "Nalanda";
		int index = 0;
		while (index < roomNames.length) {
			if (roomNames[index].equalsIgnoreCase("Nalanda")) {
				displayInfo(roomNames[index], 1);
				roomNames[index] = " ";
			}
			index++;
		}
	}

	void bookMeetingRoom(String room) {
		optedRoom = room;
		if (!optedRoom.equalsIgnoreCase("Nalanda")) {
			for (int index = 0; index < roomNames.length; index++) {
				if (roomNames[index].equalsIgnoreCase(room)) {
					displayInfo(roomNames[index], 1);
					roomNames[index] = " ";
					break;
				}
			}
		} else if (optedRoom.equalsIgnoreCase("Nalanda"))
			System.out.println("Nalanda meeting room is not available for booking");
		else
			System.out.println("Invalid selection of room");
	}

	void bookMeetingRoom(String room, int time) {
		optedRoom = room;
		optedHours = time;
		if (!optedRoom.equalsIgnoreCase("Nalanda")) {
			for (int index = 0; index < roomNames.length; index++) {
				if (roomNames[index].equalsIgnoreCase(room)) {
					displayInfo(roomNames[index], optedHours);
					roomNames[index] = " ";
					break;
				}
			}
		} else if (optedRoom.equalsIgnoreCase("Nalanda"))
			System.out.println("Nalanda meeting room is not available for booking");
		else
			System.out.println("Invalid selection of room");
	}

	void displayInfo(String room, int time) {
		System.out.println(optedRoom + " room is booked for " + time + " hours");
	}

	void displayAvilableMeetingRoomForBooking() {
		for (int index = 0; index < roomNames.length; index++) {
			if (!roomNames[index].equals(" ")) {
				System.out.println("Available meeting rooms for booking : " + roomNames[index]);
			}
		}
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom("AgraFort");
		meetingRoom.bookMeetingRoom("Takshashila", 5);
		meetingRoom.displayAvilableMeetingRoomForBooking();
	}
}
