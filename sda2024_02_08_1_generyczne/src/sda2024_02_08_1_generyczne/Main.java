package sda2024_02_08_1_generyczne;

public class Main {

	public static void main(String[] args) {
		/*
		 * Napisz klasę Pair, która będzie przyjmować dwa typy generyczne:
* typ first
* typ second

Zaimplementuj metody:
* first() -> która zwróci nam wartość first
* second() -> która zwróci nam wartość second
		 */

		Pair<String, Integer> pair1 = new Pair<String, Integer>("Ala ma kota", 1);
		
		Pair<String, String> pair2 = new Pair<String, String>("Ala", "ma kota");
		
		Pair<Integer, Pair> para1 = new Pair<Integer, Pair>(1, pair1);
		Pair<Integer, Pair> para2 = new Pair<Integer, Pair>(2, pair2);
		
		
		System.out.println(para1.getFirst());
		System.out.println(para1.getSecond().getFirst());
		System.out.println(para1.getSecond().getSecond());
		System.out.println("-------------------------------------------------");
		System.out.println(para2.getFirst());
		System.out.println(para2.getSecond().getFirst());
		System.out.println(para2.getSecond().getSecond());
	}

}
