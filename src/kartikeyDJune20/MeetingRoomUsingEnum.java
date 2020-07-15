package kartikeyDJune20;


public class MeetingRoomUsingEnum {
	enum meeetingRooms{
		
		NALANDA, TAKSHILA, AGRAFORT, PRATAPGARDH;
	}
	static boolean nalandaBooked = false;
	static boolean takshilaBooked = false;
	static boolean agraFortBooked = false;
	static boolean pratapGardhBooked = false;
	static int nalandaBookingTime, takshilaBookingTime, agrafortBookingTime, pratapGrardhBookingTime;

	void bookMeetingRoom() {
		bookmeetigRoom(meeetingRooms.NALANDA);
	}

	void bookmeetigRoom(meeetingRooms roomName, int time) {
		switch (roomName) {
		case NALANDA:
			if (nalandaBooked == false) {
				nalandaBooked = true;
				nalandaBookingTime = time;
			} else
				System.out.println(roomName+" room you want is already booked for "+nalandaBookingTime+" hrs");
			break;
		case TAKSHILA:
			if (takshilaBooked == false) {
				takshilaBooked = true;
				takshilaBookingTime = time;
			} else
				System.out.println(roomName+" room you want is already booked for "+takshilaBookingTime+" hrs");
			break;
		case AGRAFORT:
			if (agraFortBooked == false) {
				agraFortBooked = true;
				agrafortBookingTime = time;
			} else
				System.out.println(roomName+" room you want is already booked for "+agrafortBookingTime+" hrs");
			break;
		case PRATAPGARDH:
			if (pratapGardhBooked == false) {
				pratapGardhBooked = true;
				pratapGrardhBookingTime = time;
			} else
				System.out.println(roomName+" room you want is already booked for "+pratapGrardhBookingTime+" hrs");
			break;
		default:
			System.out.println("Meeting room provided is invalid");
			break;
		}
	}

	void bookmeetigRoom(meeetingRooms roomName) {
		bookmeetigRoom(roomName, 1);
	}

	void displayInfo() {
		if (nalandaBooked == true)
			System.out.println("Nalanda Meeting room is booked for " + nalandaBookingTime + " hrs");
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
		MeetingRoomUsingEnum meetingRoomUsingEnum = new MeetingRoomUsingEnum();
		meetingRoomUsingEnum.bookMeetingRoom();
		meetingRoomUsingEnum.bookmeetigRoom(meeetingRooms.PRATAPGARDH, 3);
		meetingRoomUsingEnum.bookmeetigRoom(meeetingRooms.AGRAFORT);
		meetingRoomUsingEnum.displayInfo();
		System.out.println();
		meetingRoomUsingEnum.availableMeetingRoom();
		System.out.println("**********************************************");
		MeetingRoomUsingEnum meetingRoomUsingEnum1 = new MeetingRoomUsingEnum();
		meetingRoomUsingEnum1.bookMeetingRoom();
		meetingRoomUsingEnum1.bookmeetigRoom(meeetingRooms.TAKSHILA, 3);
		meetingRoomUsingEnum1.bookmeetigRoom(meeetingRooms.AGRAFORT);
		System.out.println();
		meetingRoomUsingEnum1.displayInfo();
		System.out.println();
		meetingRoomUsingEnum1.availableMeetingRoom();
	}


}
