package vaishnaviVJun20_arrayExamples;

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

public class MeetingRoom {
	
	enum MEETINGROOMS{
		Nalanda , TakshaShila , AgraFort , PratapGadh;
	}

	static boolean bookingStatusForNalanda, bookingStatusForTakshashila, bookingStatusForAgraFort, bookingStatusForPratapGadh;
	static int nalandaHours, takshashilaHours, agraFortHours, pratapGadhHours;

	void bookMeetingRoom() {
		if (bookingStatusForNalanda == false) {
			System.out.println("Nalanda meeting room is booked for 1 hour");
			bookingStatusForNalanda = true;
			nalandaHours = 1;
		} else {
			System.out.println("We are sorry to inform but Nalanda meeting room is already booked");
		}
	}

	void bookMeetingRoom(MEETINGROOMS meetingRoomName) {
		bookMeetingRoom(meetingRoomName, 1);
	}

	void bookMeetingRoom(MEETINGROOMS meetingRoomName, int hours) {
		if (meetingRoomName == MEETINGROOMS.Nalanda) {
			if (bookingStatusForNalanda == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				bookingStatusForNalanda = true;
				nalandaHours = hours;
			} else
				System.out.println(meetingRoomName + " meeting room is already booked for " + hours + "hr.");
		} else if (meetingRoomName == MEETINGROOMS.TakshaShila) {
			if (bookingStatusForTakshashila == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				bookingStatusForTakshashila = true;
				takshashilaHours = hours;
			} else
				System.out.println(meetingRoomName + " meeting room is already booked for " + hours + "hr.");
		} else if (meetingRoomName == MEETINGROOMS.AgraFort) {
			if (bookingStatusForAgraFort == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				bookingStatusForAgraFort = true;
				agraFortHours = hours;
			} else
				System.out.println(meetingRoomName + " meeting room is already booked for " + hours + "hr.");
		} else if (meetingRoomName == MEETINGROOMS.PratapGadh) {
			if (bookingStatusForPratapGadh == false) {
				System.out.println(meetingRoomName + " meeting room is booked for " + hours + "hr.");
				bookingStatusForPratapGadh = true;
				pratapGadhHours = hours;
			} else
				System.out.println(meetingRoomName + " meeting room is already booked for " + hours + "hr.");
		}
	}

	void displayInfo() {
		System.out.println();
		System.out.println("Displaying final details about bookings: ");
		if (bookingStatusForNalanda)
			System.out.println("Nalanda meeting room is booked for " + nalandaHours + "hour");
		if (bookingStatusForTakshashila)
			System.out.println("Takshashila meeting room is booked for " +takshashilaHours + "hour");
		if (bookingStatusForAgraFort)
			System.out.println("AgraFort meeting room is booked for " +agraFortHours + "hour");
		if (bookingStatusForPratapGadh)
			System.out.println("PratapGadh meeting room is booked for " +pratapGadhHours + "hour");
	}

	void displayAvilableMeetingRoomForBooking() {
		System.out.println();
		if (!bookingStatusForNalanda)
			System.out.println("Nalanda meeting room is available.");
		if (!bookingStatusForTakshashila)
			System.out.println("Takshashila meeting room is available.");
		if (!bookingStatusForAgraFort)
			System.out.println("AgraFort meeting room is available.");
		if (!bookingStatusForPratapGadh)
			System.out.println("PratapGadh meeting room is available.");
		if(bookingStatusForNalanda && bookingStatusForTakshashila && bookingStatusForAgraFort && bookingStatusForPratapGadh)
			System.out.println("We are fully booked.");
	}

	public static void main(String[] args) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.AgraFort);
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.TakshaShila, 5);
		System.out.println();
		meetingRoom.bookMeetingRoom();
		System.out.println();
		meetingRoom.bookMeetingRoom(MEETINGROOMS.TakshaShila);
		meetingRoom.displayInfo();
		meetingRoom.displayAvilableMeetingRoomForBooking();
		MeetingRoom meetingRoom1 = new MeetingRoom();
		System.out.println();
		meetingRoom1.bookMeetingRoom(MEETINGROOMS.AgraFort, 2);
		meetingRoom1.bookMeetingRoom(MEETINGROOMS.PratapGadh, 2);
		meetingRoom1.displayAvilableMeetingRoomForBooking();
		System.out.println();

	}

}
