package nikhilMJun20.assignment27;

public class MeetingRoomBookingService {
	public static void main(String[] args) {
		MeetingRoom[] meetingRoomArray  = new MeetingRoom[4];
		//Booking the Meeting Rooms
		meetingRoomArray[0] = new MeetingRoom().bookMeetingRoom();
		meetingRoomArray[1] = new MeetingRoom().bookMeetingRoom("Takshashila");
		meetingRoomArray[2] = new MeetingRoom().bookMeetingRoom("AgraFort", 2.5);
		meetingRoomArray[3] = new MeetingRoom().bookMeetingRoom("Nalanda");
		//Displaying Meeting Room info
		System.out.println("\n\nMeeting Room Booking Information:-");
		for(int index = 0; index<meetingRoomArray.length; index++) {
			if(meetingRoomArray[index] != null) {
				meetingRoomArray[index].displayInfo();
			}
		}
		//Available rooms info
		MeetingRoom.displayAvilableMeetingRoomForBooking(meetingRoomArray);
	}
}
