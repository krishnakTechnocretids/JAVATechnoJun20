package prashantCJune20;

public class MeetingRoom {
	
	
	
	static boolean nalandastate,takshashilastate,agrastate,pratapstate;
	static int nalandabookingcount,takshashilabookingcount,AgraFortbookingcount,PratapGadhbookingcount;
	
	enum MEETINGROOM{
		NALANDA,TAKSHASHILA,AGRAFORT,PRATAPGADH
	}
	
	void bookMeetingRoom() {
		if(nalandastate==false) {
			System.out.println("Nalanda is book for 1 hr");
			System.out.println("---------------------------");
			nalandastate=true;
			nalandabookingcount++;
		}
		else {
			System.out.println("Nalanda is already booked");
	}
}
	
		void bookMeetingRoom(MEETINGROOM mroom,int hrs) {
			if(mroom.equals(MEETINGROOM.NALANDA)) {
					if(!nalandastate) {
						nalandabookingcount=hrs;
						nalandastate=true;
					}
					else System.out.println("Nalanda already is Booked");
			}
			if(mroom.equals(MEETINGROOM.TAKSHASHILA)) {
				if(!takshashilastate) {
					takshashilabookingcount=hrs;
					takshashilastate=true;
				}
				else System.out.println("Takshshil is  already booked");
			}
			if(mroom.equals(MEETINGROOM.PRATAPGADH)) {
				if(!pratapstate) {
					takshashilabookingcount=hrs;
					takshashilastate=true;
				}
				else System.out.println("Pratapghad is already booked");
			}
			if(mroom.equals(MEETINGROOM.AGRAFORT)) {
				if(!agrastate){
					AgraFortbookingcount=hrs;
					agrastate=true;
				}
				else System.out.println("Agrafort is already booked");
			}
		}
		void displayRooms() {
			System.out.println("Booked rooms with their hours");
			System.out.println("------------------------------");
			if(nalandastate) System.out.println("Nalanda is booked for "+nalandabookingcount+" hrs");
			if(takshashilastate)System.out.println("Takshashila is booked for "+takshashilabookingcount+" hrs");
			if(pratapstate)System.out.println("Pratapghad is booked for "+PratapGadhbookingcount+" hrs");
			if(agrastate)System.out.println("Agrafort is booked for "+AgraFortbookingcount+" hrs");
		}
	
		void displayAvilableMeetingRoomForBooking() {
			System.out.println("------------------------------");
			System.out.println("Following rooms are available for bookings");
			System.out.println("------------------------------");
			if(!nalandastate)System.out.println("Nalanda is available");
			if(!takshashilastate)System.out.println("Takshshila is available");
			if(!pratapstate)System.out.println("Pratapgadh is available");
			if(!agrastate)System.out.println("Agrafort is available");
		}
		
		public static void main(String[] args) {
			MeetingRoom meetingroom = new MeetingRoom();
			meetingroom.bookMeetingRoom();
			meetingroom.bookMeetingRoom(MEETINGROOM.TAKSHASHILA, 2);
			meetingroom.displayRooms();
			meetingroom.displayAvilableMeetingRoomForBooking();
			
		}
		
		
	}