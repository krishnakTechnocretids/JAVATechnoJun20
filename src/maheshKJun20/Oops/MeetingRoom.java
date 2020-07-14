package maheshKJun20.Oops;

public class MeetingRoom {
	
	String[] meetingRoomName = {"Nalanda", "Takshashila", "AgraFort","PratapGadh"};
	String[][] meetingRoomBooked = new String[4][4];
	
	//Method to book default - Nalanda meeting room for 1 hr
	void bookMeetingRoom(){	
		bookMeetingRoom("Nalanda", "1");
	}
	
	//Method to book selected meeting room for 1 hour
	void bookMeetingRoom(String roomToBook){
		bookMeetingRoom(roomToBook, "1");
	}
	
	//Method to book selected meeting room for time period specified
	void bookMeetingRoom(String roomToBook, String bookingTime){
		int roomNumber = isValidMeetingRoom(roomToBook);
		if (roomNumber != -1){
			if (meetingRoomBooked[roomNumber][0] == null) {
				meetingRoomBooked[roomNumber][0] = roomToBook;
				meetingRoomBooked[roomNumber][1] = bookingTime; 
				System.out.println("\nBooking Success: Meeting Room " + meetingRoomBooked[roomNumber][0] + " booked successfully for " + meetingRoomBooked[roomNumber][1] + " hr");
			}else {
				System.out.println("\nBooking failed: Meeting Room " + roomToBook + " Already booked. Please try some other room");
			}
		}else {
			System.out.println("\nBooking Failed: Invalid Meeting Room name '"  + roomToBook + "'. Please select Valid meeting room for booking");
		}
		
	}
	
	//Method to Check the Meeting room selected for booking is valid
	int isValidMeetingRoom(String roomToBook) {
		int validRoom = -1;
		for (int index=0;index<meetingRoomName.length;index++) {
			if (meetingRoomName[index].toLowerCase().equals(roomToBook.toLowerCase())) {
				validRoom = index;
				break;
			}
		}
		return validRoom;
	}
	
	//Method to display info of meeting rooms which are booked currectly
	void displayInfo(){
		int count = 0;
		System.out.println("\nMeeting Rooms booked currently are below: ");
		for (int index=0;index<meetingRoomBooked.length;index++) {
			if (meetingRoomBooked[index][0]!=null) {
				System.out.println(meetingRoomBooked[index][0] + " booked for " + meetingRoomBooked[index][1] + " hrs");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("None of the meeting rooms are booked currently");
		}	
		
	}
	
	//Method to display Meeting rooms available for booking
	void displayAvailableMeetingRoom(){
		int count = 0;
		System.out.println("\nMeeting rooms available for booking are: ");
		for (int index=0;index<meetingRoomName.length;index++) {
			if (!meetingRoomName[index].equals(meetingRoomBooked[index][0])) {
				System.out.println(meetingRoomName[index]);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("None. All rooms are booked");
		}	
	}
	
	public static void main(String [] args){
			MeetingRoom meetingRoom = new MeetingRoom();
			meetingRoom.bookMeetingRoom();
			meetingRoom.bookMeetingRoom("Takshashila");
			meetingRoom.bookMeetingRoom("AgraFort", "1.5");
//			meetingRoom.bookMeetingRoom("PratapGadh");
			meetingRoom.bookMeetingRoom("AgraFort", "1.5");
			meetingRoom.displayInfo();
			meetingRoom.displayAvailableMeetingRoom();
	}
}
