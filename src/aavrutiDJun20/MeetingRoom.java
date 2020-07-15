package aavrutiDJun20;

public class MeetingRoom {

	static boolean isNalandaBooked, isTakshashilaBooked, isAgraFortBooked, isPratapGadhBooked;
	static int nalandaBookinghour,takshashilaBookinghour, agraFortBookinghour, pratapGadhBookinghour;

	enum MEETINGROOMS{
		NALANDA,TAKSHASHILA,AGRAFORT,PRATAPGADH;
	}

	//Book Nalanda Meeting room for 1 hr
	void bookMeetingRoom() {
		if(!isNalandaBooked) {
			isNalandaBooked = true;
			nalandaBookinghour = 1;
			System.out.println("Nalanda Meeting room is booked for 1 hr.");
		}
		else {
			System.out.println("Nalanda Meeting Room is already Book");
		}		
		System.out.println("-----------------------------------------------");
	}

	//Book meeting Rooms for 1 hr by default
	void bookMeetingRoom(MEETINGROOMS meetingRoomName) {
		bookMeetingRoom(meetingRoomName,1);
	}

	//Book Meeting Rooms for flexible hrs
	void bookMeetingRoom(MEETINGROOMS meetingRoomName, int bookingHrs) {
		if(meetingRoomName == MEETINGROOMS.NALANDA && !isNalandaBooked) {
			isNalandaBooked = true;
			nalandaBookinghour = bookingHrs;
			System.out.println("Nalanda Meeting room is booked for " + nalandaBookinghour + " hr.");
		}
		else if (meetingRoomName == MEETINGROOMS.TAKSHASHILA && !isTakshashilaBooked) {
			isTakshashilaBooked = true;
			takshashilaBookinghour = bookingHrs;
			System.out.println("Takshashila Meeting room is booked for " + takshashilaBookinghour + " hrs.");
		}
		else if (meetingRoomName == MEETINGROOMS.AGRAFORT && !isAgraFortBooked) {
			isAgraFortBooked = true;
			agraFortBookinghour = bookingHrs;
			System.out.println("AgraFort Meeting room is booked for " + agraFortBookinghour + " hrs.");
		}
		else if (meetingRoomName == MEETINGROOMS.PRATAPGADH && !isPratapGadhBooked) {
			isPratapGadhBooked = true;
			pratapGadhBookinghour = bookingHrs;	
			System.out.println("PratapGadh Meeting room is booked for " + pratapGadhBookinghour + " hrs.");
		}
		else {
			System.out.println(meetingRoomName + " Meeting Room is already booked.\n");
			displayAvailableMeetingRoomForBooking();
		}
		System.out.println("-----------------------------------------------");
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
		System.out.println("-----------------------------------------------");
	}

	//Display Available Meeting Rooms
	void displayAvailableMeetingRoomForBooking() {				
		if(isNalandaBooked && isTakshashilaBooked && isAgraFortBooked && isPratapGadhBooked)
			System.out.println("Sorry, All meeting rooms are booked!!");
		else {
			System.out.println("Available Meeting Rooms are : ");
			if(!isNalandaBooked)
				System.out.println("Nalanda");
			if(!isTakshashilaBooked)
				System.out.println("Takshashila");
			if(!isAgraFortBooked)
				System.out.println("AgraFort");
			if(!isPratapGadhBooked)
				System.out.println("PratapGadh");
		}
		System.out.println("-----------------------------------------------");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.displayAvailableMeetingRoomForBooking();	
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.TAKSHASHILA);
		meetingRoom.bookMeetingRoom(MEETINGROOMS.TAKSHASHILA , 3);
		meetingRoom.bookMeetingRoom(MEETINGROOMS.PRATAPGADH , 3);
		meetingRoom.displayAvailableMeetingRoomForBooking();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.AGRAFORT , 4);
		meetingRoom.displayAvailableMeetingRoomForBooking();
		meetingRoom.displayInfo();
	}
}