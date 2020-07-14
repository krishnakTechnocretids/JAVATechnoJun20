package vaishnaviVJun20_arrayExamples;

import java.util.Scanner;

public class MeetingRoom {
	
	int nalandaCount , takshashilaCount, agraFortCount , pratapGadhCount;
	
	void bookMeetingRoom() {
		nalandaCount++;
		displayInfo("Nalanda",1);
	}
	
    void bookMeetingRoom(String meetingRoomName) {
		
    	if(meetingRoomName.equals("Takshashila")) {
			takshashilaCount++;
			displayInfo(meetingRoomName,1);		
    	}	
		else if(meetingRoomName.equals("AgraFort")) {
			agraFortCount++;
			displayInfo(meetingRoomName,1);		
		}	
		else if(meetingRoomName.equals("PratapGadh")) {
			pratapGadhCount++;
			displayInfo(meetingRoomName,1);		
		}	
		else
			System.out.println("Inavlid Entry");		
	}
    
    void bookMeetingRoom(String meetingRoomName, int hrs) {
    	
    	if(meetingRoomName.equals("Takshashila")) {
			takshashilaCount++;
			displayInfo(meetingRoomName,hrs);	
    	}	
		else if(meetingRoomName.equals("AgraFort")) {
			agraFortCount++;
			displayInfo(meetingRoomName,hrs);	
		}	
		else if(meetingRoomName.equals("PratapGadh")) {
			pratapGadhCount++;
			displayInfo(meetingRoomName,hrs);	
		}	
		else if(meetingRoomName.equals("Nalanda")) {
			nalandaCount++;
			displayInfo(meetingRoomName,hrs);	
		}	
		else
			System.out.println("Inavlid Entry");
	
	}

	void displayInfo(String meetingRoomName, int hrs) {
		System.out.println("You have booked " +meetingRoomName +" for " +hrs +" hour");
	}
	
	void displayAvilableMeetingRoomForBooking() {
		if(nalandaCount == 0)
			System.out.println("Nalanda is available for booking");
		if(takshashilaCount == 0)
			System.out.println("Takshashila is available for booking");
		if(agraFortCount == 0)
			System.out.println("AgraFort is available for booking");
		if(pratapGadhCount == 0)
			System.out.println("PratapGadh is available for booking");			
	}
	
	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		Scanner scanner = new Scanner(System.in);
		meetingRoom.bookMeetingRoom();
		System.out.println("Which Meeting room would you like to book : Takshashila/AgraFort/PratapGadh ? ");
		String meetingRoomName = scanner.next();
		meetingRoom.bookMeetingRoom(meetingRoomName);
		System.out.println("Which Meeting room would you like to book and for how many hours : Takshashila/AgraFort/PratapGadh/Nalanda ? ");
		meetingRoomName = scanner.next();
		int hrs = scanner.nextInt();
		meetingRoom.bookMeetingRoom(meetingRoomName,hrs);
		meetingRoom.displayAvilableMeetingRoomForBooking();		
		scanner.close();
	}

}
