package anshuKJun20;

import java.util.Scanner;

public class MeetingRoom {
	static Scanner scanner = new Scanner(System.in);
	static String[] bookingRoom = { "Nalanda", "Takshshilla", "Pratapgarh", "Agra-Fort" };
	String meetingRoomName;
	double duration;

	private String getRoomStatus(String name) {
		for (int index = 0; index < bookingRoom.length; index++) {
			if (bookingRoom[index] == name) {
				bookingRoom[index] = "0";
			}
		}
		return name;
	}

	void bookMeetingRoom() {
		this.meetingRoomName = getRoomStatus("Nalanda");
		this.duration = 1;
		display();
	}

	void bookMeetingRoom(String meetingRoomName) {
		if (meetingRoomName != "Nalanda") {
			this.meetingRoomName = getRoomStatus(meetingRoomName);
			this.duration = 1.00;
			display();
		} else {
			System.out.println("Sorry Nalanda meeting room is already booked.");
		}
			
	}

	void bookMeetingRoom(String meetingRoomName, double duration) {
		this.meetingRoomName = getRoomStatus(meetingRoomName);
		this.duration = duration;
		display();
	}
	
	void display() {
		System.out.println("Your Meeting is booked in " + this.meetingRoomName + " for " + this.duration+"hrs");
	}

	void displayAvailableRoom() {
		System.out.println("Currently available rooms are:");
		for (int index = 0; index < bookingRoom.length; index++) {
			if (bookingRoom[index] != "0") {
				System.out.println(bookingRoom[index] + " is available for your meeting.");
			}
		}
	}
	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom("Takshshilla");
		meetingRoom.bookMeetingRoom("Nalanda");
		meetingRoom.bookMeetingRoom("Pratapgarh", 3);
		meetingRoom.displayAvailableRoom();
	}
}
