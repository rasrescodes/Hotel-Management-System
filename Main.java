import java.util.;

 Create class for hotel data.
class Hotel implements ComparableHotel {
	static String sortParam = name;
	String name;
	int roomAvl;
	String location;
	int rating;
	int pricePr;

	 Constructor
	public Hotel(String name, int roomAvl, String location, int rating, int pricePr) {
		this.name = name;
		this.roomAvl = roomAvl;
		this.location = location;
		this.rating = rating;
		this.pricePr = pricePr;
	}

	 Function to change sort parameter to name
	public static void sortByName() {
		sortParam = name;
	}

	 Function to change sort parameter to rating.
	public static void sortByRate() {
		sortParam = rating;
	}

	 Function to change sort parameter to room availability.
	public static void sortByRoomAvailable() {
		sortParam = roomAvl;
	}

	@Override
	public int compareTo(Hotel other) {
		switch(sortParam) {
			case name
				return this.name.compareTo(other.name);
			case rating
				return Integer.compare(this.rating, other.rating);
			case roomAvl
				return Integer.compare(this.roomAvl, other.roomAvl);
			default
				return 0;
		}
	}

	@Override
	public String toString() {
		return PRHOTELS DATAnHotelName + this.name + tRoom Available + this.roomAvl + tLocation + this.location + tRating + this.rating + tPricePer Room + this.pricePr;
	}
}

 Create class for user data.
class User {
	String uname;
	int uId;
	int cost;

	 Constructor
	public User(String uname, int uId, int cost) {
		this.uname = uname;
		this.uId = uId;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return UserName + this.uname + tUserId + this.uId + tBooking Cost + this.cost;
	}
}

public class Main {
	 Print hotels data.
	public static void printHotelData(ArrayListHotel hotels) {
		for (Hotel h  hotels) {
			System.out.println(h);
		}
	}

	 Sort Hotels data by name.
	public static void sortHotelByName(ArrayListHotel hotels) {
		System.out.println(SORT BY NAME);
		Hotel.sortByName();
		Collections.sort(hotels);
		printHotelData(hotels);
		System.out.println();
	}

	 Sort Hotels by rating
	public static void sortHotelByRating(ArrayListHotel hotels) {
		System.out.println(SORT BY A RATING);
		Hotel.sortByRate();
		Collections.sort(hotels);
		printHotelData(hotels);
		System.out.println();
	}

	 Print Hotels for any city Location.
	public static void printHotelByCity(String s, ArrayListHotel hotels) {
		System.out.println(HOTELS FOR  + s +  LOCATION ARE);
		ArrayListHotel hotelsByLoc = new ArrayList();
		for (Hotel h  hotels) {
			if (h.location.equals(s)) {
				hotelsByLoc.add(h);
			}
		}
		printHotelData(hotelsByLoc);
		System.out.println();
	}

	 Sort hotels by room Available.
	public static void sortByRoomAvailable(ArrayListHotel hotels) {
		System.out.println(SORT BY ROOM AVAILABLE);
		Hotel.sortByRoomAvailable();
		Collections.sort(hotels);
		printHotelData(hotels);
		System.out.println();
	}

	 Print the user's data
	public static void printUserData(String[] userName, int[] userId, int[] bookingCost, ArrayListHotel hotels) {
		ArrayListUser users = new ArrayList();
		 Access user data.
		for (int i = 0; i  3; i++) {
			User u = new User(userName[i], userId[i], bookingCost[i]);
			users.add(u);
		}

		for (int i = 0; i  users.size(); i++) {
			System.out.println(users.get(i) + tHotel name + hotels.get(i).name);
		}
	}

	 Function to solve Hotel Management problem
	public static void hotelManagement(String[] userName, int[] userId, String[] hotelName, int[] bookingCost, int[] rooms, String[] locations, int[] ratings, int[] prices) {
		 Initialize array that stores hotel data
		ArrayListHotel hotels = new ArrayList();

		 Initialise the data
		for (int i = 0; i  3; i++) {
			Hotel h = new Hotel(hotelName[i], rooms[i], locations[i], ratings[i], prices[i]);
			hotels.add(h);
		}

		System.out.println();

		 Call the various operations
		printHotelData(hotels);
		sortHotelByName(hotels);
		sortHotelByRating(hotels);
		printHotelByCity(Bangalore, hotels);
		sortByRoomAvailable(hotels);
		printUserData(userName, userId, bookingCost, hotels);
	}

	 Driver Code.
	public static void main(String[] args) {
		 Initialize variables to stores hotels data and user data.
		String[] userName = {U1, U2, U3};
		int[] userId = {2, 3, 4};
		String[] hotelName = {H1, H2, H3};
		int[] bookingCost = {1000, 1200, 1100};
		int[] rooms = {4, 5, 6};
		String[] locations = {Bangalore, Bangalore, Mumbai};
		int[] ratings = {5, 5, 3};
		int[] prices = {100, 200, 100};

		 Function to perform operations
		hotelManagement(userName, userId, hotelName, bookingCost, rooms, locations, ratings, prices);
	}
}
