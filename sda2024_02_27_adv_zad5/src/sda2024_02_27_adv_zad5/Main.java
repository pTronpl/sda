package sda2024_02_27_adv_zad5;

public class Main {

	public static void main(String[] args) {
		SDAHashSet<String> shs = new SDAHashSet<String>();
		shs.add("aaa");									// add
		shs.add("Aaa");
		shs.add("ccc");
		shs.add("DDD");

		System.out.println(shs.contains("aaa"));		// contains
		System.out.println(shs.contains("bbb"));
		System.out.println("-------------------");
		System.out.println(shs.size());					// size
		System.out.println("-------------------");
		System.out.println(shs.remove("DDD"));			// remove
		System.out.println(shs.contains("DDD"));
		System.out.println(shs.size());
		System.out.println("-------------------");
		shs.clear();									// clear
		System.out.println(shs.size());
		

	}

}
