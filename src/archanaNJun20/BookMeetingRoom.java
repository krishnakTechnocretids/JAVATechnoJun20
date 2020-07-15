package archanaNJun20;

public class BookMeetingRoom {
	double nalandaHours,takshashilaHours,agraFortHours,pratapGadhHours;
	boolean nalandaFlag,takshashilaFlag,agraFortFlag,pratapGadhFlag;
	enum MEETINGROOM{Nalanda,Takshashila,AgraFort,PratapGadh};
	void bookMeetingRoom(){
		if(!nalandaFlag){
			System.out.println("Nalanda meeting room  is  booked for 1hr.");
			nalandaHours=1;
			nalandaFlag=true;
		}
		else{
			System.out.println("Nalanda meeting  room  is already booked.");
		}
	}
	void bookMeetingRoom(MEETINGROOM meetingRoom){
		bookMeetingRoom(meetingRoom, 1);
	}
	void bookMeetingRoom(MEETINGROOM meetingRoom,double hours){
		if(meetingRoom==MEETINGROOM.Nalanda && !nalandaFlag){
			System.out.println(meetingRoom+" meeting room is booked for "+hours+"hr");
			nalandaHours=hours;
			nalandaFlag=true;
		}
		else if(meetingRoom==MEETINGROOM.Takshashila && !takshashilaFlag){
			System.out.println(meetingRoom+" meeting room is booked for "+hours+"hr");
			takshashilaHours=hours;
			takshashilaFlag=true;
		}
		else if(meetingRoom==MEETINGROOM.AgraFort && !agraFortFlag){
			System.out.println(meetingRoom+" meeting room is booked for "+hours+"hr");
			agraFortHours=hours;
			agraFortFlag=true;
		}
		else if(meetingRoom==MEETINGROOM.PratapGadh && !pratapGadhFlag){
			System.out.println(meetingRoom+" meeting room is booked for "+hours+"hr");
			pratapGadhHours=hours;
			pratapGadhFlag=true;
		}
		else
			System.out.println(meetingRoom+" meeting room is already booked.");
	}
	void displayInfo(){
		System.out.println("\nBooked Meeting Rooms:");
		if(pratapGadhFlag){
			System.out.println("PratapGadh metting room is Booked for "+pratapGadhHours+"hr");
		}
		if(agraFortFlag){
			System.out.println("AgraFort metting room is Booked for "+agraFortHours+"hr");
		}
		if(nalandaFlag){
			System.out.println("Nalanda metting room is Booked for "+nalandaHours+"hr");
		}
		if(takshashilaFlag){
			System.out.println("Takshashila metting room is Booked for "+takshashilaHours+"hr");
		}
	}
	void displayAvilableMeetingRoomForBooking(){
		System.out.println("\nAvailable Meeting Rooms:");
		if(!pratapGadhFlag){
			System.out.println("PratapGadh metting room is available");
		}
		if(!agraFortFlag){
			System.out.println("AgraFort metting room is available");
		}
		if(!nalandaFlag){
			System.out.println("Nalanda metting room is available");
		}
		if(!takshashilaFlag){
			System.out.println("Takshashila metting room is available");
		}
	}
	public static void main(String[] args){
		BookMeetingRoom meetingRoom=new BookMeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.displayAvilableMeetingRoomForBooking();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.AgraFort,2.5);
		meetingRoom.displayAvilableMeetingRoomForBooking();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOM.PratapGadh);
		meetingRoom.displayInfo();
		meetingRoom.displayAvilableMeetingRoomForBooking();
	}
}