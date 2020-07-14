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
	String meetingRoomName;
	double bookingDurationHrs;
	
	MeetingRoom bookMeetingRoom() {
		this.meetingRoomName = "Nalanda";
		this.bookingDurationHrs = 1.0;
		return this;
	}
	
	MeetingRoom bookMeetingRoom(String meetingRoomName) {
		if(! meetingRoomName.equals("Nalanda")) {
			this.meetingRoomName = meetingRoomName;
			this.bookingDurationHrs = 1.0;
			return this;
		}else {
			System.out.println("\nThis booking option is NOT available for Room 'Nalanda'.\nChoose default booking option.");
			return null;
		}
	}
	
	MeetingRoom bookMeetingRoom(String meetingRoomName, double bookingDurationHrs) {
		this.meetingRoomName = meetingRoomName;
		this.bookingDurationHrs = bookingDurationHrs;
		return this;
	}
	
	void displayInfo() {
		System.out.println("\nRoom Name: "+this.meetingRoomName+"\nBooked for Duration: "+this.bookingDurationHrs+" Hr(s)");
	}
	
	static void displayAvilableMeetingRoomForBooking(MeetingRoom[] meetingRoomArray) {
		String[] availableRooms = {"Nalanda", "Takshashila", "AgraFort", "PratapGadh"};
		for(int index = 0; index<meetingRoomArray.length; index++) {
			if(meetingRoomArray[index] != null) {
				for(int innerIndex = 0; innerIndex<availableRooms.length; innerIndex++) {
					if(meetingRoomArray[index].meetingRoomName.equals(availableRooms[innerIndex])) {
						availableRooms[innerIndex] = "*";
					}
				}
			}
		}
		System.out.println("\n\nCurrently Available Meeting Rooms:-");
		for(int index = 0; index<availableRooms.length; index++) {
			if(! availableRooms[index].equals("*")) {
				System.out.println(availableRooms[index]);
			}
		}
	}
}
