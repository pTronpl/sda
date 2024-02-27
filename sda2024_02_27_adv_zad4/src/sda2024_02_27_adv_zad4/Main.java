package sda2024_02_27_adv_zad4;

public class Main {
	/*
	 * ZADANIE 4.
Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
addToStorage(String key, String value) → dodawanie elementów do przechowywalni
printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
Bonus:
Napisz rozwiązanie aby przyjmowało dowolny typ generyczny zamiast String key i value;
	 */

	public static void main(String[] args) {
		Storage <Integer, String> st = new Storage<Integer, String>();
		
		st.printValues(null);
		st.addToStorage(1, "aaa");
		st.addToStorage(1, "bbb");
		st.addToStorage(3, "aaa");
		st.addToStorage(3, "aaa");
		
		st.printValues(1);
		
		for (Integer i : st.findKeysByValue("aaa")) {
			System.out.println(i);
		};

	}

}
