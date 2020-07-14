package prashantCJune20;

public class MeetingRoom {
	
	int nalandabookingcount=0;
	int Takshashilabookingcount=0;
	int AgraFortbookingcount=0;
	int PratapGadhbookingcount=0;
	
	void bookMeetingRoom() {	
		System.out.println("Nalanda is booked for 1 hr");
		nalandabookingcount++;		
	}
	 void bookMeetingRoom(String roomName) {
		 if(roomName.equals("Takshashila")) { 
			 Takshashilabookingcount++;
			 bookMeetingRoom(roomName,Takshashilabookingcount);
		 }
		 	 else if (roomName.equals("AgraFort")) {
		 		AgraFortbookingcount++;
		 		bookMeetingRoom(roomName,AgraFortbookingcount);
		 }
		 	else if (roomName.equals("PratapGadh")) {
		 		PratapGadhbookingcount++;
		 		bookMeetingRoom(roomName,PratapGadhbookingcount);
		 	}
	 }
	 
	 void bookMeetingRoom(String roomName, int hrs) {
		 if(roomName.equals("Takshashila")) {
			 System.out.println("Takshashila is booked for " +hrs+ " hr");
			 Takshashilabookingcount++;
		 }
		 if(roomName.equals("AgraFort")) {
			 System.out.println("AgraFort is booked for " +hrs+ " hr");
			 AgraFortbookingcount++;
		 }
		 if(roomName.equals("PratapGadh")) {
			 System.out.println("PratapGadh is booked for " +hrs+ " hr");
			 PratapGadhbookingcount++;
		 }
	}
	 	 
	 void displayAvilableMeetingRoomForBooking() {
		 if(nalandabookingcount==0)System.out.println("Nalanda is available for booking");
		 if(Takshashilabookingcount==0)System.out.println("Takshashila is available for booking");
		 if(AgraFortbookingcount==0)System.out.println("AgraFort is available for booking");
		 if(PratapGadhbookingcount==0)System.out.println("PratapGadh is available for booking");
	 }	
	
	public static void main(String[] args) {
		MeetingRoom meetingroom =new MeetingRoom();
		meetingroom.bookMeetingRoom();
		meetingroom.bookMeetingRoom("AgraFort");
		meetingroom.bookMeetingRoom("Takshashila");
		meetingroom.displayAvilableMeetingRoomForBooking();
	}
}