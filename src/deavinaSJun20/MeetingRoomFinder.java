package deavinaSJun20;

public class MeetingRoomFinder {
	static boolean nalandaBookingStatus, takshashilaBookingStatus, agraFortBookingStatus, pratapGadhBookingStatus;
	static int nalandaBookingHours, takshashilaBookingHours, agraFortBookingHours, pratapGadhBookingHours;

	enum MeetingRoomFinderS {
		NALANDA, AGRAFORT, TAKSHASHILA, PRATAPGADH
	}

	void bookMeetingRoomFinder() {
		if (!nalandaBookingStatus) {
			System.out.println("NALANDA meeting room is now booked for 1 hr");
			nalandaBookingStatus = true;
			nalandaBookingHours++;
		} else {
			System.out.println("NALANDA meeting room is already booked");
		}
	}

	void bookMeetingRoomFinder(MeetingRoomFinderS MeetingRoomFinder) {
		bookMeetingRoomFinder(MeetingRoomFinder, 1);
	}

	void bookMeetingRoomFinder(MeetingRoomFinderS MeetingRoomFinder, int hours) {
		if (MeetingRoomFinder == MeetingRoomFinderS.NALANDA) {
			if (!nalandaBookingStatus) {
				System.out.println(MeetingRoomFinder + " meeting room is now booked for " + hours + " hr");
				nalandaBookingStatus = true;
				nalandaBookingHours = hours;
			} else
				System.out.println(MeetingRoomFinder + " meeting room has already been booked for " + hours + " hr");
		} else if (MeetingRoomFinder == MeetingRoomFinderS.TAKSHASHILA) {
			if (!takshashilaBookingStatus) {
				System.out.println(MeetingRoomFinder + " meeting room is now booked for " + hours + " hr");
				takshashilaBookingStatus = true;
				takshashilaBookingHours = hours;
			} else
				System.out.println(MeetingRoomFinder + " meeting room has already been booked for " + hours + " hr");
		} else if (MeetingRoomFinder == MeetingRoomFinderS.AGRAFORT) {
			if (!agraFortBookingStatus) {
				System.out.println(MeetingRoomFinder + " meeting room is now booked for " + hours + " hr");
				agraFortBookingStatus = true;
				agraFortBookingHours = hours;
			} else
				System.out.println(MeetingRoomFinder + " meeting room has already been booked for " + hours + " hr");
		} else if (MeetingRoomFinder == MeetingRoomFinderS.PRATAPGADH) {
			if (!pratapGadhBookingStatus) {
				System.out.println(MeetingRoomFinder + " meeting room is now booked for " + hours + " hr");
				pratapGadhBookingStatus = true;
				pratapGadhBookingHours = hours;
			} else
				System.out.println(MeetingRoomFinder + " meeting room has already been booked for " + hours + " hr");
		}
	}

	void displayInfo() {
		System.out.println("Current Booking status:");
		if (nalandaBookingStatus)
			System.out.println("NALANDA meeting room is now booked for " + nalandaBookingHours + " hr");
		if (takshashilaBookingStatus)
			System.out.println("TAKSHASHILA meeting room is now booked for " + takshashilaBookingHours + " hr");
		if (agraFortBookingStatus)
			System.out.println("AGRAFORT meeting room is now booked for " + agraFortBookingHours + " hr");
		if (pratapGadhBookingStatus)
			System.out.println("PRATAPGADH meeting room is now booked for " + pratapGadhBookingHours + " hr");
	}

	void displayAvailableMeetingRoomFinderForBooking() {
		if (nalandaBookingStatus && takshashilaBookingStatus && agraFortBookingStatus && pratapGadhBookingStatus) {
			System.out.println("Sorry, all the meeting rooms are booked at this moment");
		} else {
			System.out.println("The meeting rooms available for booking are shown below,");
			if (!nalandaBookingStatus)
				System.out.println("NALANDA");
			if (!takshashilaBookingStatus)
				System.out.println("TAKSHASHILA");
			if (!agraFortBookingStatus)
				System.out.println("AGRAFORT");
			if (!pratapGadhBookingStatus)
				System.out.println("PRATAPGADH");
		}
	}

	public static void main(String[] args) {
		MeetingRoomFinder MeetingRoomFinder = new MeetingRoomFinder();
		MeetingRoomFinder.bookMeetingRoomFinder();
		System.out.println("----------------------------------------------");
		MeetingRoomFinder.displayAvailableMeetingRoomFinderForBooking();
		System.out.println("----------------------------------------------");
		System.out.println("Booking TAKSHASHILA.... Please Wait....\n");
		MeetingRoomFinder.bookMeetingRoomFinder(MeetingRoomFinderS.TAKSHASHILA);
		System.out.println("----------------------------------------------");
		MeetingRoomFinder.displayInfo();
		System.out.println("----------------------------------------------");
		System.out.println("Booking AGRAFORT.... Please Wait....\n");
		MeetingRoomFinder.bookMeetingRoomFinder(MeetingRoomFinderS.AGRAFORT, 2);
		System.out.println("----------------------------------------------");
		MeetingRoomFinder.bookMeetingRoomFinder();
		System.out.println("----------------------------------------------");
		MeetingRoomFinder.displayAvailableMeetingRoomFinderForBooking();
		System.out.println("----------------------------------------------");
		System.out.println("Booking PRATAPGADH.... Please Wait....\n");
		MeetingRoomFinder.bookMeetingRoomFinder(MeetingRoomFinderS.PRATAPGADH, 3);
		System.out.println("----------------------------------------------");
		MeetingRoomFinder MeetingRoomFinder2 = new MeetingRoomFinder();
		MeetingRoomFinder2.bookMeetingRoomFinder();
		MeetingRoomFinder2.displayAvailableMeetingRoomFinderForBooking();
		System.out.println("----------------------------------------------");
		MeetingRoomFinder2.displayInfo();
	}
}