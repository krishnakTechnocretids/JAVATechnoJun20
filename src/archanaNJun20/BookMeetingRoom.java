package archanaNJun20;

public class BookMeetingRoom {
	String meetingRoom;
	double hours=0.0;
	boolean nalandaFlag=false;
	boolean takshashilaFlag=false;
	boolean agraFortFlag=false;
	boolean pratapGadhFlag=false;

	void bookMeetingRoom(){
		if(nalandaFlag==false){
			meetingRoom="Nalanda";
			hours=1;
			displayInfo();
			nalandaFlag=true;
		}
		else{
			System.out.println("-->The meeting room  is already booked.");
		}
	}
	void bookMeetingRoom(String meetingRoom){
		if(!(meetingRoom.equals("Nalanda"))){
			if(meetingRoom.equals("Takshashila")&&takshashilaFlag==false){
				this.meetingRoom="Takshashila";
				hours=1;
				displayInfo();
				takshashilaFlag=true;
			}
			else if(meetingRoom.equals("AgraFort") &&agraFortFlag==false){
				this.meetingRoom="AgraFort";
				hours=1;
				displayInfo();
				agraFortFlag=true;
			}
			else if(meetingRoom.equals("PratapGadh")&&pratapGadhFlag==false){
				this.meetingRoom="PratapGadh";
				hours=1;
				displayInfo();
				pratapGadhFlag=true;
			}
			else{
				System.out.println(meetingRoom +"-->The meeting room is already booked.");
			}
		}
		else{
			System.out.println(meetingRoom +" is Invalid meeting Room ");
		}
	}
	void bookMeetingRoom(String meetingRoom,int hours){
		if(!meetingRoom.equals("Nalanda")){
			if(meetingRoom.equals("Takshashila")&&takshashilaFlag==false){
				this.meetingRoom="Takshashila";
				this.hours=hours;
				displayInfo();
				takshashilaFlag=true;
			}
			else if(meetingRoom.equals("AgraFort")&&agraFortFlag==false){
				this.meetingRoom="AgraFort";
				this.hours=hours;
				displayInfo();
				agraFortFlag=true;
			}
			else if(meetingRoom.equals("PratapGadh")&&pratapGadhFlag==false){
				this.meetingRoom="PratapGadh";
				this.hours=hours;
				displayInfo();
				pratapGadhFlag=true;
			}else{
				System.out.println(meetingRoom+ "-->The meeting room  is already booked.");
			}
		}
		else{
			System.out.println(meetingRoom +" is Invalid meeting Room ");
		}
	}
	void displayInfo(){
		System.out.println( meetingRoom+" Meeting room "  + " is booked for " + hours + " hour");
	}
	void displayAvilableMeetingRoomForBooking() {

		if(pratapGadhFlag==true&&agraFortFlag==true&&takshashilaFlag==true&&takshashilaFlag==true)
		{
			System.out.println("\nAll meeting rooms are booked.");
		}
		else {  
			System.out.println("\nAvailable meeting Rooms:");
			if(pratapGadhFlag==false){
				System.out.println("*PratapGadh metting room is available*");
			}
			if(agraFortFlag==false)	{
				System.out.println("*AgraFort metting room is available*");
			}
			if(nalandaFlag==false){
				System.out.println("*Nalanda metting room is available*");
			}
			if(takshashilaFlag==false){
				System.out.println("*Takshashila metting room is available*");
			}
		}
	}
	public static void main(String[] args) {
		BookMeetingRoom meetingRoom=new BookMeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.bookMeetingRoom("Nalanda");
		meetingRoom.bookMeetingRoom("PratapGadh");
		meetingRoom.bookMeetingRoom("AgraFort",1);
		meetingRoom.bookMeetingRoom("Takshashila",2);
		meetingRoom.displayAvilableMeetingRoomForBooking();
	}
}