package anshuKJun20;

import java.util.Scanner;

public class MeetingRoom {
	static boolean nalandaBookingStatus, PratapgarhBookingStatus, takshashillaBookingStatus, agraBookingStatus;
	static int nalandaBookingHours, paratapgarhBookingHours, takshashillaBookingHours, agraFortBookingHours;

	enum MEETINGROOM {
		NALANDA, AGRAFORT, TAKSHASHILLA, PRATAPGARH;
	}

	void bookMeetingRoom() {
		if (!nalandaBookingStatus) {
			System.out.println("Nalanda meeting is booked for 1 hours");
			nalandaBookingStatus = true;
			nalandaBookingHours = 1;
		} else {
			System.out.println("Nalanda meeting room is already booked for 1 hour.");
		}
	}

	void bookMeetingRoom(MEETINGROOM meetingroom) {
		bookMeetingRoom(meetingroom, 1);
	}

	void bookMeetingRoom(MEETINGROOM meetingroom, int duration) {
		if (meetingroom == MEETINGROOM.NALANDA) {
			if (!nalandaBookingStatus) {
				System.out.println(meetingroom + " is booked for " + duration + " hour");
				nalandaBookingStatus = true;
				nalandaBookingHours = duration;
			} else {
				System.out.println("Sorry " + meetingroom + " meeting room is already booked for " + nalandaBookingHours
						+ " hour.");
			}
		} else if (meetingroom == MEETINGROOM.AGRAFORT) {
			if (!agraBookingStatus) {
				System.out.println(meetingroom + " is booked for " + duration + " hour");
				agraBookingStatus = true;
				agraFortBookingHours = duration;
			} else {
				System.out.println("Sorry " + meetingroom + " meeting room is already booked for "
						+ agraFortBookingHours + " hour.");
			}
		} else if (meetingroom == MEETINGROOM.PRATAPGARH) {
			if (!PratapgarhBookingStatus) {
				System.out.println(meetingroom + " is booked for " + duration + " hour");
				PratapgarhBookingStatus = true;
				paratapgarhBookingHours = duration;
			} else {
				System.out.println("Sorry " + meetingroom + " meeting room is already booked for "
						+ paratapgarhBookingHours + " hour.");
			}
		} else if (meetingroom == MEETINGROOM.TAKSHASHILLA) {
			if (!takshashillaBookingStatus) {
				System.out.println(meetingroom + " is booked for " + duration + " hour");
				takshashillaBookingStatus = true;
				takshashillaBookingHours = duration;
			} else {
				System.out.println("Sorry " + meetingroom + " meeting room is already booked for "
						+ takshashillaBookingHours + " hour.");
			}
		}
	}

	void displayBookingStatus() {
		System.out.println("Booking Status  :----");
		if (takshashillaBookingStatus) {
			System.out.println("Takshashilla meeting room is booked for " + takshashillaBookingHours + " hour.");
		}
		if (nalandaBookingStatus) {
			System.out.println("Nalanda meeting room is booked for " + nalandaBookingHours + " hour.");
		}
		if (agraBookingStatus) {
			System.out.println("AgraFort meeting room is booked for " + agraFortBookingHours + " hour.");
		}
		if (PratapgarhBookingStatus) {
			System.out.println("Pratapgarh meeting room is booked for " + paratapgarhBookingHours + " hour.");
		}
	}

	void displayAvailableMeetingRoom() {
		System.out.println("Currently available room :---");
		if (!takshashillaBookingStatus) {
			System.out.println("Takshashilla meeting room is available");
		}
		if (!nalandaBookingStatus) {
			System.out.println("Nalanda meeting room is available");
		}
		if (!agraBookingStatus) {
			System.out.println("Nalanda meeting room is available");
		}
		if (!PratapgarhBookingStatus) {
			System.out.println("Nalanda meeting room is available ");
		} else {
			System.out.println("All meeting rooms are booked.");
		}
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.AGRAFORT);
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.PRATAPGARH, 3);
		System.out.println();
		meetingRoom.displayBookingStatus();
		System.out.println();
		meetingRoom.displayAvailableMeetingRoom();
		System.out.println();

		MeetingRoom meetingRoom1 = new MeetingRoom();
		meetingRoom1.bookMeetingRoom(MEETINGROOM.AGRAFORT);
		System.out.println();
		meetingRoom1.bookMeetingRoom(MEETINGROOM.TAKSHASHILLA, 5);
		System.out.println();
		meetingRoom.displayBookingStatus();
		System.out.println();
		meetingRoom.displayAvailableMeetingRoom();
	}
}
