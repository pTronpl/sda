package sda2024_02_12_1_kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class Main {

	public static void main(String[] args) {
		List<String> listS = new ArrayList<>();
		for (int i = 0; i < 15; i++) {
			listS.add(""+i);
		}
		List<Integer> listInt = convertToInt(listS);
		
		for (Integer integer : listInt) {
			System.out.println(integer);
		}

	}

	private static List<Integer> convertToInt(List<String> listS) {
		List<Integer> listI = new ArrayList<>();
		try {
		
		// sposób 1-szy
		listS.forEach((e) -> listI.add(Integer.parseInt(e)));
		
		// sposób 2-gi
//		for (String s : listS) {
//			listI.add(Integer.parseInt(s));
//		}

		// sposób 3-ci
		// return listS.stream().map( e -> Integer.parseInt(e)).toList();
		} catch (NumberFormatException e){
			return null;
		}
		
		return listI;
		
	}


}
