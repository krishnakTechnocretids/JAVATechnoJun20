/*Program to demonstrate overloading behavior.

Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility:
meeting room names: Nalanda, Takshashila, AgraFort, and PratapGadh

a. If any user call method bookMeetingRoom() at that time“Nalanda” meeting room will be booked for 1 hr.
b. Write a method that helps to book a meeting room other than "Nalanda" for default timing would be 1 hr.
c. Write a method which helps to book a meeting room by giving the name of the meeting room and given hrs.
d. displayInfo() method should print booked meeting room info [i.e. meeting room,
booked for how many hrs].
e. displayAvilableMeetingRoomForBooking() method will print available meeting room names. 
     [i.e. If Nalanda and Takshashila is booked then this method should print "Available meeting rooms: AgraFort and 
     PratapGadh"] */
package palakSJun20;

public class MethodOverloadingConcept {
	String roomName1;
	static int roomNalandaHours;

	String roomName2 = "Takshashila";
	static int roomTakshHours;

	String roomName3 = "AgraFort";
	static int roomAgraHours;

	String roomName4 = "PratapGadh";
	static int roomPratapHour;

	void bookMeetingRoom() {
		this.roomName1 = "Nalanda";
		roomNalandaHours++;
	}

	//Method for booking Meeting room 
	void bookOtherMeetingRoom(String meetingRoom) {
		if (meetingRoom.equalsIgnoreCase(roomName2)) {
			if (roomTakshHours < 8) {
				roomTakshHours++;
			} else
				System.out.println("You cannot book Meeting room " + meetingRoom + "for the day Check Tomorrow");

		} else if (meetingRoom.equalsIgnoreCase("AgraFort")) {
			if (roomAgraHours < 8) {
				roomAgraHours++;
			} else
				System.out.println("You cannot book Meeting room " + meetingRoom + "for the day Check Tomorrow");

		} else if (meetingRoom.equalsIgnoreCase("PratapGadh")) {
			roomPratapHour++;
		}
		 else
			System.out.println("Invalid Metting room you can book either Takshashila, AgraFort, and PratapGadh");
	}
	
	//Overloading method for booking meeting room 
	void bookOtherMeetingRoom(String meetingRoom , int hours) {
		if (meetingRoom.equalsIgnoreCase(roomName1)) {
			if (hours < 8) {
				roomNalandaHours = roomNalandaHours + hours ;
			} 
			else if (hours > 8) {
				System.out.println("You cannot book Meeting room " + meetingRoom + " for " +hours+ " hours "
						+ "It can book only for 8 hours on this day");
			}
			else {
				System.out.println("You cannot book Meeting room " + meetingRoom + " for " +hours+ " hours "
						+ "It can book only for " + (hours-roomNalandaHours) +" hours on this day");
			}
		}
		
		if (meetingRoom.equalsIgnoreCase(roomName2)) {
			if (hours < 8) {
				roomTakshHours = roomTakshHours + hours ;
			} 
			else if (hours > 8) {
				System.out.println("You cannot book Meeting room " + meetingRoom + " for " +hours+ " hours "
						+ "It can book only for 8 hours on this day");
			}
			else {
				System.out.println("You cannot book Meeting room " + meetingRoom + " for " +hours+ " hours "
						+ "It can book only for " + (hours-roomTakshHours) +" hours on this day");
			}
		}
		
		else if (meetingRoom.equalsIgnoreCase(roomName3)) {
			if (hours <= 8) {
				roomAgraHours = roomAgraHours + hours ;
			} 
			else if (hours > 8) {
				System.out.println("You cannot book Meeting room " + meetingRoom + " for " +hours+ " hours "
						+ "It can book only for 8 hours on this day");
			}
			else {
				System.out.println("You cannot book Meeting room " + meetingRoom + " for " +hours+ " hours "
						+ "It can book only for " + (hours-roomAgraHours) +" hours on this day");
			}
		}
		
		else if (meetingRoom.equalsIgnoreCase(roomName4)) {
			if (hours <= 8) {
				roomPratapHour = roomPratapHour + hours ;
			} 
			else if (hours > 8) {
				System.out.println("You cannot book Meeting room " + meetingRoom + " for " +hours+ " hours "
						+ "It can book only for 8 hours on this day");
			}
			else {
				System.out.println("You cannot book Meeting room " + meetingRoom + " for " +hours+ " hours "
						+ "It can book only for " + (hours - roomPratapHour) +" hours on this day");
			}
			
		}
		
	}

	//Printing Booked Room Details
	void displayInfo() {
		System.out.println("\n--Booked Meeting Room Details--");
		if (roomNalandaHours > 0) {
			System.out.println("Meeting room " + roomName1 +" is booked for " + roomNalandaHours +" hours");
		}
		if (roomTakshHours > 0) {
			System.out.println("Meeting room " + roomName2 +" is booked for " + roomTakshHours +" hours");
		}
		
		if (roomAgraHours > 0) {
			System.out.println("Meeting room " + roomName3 +" is booked for " + roomAgraHours);
		}
		if (roomPratapHour > 0) {
			System.out.println("Meeting room " + roomName4 +" is booked for " + roomPratapHour);
		}

	}
	
	//Printing Available Meeting Room
	void displayAvilableMeetingRoomForBooking() {
		System.out.println("\n--Avaliable Meeting Room--");
		if (roomNalandaHours == 0) {
			System.out.println("Meeting room "+ roomName1 +" is avaliable for booking"  );
		}
		if (roomTakshHours == 0) {
			System.out.println("Meeting room "+ roomName2 +" is avaliable for booking"  );
		}
		if (roomAgraHours == 0) {
			System.out.println("Meeting room "+ roomName3 +" is avaliable for booking"  );
		}
		if (roomPratapHour == 0) {
			System.out.println("Meeting room "+ roomName4 +" is avaliable for booking"  );
		}
	}

	public static void main(String[] args) {
		MethodOverloadingConcept methodOverloadingConcept = new MethodOverloadingConcept();
		methodOverloadingConcept.bookMeetingRoom();  
		methodOverloadingConcept.bookOtherMeetingRoom("Nalanda", 4); //Nalanda will book for 5 hrs
		methodOverloadingConcept.bookOtherMeetingRoom("Takshashila"); // Booking for 1 hr
		methodOverloadingConcept.bookOtherMeetingRoom("Takshashila", 8); //Give msg as u r booking for more than 8 hours in a day and print remaining hours u can book
		methodOverloadingConcept.bookOtherMeetingRoom("AgraFort", 9); // Give msg as u are booking for more than 8 hrs
		methodOverloadingConcept.displayInfo();
		methodOverloadingConcept.displayAvilableMeetingRoomForBooking();
	}

}
