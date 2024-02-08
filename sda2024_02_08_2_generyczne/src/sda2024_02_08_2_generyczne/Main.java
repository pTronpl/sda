package sda2024_02_08_2_generyczne;

public class Main {

	public static void main(String[] args) {
		/*
		 * Napisz metodę generyczną, które zadaniem będzie zamiana (swap) elementów o wskazanych pozycjach w tablicy.
Metoda powinna przyjmować:
- tablicę dowolnego typu elementów
- pozycję pierwszego elementu
- pozycję drugiego elementu
tzn, np. jeśli mamy tablice 10 elementów, podamy pozycję 1: 4, pozycję 2: 8 to należy dokonać zamiany:
- element pod indeksem 4 musi znaleść się pod indeksem 8, a element o indeksie 8 musi znaleść się pod indeksem 4

Bonus points:
- napisz drugą metodę która robi to samo ale tylko dla obiektów numerycznych tzn. Integer, Long, Double, Float
		 */
		Integer[] iTab = {1,2,3,4,5,6};
		iTab = swapNumber(iTab, 0, 3);
		printTab(iTab);
		System.out.println("---------------------------------------");
		String[] sTab = {"a", "bb", "ccc", "dddd", "e", "ff"};
		printTab(swap(sTab, 2,5));
	}
	
	
	public static <T> T[] swap(T[] tab, int first, int second) {
		if (!(first<tab.length) || !(second<tab.length) ) return tab;
		System.out.println("Metoda <T> T[] swap(T[] tab, int first, int second)");
		T element = tab[first];
		tab[first] = tab[second];
		tab[second] = element;
		return tab;
	}
	
	public static <T extends Number> T[] swapNumber(T[] tab, int first, int second) {
		if (!(first<tab.length) || !(second<tab.length) ) return tab;
		System.out.println("Metoda <T extends Number> T[] swap(T[] tab, int first, int second");
		T element = tab[first];
		tab[first] = tab[second];
		tab[second] = element;
		return tab;
	}
	
	
	
	public static <T> void printTab(T[] tab) {
		for (T t : tab) {
			System.out.println(t);
		}
	}
	
	

}
