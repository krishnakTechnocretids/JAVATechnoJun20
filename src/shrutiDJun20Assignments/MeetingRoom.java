package shrutiDJun20Assignments;

public class MeetingRoom {

	String room1 = "Nalanda";
	static double cnt1 = 0;
	String room2 = "Takshashila";
	static double cnt2 = 0;
	String room3 = "Agrafort";
	static double cnt3 = 0;
	String room4 = "PratapGadg";
	static double cnt4 = 0;

	void bookMeetingRoom() {
		cnt1++;
	}
	void bookMeetingRoom(String room) {
		if (room.equalsIgnoreCase(room2))
			cnt2++;
		else if (room.equalsIgnoreCase(room3))
			cnt3++;
		else if (room.equalsIgnoreCase(room4))
			cnt4++;
		else
			System.out.println("Please enter valid room name");
	}

	void bookMeetingRoom(String room, double hour) {
		if (room.equalsIgnoreCase(room1)) {
			cnt1 = cnt1 + hour;
		} else if (room.equalsIgnoreCase(room2)) {
			cnt2 = cnt2 + hour;
		} else if (room.equalsIgnoreCase(room3)) {
			cnt3 = cnt3 + hour;
		} else if (room.equalsIgnoreCase(room4)) {
			cnt4 = cnt4 + hour;
		} else {
			System.out.println("Please enter valid room name");
		}
	}

	void diplayInfo() {
		System.out.println("Booked room details:");
		if (cnt1 > 0) {
			System.out.println(room1 + " booked for " + cnt1 + " hrs");
		}
		if (cnt2 > 0) {
			System.out.println(room2 + " booked for " + cnt2 + " hrs");
		}
		if (cnt3 > 0) {
			System.out.println(room3 + " booked for " + cnt3 + " hrs");
		}
		if (cnt4 > 0) {
			System.out.println(room4 + " booked for " + cnt4 + " hrs");
		}
	}
	void displayAvilableMeetingRoomForBooking() {
		System.out.println("Available meeting rooms:");
		if (cnt1 == 0) {
			System.out.println(room1);
		}
		if (cnt2 == 0) {
			System.out.println(room2);
		}
		if (cnt3 == 0) {
			System.out.println(room3);
		}
		if (cnt4 == 0) {
			System.out.println(room4);
		}
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom("nalanda", 2.5);
		meetingRoom.bookMeetingRoom("nalAnda", 5);
		meetingRoom.bookMeetingRoom("agrAFort", 5);
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom("agrafort");
		meetingRoom.diplayInfo();
		System.out.println();
		meetingRoom.displayAvilableMeetingRoomForBooking();

	}

}
