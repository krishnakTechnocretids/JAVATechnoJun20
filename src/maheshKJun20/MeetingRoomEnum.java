package maheshKJun20;

public class MeetingRoomEnum {
		static boolean nalandaBookingStatus, takshashilaBookingStatus, agraFortBookingStatus, pratapGadhBookingStatus;
		static double nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;

		enum MEETINGROOMS {
			NALANDA, TAKSHASHILA, AGRAFORT, PRATAPGADH;
		}

		//Method to book default meeting room Nalanda for 1 hr
		void bookMeetingRoom() {
			bookMeetingRoom(MEETINGROOMS.NALANDA, 1.0);
		}

		//Method to book selected meeting room for 1 hr
		void bookMeetingRoom(MEETINGROOMS meetingRoomName) {
			bookMeetingRoom(meetingRoomName, 1.0);
		}

		//Method to book selected meeting room for fpr specified time period
		void bookMeetingRoom(MEETINGROOMS meetingRoomName, double hours) {
			if (meetingRoomName.equals(MEETINGROOMS.NALANDA)) {
				if (nalandaBookingStatus == false) {
					System.out.println("Booking Success: Meeting room " + meetingRoomName + " is booked for " + hours + "hr.");
					nalandaBookingStatus = true;
					nalandaBookingHours = hours;
				} else {
					System.out.println("Booking Failed: Meeting room " + meetingRoomName + " is already booked for " + nalandaBookingHours + "hr.");
				}
			} else if (meetingRoomName.equals(MEETINGROOMS.TAKSHASHILA)) {
				if (takshashilaBookingStatus == false) {
					System.out.println("Booking Success: Meeting room " + meetingRoomName + " is booked for " + hours + "hr.");
					takshashilaBookingStatus = true;
					takshashilaBookingHours = hours;
				} else {
					System.out.println("Booking Failed: Meeting room " + meetingRoomName + " is already booked for " + takshashilaBookingHours + "hr.");
				}
			} else if (meetingRoomName.equals(MEETINGROOMS.AGRAFORT)) {
				if (agraFortBookingStatus == false) {
					System.out.println("Booking Success: Meeting room " + meetingRoomName + " is booked for " + hours + "hr.");
					agraFortBookingStatus = true;
					agraFortBookingHours = hours;
				} else {
					System.out.println("Booking Failed: Meeting room " + meetingRoomName + " is already booked for " + agraFortBookingHours + "hr.");
				}
			} else if (meetingRoomName.equals(MEETINGROOMS.PRATAPGADH)) {
				if (pratapGadhBookingStatus == false) {
					System.out.println("Booking Success: Meeting room " + meetingRoomName + " is booked for " + hours + "hr.");
					pratapGadhBookingStatus = true;
					pratapGadhBookingHours = hours;
				} else {
					System.out.println("Booking Failed: Meeting room " + meetingRoomName + " is already booked for " + pratapGadhBookingHours + "hr.");
				}
			}
		}

		//Method to display booked meeting rooms details
		void displayInfo() {
			if (!nalandaBookingStatus && !takshashilaBookingStatus && !agraFortBookingStatus && !pratapGadhBookingStatus) {
				System.out.println("\nNone of meeting rooms are booked for Meeting");
			} else {
				System.out.println("\nMeeting Room Booked are:");
				if (nalandaBookingStatus)
					System.out.println("NALANDA meeting room is booked for " + nalandaBookingHours + " hrs");
				if (takshashilaBookingStatus)
					System.out.println("TAKSHASHILA meeting room is booked for " + takshashilaBookingHours + " hrs");
				if (agraFortBookingStatus)
					System.out.println("AGRAFORT meeting room is booked for " + agraFortBookingHours + " hrs");
				if (pratapGadhBookingStatus)
					System.out.println("PRATAPGADH meeting room is booked for " + pratapGadhBookingHours + " hrs");
			}
		}

		//Method to display available meeting rooms
		void displayAvailableMeetingRoomForBooking() {
			if (nalandaBookingStatus && takshashilaBookingStatus && agraFortBookingStatus && pratapGadhBookingStatus) {
				System.out.println("\nNo Meeting Rooms available for booking.");
			} else {
				System.out.println("\nMeeting Rooms Available are:");
				if (!nalandaBookingStatus)
					System.out.println("NALANDA");
				if (!takshashilaBookingStatus)
					System.out.println("TAKSHSHILA");
				if (!agraFortBookingStatus)
					System.out.println("AGRAFORT");
				if (!pratapGadhBookingStatus)
					System.out.println("PRATAPGADH");
			}
		}

		public static void main(String[] args) {
			MeetingRoomEnum meetingRoomEnum = new MeetingRoomEnum();
			meetingRoomEnum.bookMeetingRoom(MEETINGROOMS.PRATAPGADH, 2);
			meetingRoomEnum.bookMeetingRoom(MEETINGROOMS.AGRAFORT);
//			meetingRoomEnum.bookMeetingRoom(MEETINGROOMS.TAKSHASHILA);
			meetingRoomEnum.bookMeetingRoom();
			meetingRoomEnum.displayAvailableMeetingRoomForBooking();
			meetingRoomEnum.displayInfo();
		}
}
