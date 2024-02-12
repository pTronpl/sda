package sda2024_02_12_2_kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("wer");
		list.add("AA");
		list.add("aa");
		list.add("rt5y");
		list.add("4ttg");
		list.add("ui");
		list.add("ui");
		GenericList<String> gen = new GenericList<String>();
		List<String> unique = gen.uniqeList(list);
		
		for (String element : unique) {
			System.out.println(element.getClass().getSimpleName() +" " + element);
		}
		Integer[] integers = { 1,2,3,2,3,5,5,5,5,9,0,-1,-1};
		List<Integer> doubleList = new ArrayList<>(Arrays.asList(integers));
		
		GenericList<Integer> genInt = new GenericList<Integer>();
		List<Integer> uniqueInt = genInt.uniqeList(doubleList);
		
		for (Integer element : uniqueInt) {
			System.out.println(element.getClass().getSimpleName() +" " + element);
		}

	}

}
