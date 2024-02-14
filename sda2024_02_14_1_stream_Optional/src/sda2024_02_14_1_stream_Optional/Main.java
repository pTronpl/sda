package sda2024_02_14_1_stream_Optional;

import java.math.BigDecimal;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * Zadanie Stream API:
Klasa DTO Pracownik:
id: int
imie: String
nazwisko: String
wiek: int
dzial: Enum (IT/HR/Sales)
pensja: BigDecimal
Polecenia
Policzenie pracowników z działu IT.
Sprawdzenie, czy wszyscy pracownicy w dziale HR mają pensję powyżej 5000.
Znalezienie pierwszego pracownika z działu IT, który ma pensję powyżej 7000.
Obliczenie średniej pensji pracowników w dziale Sales.
Wyświetlenie unikalnych nazwisk pracowników z działu IT, którzy mają więcej niż 30 lat, posortowanych alfabetycznie.
Znalezienie liczby unikalnych imion pracowników w dziale HR.
Sprawdzenie, czy jakikolwiek pracownik w dziale HR lub IT zarabia dokładnie 10,000.
Zwrócenie nazwy działu pracownika o imieniu X.
Obliczenie różnicy wieku między najstarszym a najmłodszym pracownikiem (2 streamy mogą być wymagane).
Wypisz imiona pracowników którzy mają parzyste id a następnie zwróć Listę takich pracowników (wszystko w jednym stream'ie).
		 */

//		List<String> ls = List.of("aa", "dfg", "fgfg", "fghj");
//		ls.parallelStream()
		
		
		List<Pracownik> listaPracownikow = List.of(
				new Pracownik(1, "Jan", "Kowalski", 25, Dzial.HR, new BigDecimal(5000)),
				new Pracownik(2, "Adam", "Kowalski", 25, Dzial.IT, new BigDecimal(8000)),
				new Pracownik(3, "Jan", "Zielinski", 30, Dzial.SALES, new BigDecimal(11000)),
				new Pracownik(4, "Anna", "Kowalska", 23, Dzial.IT, new BigDecimal(12000)),
				new Pracownik(5, "Cacylia", "Kowal", 32, Dzial.IT, new BigDecimal(15000)),
				new Pracownik(6, "Zuzanna", "Nowak", 43, Dzial.IT, new BigDecimal(12000)),
				new Pracownik(7, "Ewa", "Zietek", 55, Dzial.HR, new BigDecimal(18000)),
				new Pracownik(8, "Emil", "Bujak", 28, Dzial.SALES, new BigDecimal(10000)),
				new Pracownik(9, "Wojciech", "Nowicki", 29, Dzial.IT, new BigDecimal(5500)),
				new Pracownik(10, "Piotr", "Adamczyk", 25, Dzial.IT, new BigDecimal(7800)),
				new Pracownik(11, "Pawel", "Krakowski", 25, Dzial.IT, new BigDecimal(7200)),
				new Pracownik(12, "Ewelina", "Piotrowicz", 27, Dzial.IT, new BigDecimal(11300)),
				new Pracownik(13, "Halina", "Grajda", 41, Dzial.IT, new BigDecimal(12750))
				);
		//Policzenie pracowników z działu IT.
		
		long iloscIT = listaPracownikow.stream().filter(e-> e.getDzial()==Dzial.IT).count();
		System.out.println("iloscIT: "+iloscIT);

		//		Sprawdzenie, czy wszyscy pracownicy w dziale HR mają pensję powyżej 5000.
		boolean czyWszyscyHR = 
				listaPracownikow.stream()
					.filter(e-> e.getDzial() == Dzial.HR)
					.allMatch( e-> e.getPensja().doubleValue()>5000)
//					.forEach(System.out::println)
					;
		System.out.println("czyWszyscyHR maja pensje pow.5000: " + czyWszyscyHR);
		
		// Znalezienie pierwszego pracownika z działu IT, który ma pensję powyżej 7000.
		System.out.println("----------------------------------------");
		Pracownik pIT = listaPracownikow.stream().filter(e-> e.getDzial()==Dzial.IT).findFirst().get();
		System.out.println(pIT.toString());
		
		//Obliczenie średniej pensji pracowników w dziale Sales.
		System.out.println("----------------------------------------");
		double sredniaSales = listaPracownikow.stream()
				.filter(e-> e.getDzial()==Dzial.SALES)
				.map(Pracownik::getPensja)
				.mapToDouble(BigDecimal::doubleValue)
				.average()
				.orElse(0);
		System.out.println("sredniaSales: " + sredniaSales);
		
		//Wyświetlenie unikalnych nazwisk pracowników z działu IT, którzy mają więcej niż 30 lat, posortowanych alfabetycznie.
		System.out.println("----------------------------------------");
		listaPracownikow.stream()
				.filter(e -> (e.getWiek()>30 && e.getDzial() == Dzial.IT))
				.map(Pracownik::getNazwisko)
				.sorted()
				.forEach(System.out::println);

		//		Znalezienie liczby unikalnych imion pracowników w dziale HR.
		System.out.println("----------------------------------------");
		long pracownicyHR = listaPracownikow.stream()
		.filter(e -> (e.getDzial() == Dzial.HR))
		.distinct()
		.count();
		System.out.println("pracownicyHR: " + pracownicyHR);
		
		
		//		Sprawdzenie, czy jakikolwiek pracownik w dziale HR lub IT zarabia dokładnie 10,000.
		System.out.println("----------------------------------------");
		boolean pracownikHRITpensja10000 = listaPracownikow.stream()
			.filter(e -> ( (e.getDzial() == Dzial.HR || e.getDzial() == Dzial.IT)))
			.map(Pracownik::getPensja)
			.mapToDouble(BigDecimal::doubleValue)
			.filter(e-> e == 10000)
			.findAny().isPresent();
		System.out.println("pracownikHRITpensja10000: " + pracownikHRITpensja10000);

		
		//		Zwrócenie nazwy działu pracownika o imieniu X.
		System.out.println("----------------------------------------");
		String nazwaDzialu = listaPracownikow.stream()
			.filter(e-> (e.getImie().equals("Jan")))
			.map(Pracownik::getDzial)
			.findFirst().get().toString();
			
		System.out.println("Nazwa Dzialu: " + nazwaDzialu);

		//		Obliczenie różnicy wieku między najstarszym a najmłodszym pracownikiem (2 streamy mogą być wymagane).
		System.out.println("----------------------------------------");
		int max = 
				listaPracownikow.stream().map(e-> e.getWiek()).max(Integer::compare).orElse(Integer.MAX_VALUE);
		int min = 
				listaPracownikow.stream().map(Pracownik::getWiek).min(Integer::compare).orElse(Integer.MIN_VALUE);
		int roznicaWieku = max-min;
		System.out.println("Age difference: " + roznicaWieku);

		//		Wypisz imiona pracowników którzy mają parzyste id a następnie zwróć Listę takich pracowników (wszystko w jednym stream'ie).
		System.out.println("----------------------------------------");
		List<Pracownik> listapracID = listaPracownikow.stream()
			.filter(e-> e.getId()%2==0)
			.peek(System.out::println)
			.toList();
				 
	}

}
