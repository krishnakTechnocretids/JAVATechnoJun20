package aavrutiDJun20;

public class MeetingRoom {

	boolean isNalandaBooked = false;
	boolean isTakshashilaBooked = false;
	boolean isAgraFortBooked = false;
	boolean isPratapGadhBooked = false;
	int nalandaBookinghour = 0;
	int takshashilaBookinghour = 0;
	int agraFortBookinghour = 0;
	int pratapGadhBookinghour = 0;

	//Book Nalanda Meeting room for 1 hr
	void bookMeetingRoom() {
		if(!isNalandaBooked) {
			isNalandaBooked = true;
			nalandaBookinghour = 1;
		}
		else {
			System.out.println("Nalanda Meeting Room is already Book");
		}
	}

	//Book meeting Rooms for 1 hr by default
	void bookMeetingRoom(String meetingRoomName) {
		if(verifyMeetingRoomName(meetingRoomName)) {
			if(meetingRoomName.equals("Nalanda"))
				System.out.println("Sorry, you can't book Nalanda Meeting Room from here.");
			else if (meetingRoomName.equals("Takshashila")) {
				isTakshashilaBooked = true;
				takshashilaBookinghour = 1;
			}
			else if (meetingRoomName.equals("AgraFort")) {
				isAgraFortBooked = true;
				agraFortBookinghour = 1;
			}
			else if (meetingRoomName.equals("PratapGadh")) {
				isPratapGadhBooked = true;
				pratapGadhBookinghour = 1;	
			}
		}
	}

	//Book Meeting Rooms for flexible hrs
	void bookMeetingRoom(String meetingRoomName, int bookingHrs) {
		if(verifyMeetingRoomName(meetingRoomName)) {
			if(bookingHrs<0){
				System.out.println("Please enter valid hours for booking meeting room");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			else if(meetingRoomName.equals("Nalanda") && isNalandaBooked == false) {
				isNalandaBooked = true;
				nalandaBookinghour = bookingHrs;
			}
			else if (meetingRoomName.equals("Takshashila") && isTakshashilaBooked == false) {
				isTakshashilaBooked = true;
				takshashilaBookinghour = bookingHrs;
			}
			else if (meetingRoomName.equals("AgraFort") && isAgraFortBooked == false) {
				isAgraFortBooked = true;
				agraFortBookinghour = bookingHrs;
			}
			else if (meetingRoomName.equals("PratapGadh") && isPratapGadhBooked == false) {
				isPratapGadhBooked = true;
				pratapGadhBookinghour = bookingHrs;	
			}
			else {
				System.out.println(meetingRoomName + " Meeting Room is already booked.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}
	}

	//Verify meeting room name is valid or not
	boolean verifyMeetingRoomName(String meetingRoomName) {
		if(!meetingRoomName.equals("Nalanda") && !meetingRoomName.equals("Takshashila") && !meetingRoomName.equals("AgraFort") && !meetingRoomName.equals("PratapGadh")) {
			System.out.println(meetingRoomName + " is invalid Meeting Room Name");
			return false;
		}
		else {
			return true;
		}
	}

	//Display Meeting Room Info
	void displayInfo() {
		if(!isNalandaBooked && !isTakshashilaBooked && !isAgraFortBooked && !isPratapGadhBooked)
			System.out.println("No rooms are booked");
		else {
			System.out.println("Meeting Rooms Details are as follows : \n");
			if(isNalandaBooked)
				System.out.println("Nalanda Meeting room is booked for " + nalandaBookinghour + " hrs.");
			if(isTakshashilaBooked)
				System.out.println("Takshashila Meeting room is booked for " + takshashilaBookinghour + " hrs.");
			if(isAgraFortBooked)
				System.out.println("AgraFort Meeting room is booked for " + agraFortBookinghour + " hrs.");
			if(isPratapGadhBooked)
				System.out.println("PratapGadh Meeting room is booked for " + pratapGadhBookinghour + " hrs.");
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	//Display Available Meeting Rooms
	void displayAvailableMeetingRoomForBooking() {				
		if(isNalandaBooked && isTakshashilaBooked && isAgraFortBooked && isPratapGadhBooked)
			System.out.println("Sorry, All meeting rooms are booked!!");
		else {
			System.out.println("Available Meeting Rooms are : ");
			if(isNalandaBooked == false)
				System.out.println("Nalanda");
			if(isTakshashilaBooked == false)
				System.out.println("Takshashila");
			if(isAgraFortBooked == false)
				System.out.println("AgraFort");
			if(isPratapGadhBooked == false)
				System.out.println("PratapGadh");
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.displayAvailableMeetingRoomForBooking();
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom("Takshashila");
		meetingRoom.bookMeetingRoom("Takshashila" , 3);
		meetingRoom.bookMeetingRoom("PratapGadh" , 3);
		meetingRoom.displayInfo();
		meetingRoom.displayAvailableMeetingRoomForBooking();
		meetingRoom.bookMeetingRoom("AgraFort" , 4);
		meetingRoom.displayInfo();
		meetingRoom.displayAvailableMeetingRoomForBooking();
		meetingRoom.bookMeetingRoom("aaaa" , 20);
	}
}