/*Program to demonstrate overloading behavior.
Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility:
meeting room names: Nalanda, Takshashila, AgraFort, and PratapGadh
a. If any user call method bookMeetingRoom() at that time“Nalanda” meeting room will be booked for 1 hr. -done
b. Write a method that helps to book a meeting room other than "Nalanda" for default timing would be 1 hr. -done
c. Write a method which helps to book a meeting room by giving the name of the meeting room and given hrs. -done
d. displayInfo() method should print booked meeting room info [i.e. meeting room,booked for how many hrs]. - done
e. displayAvilableMeetingRoomForBooking() method will print available meeting room names. -done
     [i.e. If Nalanda and Takshashila is booked then this method should print "Available meeting rooms: AgraFort and 
     PratapGadh"] */
    package jagadeeshMJun20;
public class MeetingRoom {
	static boolean nalandaAvail = true;
	static boolean takshasilaAvail = true;
	static boolean agraFortAvail = true;
	static boolean pratapGadhAvail = true;
	static int nalandaBookedHours = 0;
	static int takshasilaBookedHours = 0;
	static int agraFortBookedHours = 0;
	static int pratapGadhBookedHours = 0;
	
//If any user call method bookMeetingRoom() at that time“Nalanda” meeting room will be booked for 1 hr	
	void bookMeetingRoom() {
		if(nalandaAvail == true) {
			nalandaAvail = false;
			nalandaBookedHours++;
	}
	}

//Write a method that helps to book a meeting room other than "Nalanda" for default timing would be 1 hr.
	void bookMeetingRoom(String meetRoom) {
		if (meetRoom.equalsIgnoreCase("Takshasila") && takshasilaAvail == true) {
			takshasilaAvail = false;
			takshasilaBookedHours++;
		}
		if (meetRoom.equalsIgnoreCase("AgraFort") && agraFortAvail == true) {
			agraFortAvail = false;
			agraFortBookedHours++;
		}
		if (meetRoom.equalsIgnoreCase("Pratapgadh") && pratapGadhAvail == true) {
			pratapGadhAvail = false;
			pratapGadhBookedHours++;
		}
	}
//Write a method which helps to book a meeting room by giving the name of the meeting room and given hrs.
	void bookMeetingRoom(String meetRoom, int hours) {
		if (meetRoom.equalsIgnoreCase("Takshasila") && takshasilaAvail == true) {
			takshasilaAvail = false;
			takshasilaBookedHours += hours;
		} else if (meetRoom.equalsIgnoreCase("AgraFort") && agraFortAvail == true) {
			agraFortAvail = false;
			agraFortBookedHours += hours;
		} else if (meetRoom.equalsIgnoreCase("Pratapgadh") && pratapGadhAvail == true) {
			pratapGadhAvail = false;
			pratapGadhBookedHours += hours;
		} else
			System.out.println("Meeting room may be invalid or not available for booking ");
	}
//displayInfo() method should print booked meeting room info [i.e. meeting room,booked for how many hrs].			
	void displayInfo() {
		System.out.println("====================================");
		System.out.println("Booking time of booked meeting rooms:");
		System.out.println("====================================");
		if (nalandaAvail != true)
			System.out.println("Nalanda meeting room is booked for " + nalandaBookedHours + " hours");
		if (takshasilaAvail != true)
			System.out.println("Takshasila meeting room is booked for " + takshasilaBookedHours + " hours");
		if (agraFortAvail != true)
			System.out.println("AgraFort meeting room is booked for " + agraFortBookedHours + " hours");
		if (pratapGadhAvail != true)
			System.out.println("Pratapgadh meeting room is booked for " + pratapGadhBookedHours + "hours");
	}
///displayAvilableMeetingRoomForBooking
	void displayAvilableMeetingRoomForBooking() {
		System.out.println("====================================");
		System.out.println("Available meeting rooms:");
		System.out.println("====================================");
		if (nalandaAvail == true)
			System.out.println("Nalanda ");
		if (takshasilaAvail == true)
			System.out.println("Takshasila ");
		if (agraFortAvail == true)
			System.out.println("AgraFort ");
		if (pratapGadhAvail == true)
			System.out.println("Pratapgadh ");
	}
	
	public static void main(String[] agrs) {
		MeetingRoom mr = new MeetingRoom();
		mr.bookMeetingRoom();
		mr.bookMeetingRoom();
		mr.bookMeetingRoom("Takshasila" );
		mr.bookMeetingRoom("AgraFort",  4);
		mr.displayInfo();
		mr.displayAvilableMeetingRoomForBooking();
	}
}