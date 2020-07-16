package nikhilMJun20.assignment27;

import nikhilMJun20.assignment27.MeetingRoom.MEETINGROOM;

public class MeetingRoomBookingService {
	public static void main(String[] args) {
		//Booking the Meeting Room 1
		MeetingRoom meetingRoom1 = new MeetingRoom();
		meetingRoom1.bookMeetingRoom();
		System.out.println();
		meetingRoom1.bookMeetingRoom(MEETINGROOM.TAKSHASHILA);
		System.out.println();
		meetingRoom1.bookMeetingRoom(MEETINGROOM.TAKSHASHILA, 3.5);
		System.out.println();
		meetingRoom1.bookMeetingRoom(MEETINGROOM.AGRAFORT, 2.5);
		System.out.println();
		meetingRoom1.bookMeetingRoom(MEETINGROOM.TAKSHASHILA, 1.5);
		System.out.println();
		//Booking the Meeting Room 2
		MeetingRoom meetingRoom2 = new MeetingRoom();
		meetingRoom2.bookMeetingRoom();
		System.out.println();
		meetingRoom2.bookMeetingRoom(MEETINGROOM.PRATPGADH);
		//Displaying Meeting Room info
		System.out.println();
		MeetingRoom.displayInfo();
		//Displaying Available rooms info
		System.out.println();
		MeetingRoom.displayAvilableMeetingRoomsForBooking();
	}
}
