package barkhaPJun20;

public class OverloadingBehaviour_MeetingRoom_enum {
	static boolean nalandaBookingStatus, takshashilaBookingStatus,agraFortBookingStatus,pratapGadhBookingStatus;
	static double 	nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;
	
	enum MEETINGROOM {
		NALANDA, TAKSHASHILA, AGRAFORT, PRATPGADH;
	}
	
	void bookMeetingRoom() {
		if (nalandaBookingStatus==false) {   //false means room is not yet booked
			System.out.println("Nalanda Meeting Room is booked for 1 hr.");
			nalandaBookingStatus=true;    // true means room is booked
			nalandaBookingHours=1;
		}
		else
			System.out.println("Nalada Meeting Room is already Booked.");
	}
	void bookMeetingRoom(MEETINGROOM roomName) {
		bookMeetingRoom(roomName,1.0); 
	}
	void bookMeetingRoom(MEETINGROOM roomName, double hours) {
		if (roomName.equals(MEETINGROOM.NALANDA)) {
			if (nalandaBookingStatus==false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hrs.");
				nalandaBookingStatus=true;
				nalandaBookingHours=hours;
			}else
				System.out.println(roomName+" Meeting Room is already Booked.");
		}	
		else if (roomName.equals(MEETINGROOM.TAKSHASHILA)) {
			if (takshashilaBookingStatus==false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hrs.");
				takshashilaBookingStatus=true;
				takshashilaBookingHours=hours;
			}else
				System.out.println(roomName+" Meeting Room is already Booked.");
			
		}
		else if (roomName.equals(MEETINGROOM.AGRAFORT)) {
			if (agraFortBookingStatus==false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hrs.");
				agraFortBookingStatus=true;
				agraFortBookingHours=hours;
			}else
				System.out.println(roomName+" Meeting Room is already Booked.");
		}
		else if (roomName.equals(MEETINGROOM.PRATPGADH)) {
			if (pratapGadhBookingStatus==false) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hrs.");
				pratapGadhBookingStatus=true;
				pratapGadhBookingHours=hours;
			}else
				System.out.println(roomName+" Meeting Room is already Booked.");
		}
	}
		void displayInfo() {
			System.out.println();
			System.out.println("Booking Details of Rooms: ");
			if (nalandaBookingStatus==true)
				System.out.println("Nalanda Meeting room is booked for "+nalandaBookingHours+ " hrs.");
			if (takshashilaBookingStatus==true)
				System.out.println("Takshashila Meeting room is booked for "+takshashilaBookingHours+ " hrs.");
			if (agraFortBookingStatus==true)
				System.out.println("AgraFort Meeting room is booked for "+agraFortBookingHours+ " hrs.");
			if (pratapGadhBookingStatus==true)
				System.out.println("PratapGadh Meeting room is booked for "+pratapGadhBookingHours+ " hrs.");
		}
		void availableRooms() {
			System.out.println();
			System.out.println("Availables Rooms are:");
			if (nalandaBookingStatus==false)
				System.out.println("Nalanda Meeting room is Available.");
			if (takshashilaBookingStatus==false)
				System.out.println("Takshashila Meeting room is Available.");
			if (agraFortBookingStatus==false)
				System.out.println("AgraFort Meeting room is Available.");
			if (pratapGadhBookingStatus==false)
				System.out.println("PratapGadh Meeting room is Available.");
			
		}
	public static void main(String[] args) {
		OverloadingBehaviour_MeetingRoom_enum meetingRoom=new OverloadingBehaviour_MeetingRoom_enum();	
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom(MEETINGROOM.TAKSHASHILA,5.2);
		meetingRoom.bookMeetingRoom(MEETINGROOM.PRATPGADH);
		meetingRoom.availableRooms();
		meetingRoom.displayInfo();
	}
}			