package kartikeyDJune20;
import java.util.Scanner;
public class MeetingRoom {
//	Scanner scanner = new Scanner(System.in);
	static boolean nalandaBooked = false;
	static boolean takshilaBooked = false;
	static boolean agraFortBooked = false;
	static boolean pratapGardhBooked = false;
	static int nalandaBookingTime, takshilaBookingTime, agrafortBookingTime, pratapGrardhBookingTime;

	void bookMeetingRoom() {
		bookmeetigRoom("Nalanda");
	}

	void bookmeetigRoom(String roomName, int time) {
		roomName = roomName.toLowerCase();
		switch (roomName) {
		case "nalanda":
			if (nalandaBooked == false) {
				nalandaBooked = true;
				nalandaBookingTime = time;
			} else
				System.out.println("Meeting room you want is already booked");
			break;
		case "takshila":
			if (takshilaBooked == false) {
				takshilaBooked = true;
				takshilaBookingTime = time;
			} else
				System.out.println("Meeting room you want is already booked");
			break;
		case "agrafort":
			if (agraFortBooked == false) {
				agraFortBooked = true;
				agrafortBookingTime = time;
			} else
				System.out.println("Meeting room you want is already booked");
			break;
		case "pratapgardh":
			if (pratapGardhBooked == false) {
				pratapGardhBooked = true;
				pratapGrardhBookingTime = time;
			} else
				System.out.println("Meeting room you want is already booked");
			break;
		default:
			System.out.println("Meeting room provided is invalid");
			break;
		}
	}

	void bookmeetigRoom(String roomName) {
		bookmeetigRoom(roomName, 1);
	}

	void displayInfo() {
		if (nalandaBooked == true)
			System.out.println("Nalanada Meeting room is booked for " + nalandaBookingTime + " hrs");
		if (pratapGardhBooked == true)
			System.out.println("PratapGrardh Meeting room is booked for " + pratapGrardhBookingTime + " hrs");
		if (takshilaBooked == true)
			System.out.println("Takshila Meeting room is booked for " + takshilaBookingTime + " hrs");
		if (agraFortBooked == true)
			System.out.println("AgraFort Meeting room is booked for " + agrafortBookingTime + " hrs");
	}

	void availableMeetingRoom() {
		if (nalandaBooked == false)
			System.out.println("Nalanda meeting room is avaibale");
		if (pratapGardhBooked == false)
			System.out.println("PratapGarh meeting room is avaibale");
		if (agraFortBooked == false)
			System.out.println("AgraFort meeting room is avaibale");
		if (takshilaBooked == false)
			System.out.println("Takshila meeting room is avaibale");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookmeetigRoom("Takshila", 3);
		meetingRoom.bookmeetigRoom("agrafort");
		meetingRoom.displayInfo();
		System.out.println();
		meetingRoom.availableMeetingRoom();
		System.out.println("**********************************************");
	}

}
