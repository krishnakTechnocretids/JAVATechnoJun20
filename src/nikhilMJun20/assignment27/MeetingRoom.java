/*
Program to demonstrate overloading behavior.

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
PratapGadh"]
*/

package nikhilMJun20.assignment27;

public class MeetingRoom {
	static boolean isNalandaBooked, isTakshashilaBooked, isAgraFortBooked, isPratapGadhBooked;
	static double nalandaBookingDuration, takshashilaBookingDuration, agraFortBookingDuration, pratapGadhBookingDuration;
	
	enum MEETINGROOM{
		NALANDA, TAKSHASHILA, AGRAFORT, PRATPGADH;
	}
	
	void bookMeetingRoom() {
		if(!isNalandaBooked) {
			System.out.println("Room Nalanda booked for 1.0 hr(s).");
			isNalandaBooked = true;
			nalandaBookingDuration = 1.0;
		}else {
			System.out.println("Room Nalanda is already booked for "+nalandaBookingDuration+" hr(s).");
			displayAvilableMeetingRoomsForBooking();
		}
	}
	
	void bookMeetingRoom(MEETINGROOM meetingRoomName) {
		bookMeetingRoom(meetingRoomName, 1.0);
	}
	
	void bookMeetingRoom(MEETINGROOM meetingRoomName, double bookingDurationHrs) {
		if(meetingRoomName.equals(MEETINGROOM.NALANDA)) {
			if(isNalandaBooked == false) {
				isNalandaBooked = true;
				nalandaBookingDuration = bookingDurationHrs;
				System.out.println("Room Nalanda booked for "+nalandaBookingDuration+" hr(s).");
			}else {
				System.out.println("Room Nalanda is already booked for "+nalandaBookingDuration+" hr(s).");
				displayAvilableMeetingRoomsForBooking();
			}
		}else if(meetingRoomName.equals(MEETINGROOM.TAKSHASHILA)) {
			if(isTakshashilaBooked == false) {
				isTakshashilaBooked = true;
				takshashilaBookingDuration = bookingDurationHrs;
				System.out.println("Room Takshashila booked for "+takshashilaBookingDuration+" hr(s).");
			}else {
				System.out.println("Room Takshashila is already booked for "+takshashilaBookingDuration+" hr(s).");
				displayAvilableMeetingRoomsForBooking();
			}
		}else if(meetingRoomName.equals(MEETINGROOM.AGRAFORT)) {
			if(isAgraFortBooked == false) {
				isAgraFortBooked = true;
				agraFortBookingDuration = bookingDurationHrs;
				System.out.println("Room AgraFort booked for "+agraFortBookingDuration+" hr(s).");
			}else {
				System.out.println("Room AgraFort is already booked for "+agraFortBookingDuration+" hr(s).");
				displayAvilableMeetingRoomsForBooking();
			}
		}else if(meetingRoomName.equals(MEETINGROOM.PRATPGADH)) {
			if(isPratapGadhBooked == false) {
				isPratapGadhBooked = true;
				pratapGadhBookingDuration = bookingDurationHrs;
				System.out.println("Room PratapGadh booked for "+pratapGadhBookingDuration+" hr(s).");
			}else {
				System.out.println("Room PratapGadh is already booked for "+pratapGadhBookingDuration+" hr(s).");
				displayAvilableMeetingRoomsForBooking();
			}
		}
	}
	
	static void displayInfo() {
		System.out.println("Information of Booked Meeting Rooms:-");
		if(isNalandaBooked)
			System.out.println("Nalanda : "+nalandaBookingDuration+" hr(s).");
		if(isTakshashilaBooked)
			System.out.println("Takshashila : "+takshashilaBookingDuration+" hr(s).");
		if(isAgraFortBooked)
			System.out.println("AgraFort : "+agraFortBookingDuration+" hr(s).");
		if(isPratapGadhBooked)
			System.out.println("PratapGadh : "+pratapGadhBookingDuration+" hr(s).");
	}
	
	static void displayAvilableMeetingRoomsForBooking() {
		System.out.println("Currently Available Meeting Rooms:-");
		if(isNalandaBooked && isTakshashilaBooked && isAgraFortBooked && isPratapGadhBooked) {
			System.out.println("No room is currently available for booking.");
		}else {
			if(!isNalandaBooked)
				System.out.println("Nalanda");
			if(!isTakshashilaBooked)
				System.out.println("Takshashila");
			if(!isAgraFortBooked)
				System.out.println("AgraFort");
			if(!isPratapGadhBooked)
				System.out.println("PratapGadh");
		}
	}
}
