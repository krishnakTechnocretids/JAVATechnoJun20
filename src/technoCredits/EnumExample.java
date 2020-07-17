package technoCredits;

enum MEETINGROOMS{
	NALANDA;	
}


public class EnumExample {
	final int MAX_COUNT = 10;
	
	
	
	void bookMeetingRoom(MEETINGROOMS meetingRooms) {
		if(meetingRooms == MEETINGROOMS.NALANDA) {
			System.out.println("request is coming for nalanda");
		}
	}
	
	
	public static void main(String[] args) {
		new EnumExample().bookMeetingRoom(MEETINGROOMS.NALANDA);
	}
}
