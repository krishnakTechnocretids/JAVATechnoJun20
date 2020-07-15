package abhishekSJun20;

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
     PratapGadh"] 
*/
public class OverloadingBehaviourMeetingRoomUsing_enum {
	static boolean nalandaBookingStatus, takshashilaBookingStatus, agraFortBookingStatus, pratapGadhBookingStatus;
	static int nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;

	enum MEETINGROOM {
		NALANDA, TAKSHASHILA, AGRAFORT, PRATPGADH;
	}

	void bookMeetingRoom() {
		if (!nalandaBookingStatus) { // its means room is not yet booked
			System.out.println("Nalanda Meeting Room is booked for 1 hr.");
			nalandaBookingStatus = true; // true means room is booked
			nalandaBookingHours = 1;
		} else
			System.out.println("Nalada Meeting Room is already Booked.");

	}

	void bookMeetingRoom(MEETINGROOM roomName) {
		bookMeetingRoom(roomName, 1);
	}

	void bookMeetingRoom(MEETINGROOM roomName, int hours) {
		if (roomName.equals(MEETINGROOM.NALANDA)) {
			if (!nalandaBookingStatus) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hrs.");
				nalandaBookingStatus = true;
				nalandaBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");
		} else if (roomName.equals(MEETINGROOM.TAKSHASHILA)) {
			if (!takshashilaBookingStatus) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hrs.");
				takshashilaBookingStatus = true;
				takshashilaBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");

		} else if (roomName.equals(MEETINGROOM.AGRAFORT)) {
			if (!agraFortBookingStatus) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hrs.");
				agraFortBookingStatus = true;
				agraFortBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");
		} else if (roomName.equals(MEETINGROOM.PRATPGADH)) {
			if (!pratapGadhBookingStatus) {
				System.out.println(roomName + " Meeting Room is booked for " + hours + " hrs.");
				pratapGadhBookingStatus = true;
				pratapGadhBookingHours = hours;
			} else
				System.out.println(roomName + " Meeting Room is already Booked.");
		}
	}

	void displayInfo() {
		System.out.println();
		System.out.println("Booking Details of Rooms: ");
		if (nalandaBookingStatus == true)
			System.out.println("Nalanda Meeting room is booked for " + nalandaBookingHours + " hrs.");
		if (takshashilaBookingStatus == true)
			System.out.println("Takshashila Meeting room is booked for " + takshashilaBookingHours + " hrs.");
		if (agraFortBookingStatus == true)
			System.out.println("AgraFort Meeting room is booked for " + agraFortBookingHours + " hrs.");
		if (pratapGadhBookingStatus == true)
			System.out.println("PratapGadh Meeting room is booked for " + pratapGadhBookingHours + " hrs.");
	}

	void availableRooms() {
		System.out.println();
		System.out.println("Availables Rooms are:");
		if (!nalandaBookingStatus)
			System.out.println("Nalanda Meeting room is Available.");
		if (!takshashilaBookingStatus)
			System.out.println("Takshashila Meeting room is Available.");
		if (!agraFortBookingStatus)
			System.out.println("AgraFort Meeting room is Available.");
		if (!pratapGadhBookingStatus)
			System.out.println("PratapGadh Meeting room is Available.");
	}

	public static void main(String[] args) {
		OverloadingBehaviourMeetingRoomUsing_enum overloadingBehaviourMeetingRoomUsing_enum = new OverloadingBehaviourMeetingRoomUsing_enum();
		overloadingBehaviourMeetingRoomUsing_enum.bookMeetingRoom();
		overloadingBehaviourMeetingRoomUsing_enum.bookMeetingRoom(MEETINGROOM.TAKSHASHILA, 2);
		overloadingBehaviourMeetingRoomUsing_enum.bookMeetingRoom(MEETINGROOM.PRATPGADH);
		overloadingBehaviourMeetingRoomUsing_enum.availableRooms();
		overloadingBehaviourMeetingRoomUsing_enum.displayInfo();
	}
}