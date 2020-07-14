/*
 * Assignment 27 : 14th July 2020

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
package suparnaNJune20.Assignment_27;

import java.util.Scanner;

public class MeetingRoom {
	String nalanda, takshashila, agraFort, pratapGadh;
	static int nalandaBookingHr = 0, takshashilaBookingHr = 0, agraFortBookingHr = 0, pratapGadhBookingHr = 0;

	void bookMeetingRoom() {
		nalandaBookingHr += 1;
		System.out.println("Naland metting room book for next 1 Hr ");
	}

	void bookMeetingRoom(String roomName) {
		switch (roomName.toLowerCase()) {
		case "nalanda": {
			nalandaBookingHr += 1;
			System.out.println(roomName + " metting room book for next 1 Hr ");
			break;
		}
		case "takshashila": {
			takshashilaBookingHr += 1;
			System.out.println(roomName + " metting room book for next 1 Hr ");
			break;
		}
		case "agrafort": {
			agraFortBookingHr += 1;
			System.out.println(roomName + " metting room book for next 1 Hr ");
			break;
		}
		case "pratapgadh": {
			pratapGadhBookingHr += 1;
			System.out.println(roomName + " metting room book for next 1 Hr ");
			break;
		}
		default:
			System.out.println(" Please Enter Correct Meeting Room ");
		}
	}

	void bookMeetingRoom(String roomName, int bookingHr) {

		switch (roomName.toLowerCase()) {
		case "nalanda": {
			nalandaBookingHr += bookingHr;
			System.out.println(roomName + " metting room book for next " + bookingHr + "Hrs");
			break;
		}
		case "takshashila": {
			takshashilaBookingHr += bookingHr;
			System.out.println(roomName + " metting room book for next " + bookingHr + "Hrs");
			break;
		}
		case "agrafort": {
			agraFortBookingHr += bookingHr;
			System.out.println(roomName + " metting room book for next " + bookingHr + "Hrs");
			break;
		}
		case "pratapgadh": {
			pratapGadhBookingHr += bookingHr;
			System.out.println(roomName + " metting room book for next " + bookingHr + "Hrs");
			break;
		}
		default:
			System.out.println(" Please Enter Correct Meeting Room ");
		}
	}

	void displayAvilableMeetingRoomForBooking() {
		System.out.println("Below is  Available  meeting room info");
		System.out.println("Meeting Room Name \t Booking Hrs ");
		if (nalandaBookingHr == 0)
			System.out.println("Nalanada\t\t " + nalandaBookingHr);
		if (takshashilaBookingHr == 0)
			System.out.println("Takshashila\t\t " + takshashilaBookingHr);
		if (agraFortBookingHr == 0)
			System.out.println("AgraFort\t\t" + takshashilaBookingHr);
		if (pratapGadhBookingHr == 0)
			System.out.println("PratapGadh\t\t" + pratapGadhBookingHr);
	}
	void displayInfo() {
		System.out.println("Below is  booked meeting room info");
		System.out.println("Meeting Room Name \t Booking Hrs ");
		if (nalandaBookingHr > 0)
			System.out.println("Nalanada\t\t " + nalandaBookingHr);
		if (takshashilaBookingHr > 0)
			System.out.println("Takshashila\t\t " + takshashilaBookingHr);
		if (agraFortBookingHr > 0)
			System.out.println("AgraFort\t\t" + takshashilaBookingHr);
		if (pratapGadhBookingHr > 0)
			System.out.println("PratapGadh\t\t " + pratapGadhBookingHr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String meetingRoomName;
		int bookingHr, userchoice;
		MeetingRoom metingRoomInfo = new MeetingRoom();
		/*
		 * System.out.
		 * println("meeting room Avaialbe : Nalanda, Takshashila, AgraFort, and PratapGadh"
		 * ); metingRoomInfo.bookMeetingRoom();
		 * System.out.println("Enter Meeting Room to book "); meetingRoomName =
		 * scanner.next(); metingRoomInfo.bookMeetingRoom(meetingRoomName);
		 * System.out.println("Enter Meeting Room to book with hrs  "); meetingRoomName
		 * = scanner.next(); bookingHr = scanner.nextInt();
		 * metingRoomInfo.bookMeetingRoom(meetingRoomName, bookingHr);
		 * metingRoomInfo.displayInfo();
		 * metingRoomInfo.displayAvilableMeetingRoomForBooking();
		 */
		do {
			System.out.println("\nMeeting rooms are vaialable \n  : Nalanda, Takshashila, AgraFort, and PratapGadh");
			System.out.println("********************************************");
			System.out.println("\nMeeting Room Booking Meanu");
			System.out.println(
					"\n1.Book Nalanda meeting room\n2.Book anymeetig room for next 1 hr\n3.Book anymeetig room for no of  hrs\n4.Get Booked meeting room info \n5.Get Available  meeting room info \n0.Exit");
			System.out.println("Please enter your choice to book meeting room ");
			userchoice = scanner.nextInt();
			switch (userchoice) {
			case 1: {
				metingRoomInfo.bookMeetingRoom();
				break;
			}
			case 2: {
				System.out.println("Enter Meeting Room to book ");
				meetingRoomName = scanner.next();
				metingRoomInfo.bookMeetingRoom(meetingRoomName);
				break;
			}
			case 3: {
				System.out.println("Enter Meeting Room to book with hrs  ");
				meetingRoomName = scanner.next();
				bookingHr = scanner.nextInt();
				metingRoomInfo.bookMeetingRoom(meetingRoomName, bookingHr);
				break;
			}
			case 4: {
				metingRoomInfo.displayInfo();
				break;
			}
			case 5: {
				metingRoomInfo.displayAvilableMeetingRoomForBooking();
				break;
			}
			default:
				System.out.println("Enter correct choice");
			}
		} while (userchoice != 0);
	}

}
