package sda2024_02_27_adv_zad3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		/*
		 * ZADANIE 3.
Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba, 
a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: "", Wartość: "". 
Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
Przykład:
Klucz: Java, Wartość: 18,
Klucz: Python, Wartość: 1,
…
Klucz: PHP, Wartość: 0.
Bonus:
Napisz aby metoda działała niezależnie od typów w Mapie.
		 */
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Java", 18);
		m.put("Python", 1);
		m.put("PHP", 0);
		
		Main main = new Main();
		main.getMapValues(m);
	}

	public <K,V> void getMapValues(Map<K,V> map) {
		StringBuffer sb = new StringBuffer();
		for (Entry<K, V> element : map.entrySet()) {
			sb.append("Klucz: ").append(element.getKey()).append(", Wartosc: ").append(element.getKey()).append(",\n");
		}
		
		String res = sb.toString();
		res = res.substring(0, res.length() - 2);
		System.out.println(res);
	}
}
