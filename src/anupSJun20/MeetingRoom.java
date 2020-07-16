package anupSJun20;
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

public class MeetingRoom {
	static int nalandaMeetingHours, takshiasilaMeetingHours,agraFortMeetingHours,pratapGadhMeetingHours;
	static boolean nalandaBookingstatus, takshashilaBookingstatus, agraFortBookingstatus, pratapGadhBookingstatus;

	enum MEETINGROOMS {
		NALANDA,TAKSHASHILA, AGRAFORT, PRATAPGADH;
	}
	
	void bookMeetingRoom(){
		if (!nalandaBookingstatus) {
			System.out.println("Nalanda Room is booked for 1 Hour");
			nalandaBookingstatus = true;
			nalandaMeetingHours = 1;
		} else {
			System.out.println("Nalanda Meeting room is already booked");
			displayAvailableMeetingRoomForBooking();
		}
	}
	void bookMeetingRoom(MEETINGROOMS meetingRoom) {
		bookMeetingRoom(meetingRoom, 1);
	}
	
	void bookMeetingRoom(MEETINGROOMS meetingRoom, int hours) {
		if (meetingRoom.equals(MEETINGROOMS.NALANDA)) {
			if (!nalandaBookingstatus) {
				System.out.println(meetingRoom + " room is booked for " + hours + " Hour");
				nalandaBookingstatus = true;
				nalandaMeetingHours = hours;
			} else {
				System.out.println(meetingRoom + " room is already booked for " + nalandaMeetingHours + " Hour");
				displayAvailableMeetingRoomForBooking();
			}
		} else if (meetingRoom.equals(MEETINGROOMS.TAKSHASHILA)) {
			if (!takshashilaBookingstatus) {
				System.out.println(meetingRoom + " room is booked for " + hours + " Hour");
				takshashilaBookingstatus = true;
				takshiasilaMeetingHours = hours;
			} else {
				System.out.println(meetingRoom + " room is already booked for " + takshiasilaMeetingHours + " Hour");
				displayAvailableMeetingRoomForBooking();
			}
		} else if (meetingRoom.equals(MEETINGROOMS.AGRAFORT)) {
			if (!agraFortBookingstatus) {
				System.out.println(meetingRoom + " room is booked for " + hours + " Hour");
				agraFortBookingstatus = true;
				agraFortMeetingHours = hours;
			} else {
				System.out.println(meetingRoom + " room is already booked for " + agraFortMeetingHours + " Hour");
				displayAvailableMeetingRoomForBooking();
			}
		} else if (meetingRoom.equals(MEETINGROOMS.PRATAPGADH)) {
			if (!pratapGadhBookingstatus) {
				System.out.println(meetingRoom + " room is booked for " + hours + " Hour");
				pratapGadhBookingstatus = true;
				pratapGadhMeetingHours = hours;
			} else {
				System.out.println(meetingRoom + " room is already booked for " + pratapGadhMeetingHours + " Hour");
				displayAvailableMeetingRoomForBooking();
			}
		}
	}
	void displayInfo() {
		//	System.out.println("--------Rooms Booking status----------");
			if (nalandaBookingstatus)
				System.out.println("Nalanda room is booked for " + nalandaMeetingHours + " hours");
			if (takshashilaBookingstatus)
				System.out.println("Takshashila room is booked for " + takshiasilaMeetingHours + " hours");
			if (agraFortBookingstatus)
				System.out.println("Agrafort room is booked for " + agraFortMeetingHours + " hours");
			if (pratapGadhBookingstatus)
				System.out.println("PratapGadh room is booked for " + pratapGadhMeetingHours + " hours");
		}

		void displayAvailableMeetingRoomForBooking() {
			if (nalandaBookingstatus && agraFortBookingstatus && takshashilaBookingstatus && pratapGadhBookingstatus) {
				System.out.println("All meeting rooms are currently booked .");
			} else {
				if (!nalandaBookingstatus)
					System.out.println("Nalanda meeting room is available.");
				if (!takshashilaBookingstatus)
					System.out.println("Takshashila meeting room is available.");
				if (!agraFortBookingstatus)
					System.out.println("AgraFort meeting room is available.");
				if (!pratapGadhBookingstatus)
					System.out.println("PratapGadh meeting room is available.");
			}
		}
	
	
	public static void main(String[] args) {
		MeetingRoom meetingroom = new MeetingRoom();
		meetingroom.bookMeetingRoom();
		System.out.println();
		meetingroom.bookMeetingRoom(MEETINGROOMS.TAKSHASHILA);
		System.out.println();
		meetingroom.bookMeetingRoom();
		System.out.println();
		meetingroom.bookMeetingRoom(MEETINGROOMS.AGRAFORT);
		System.out.println();
		meetingroom.bookMeetingRoom(MEETINGROOMS.NALANDA,2);
		System.out.println();
		meetingroom.bookMeetingRoom(MEETINGROOMS.AGRAFORT,3);
		System.out.println();
		meetingroom.displayAvailableMeetingRoomForBooking();
		
		MeetingRoom meetingRoom2 = new MeetingRoom();
		meetingRoom2.bookMeetingRoom(MEETINGROOMS.NALANDA);
		System.out.println();
		meetingRoom2.bookMeetingRoom(MEETINGROOMS.PRATAPGADH, 2);
		System.out.println();
		meetingRoom2.bookMeetingRoom(MEETINGROOMS.AGRAFORT);
	}
	}


