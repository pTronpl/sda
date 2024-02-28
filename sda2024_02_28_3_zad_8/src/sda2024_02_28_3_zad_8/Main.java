package sda2024_02_28_3_zad_8;

public class Main {

	public static void main(String[] args) {
		
		try {
			Parcel p1 = new Parcel(40, 50, 80, 29.0f, false);
			System.out.println("Parcel approved");
			System.out.println(p1.toString());
		} catch (ParcelException e) {
			e.printStackTrace();
		}
		
		try {
			Parcel p2 = new Parcel(20, 50, 80, 29.0f, false);
			System.out.println(p2.toString());
		} catch (ParcelException e) {
			System.out.println(e.getMessage());
			
		}
		
		try {
			Parcel p3 = new Parcel(20, 50, 80, 29.0f, true);
		} catch (ParcelException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Parcel p4 = new Parcel(110, 150, 80, 14.9f, true);
		} catch (ParcelException e) {
			System.out.println(e.getMessage());
		}
	}

}
