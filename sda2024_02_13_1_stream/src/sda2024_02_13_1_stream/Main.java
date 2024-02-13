package sda2024_02_13_1_stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		 List<Movie> movies = Arrays.asList(….);
		
//		List<Movie> filteredMovies = movies.stream().filter( e -> e.)
		/*
		 * Korzystając z Stream API, napisz funkcję, która dla poniższego przykładu:
    List<Movie> movies = Arrays.asList(….)

   gdzie Movie to klasa
   class Movie {
   String title;
   String type;
   long duration;//min
   LocalDate releaseDate
   }

zwróci listę filmów, gdzie:
- długość filmu będzie większa niż 20 min
- rok wydania nie będzie starszy niż 2018
- typ to horror
		 */
		Movie[] movieArray = {
				new Movie("Aaa", "horror", 240, LocalDate.of(2020, 1, 1)),
				new Movie("GREDFT", "horror", 240, LocalDate.of(2015, 1, 1)),
				new Movie("Bbbb", "comedy", 240, LocalDate.of(2023, 1, 1)),
				new Movie("Gggg", "horror", 240, LocalDate.of(2019, 1, 1)),
				new Movie("Gfder", "romance", 240, LocalDate.of(2021, 1, 1)),
				new Movie("IUTT", "horror", 240, LocalDate.of(2018, 1, 1)),
				new Movie("S100", "comedy", 240, LocalDate.of(2023, 1, 1)),
				new Movie("Djhjg", "horror", 240, LocalDate.of(2019, 1, 1))
				
		};
		List<Movie> movies = Arrays.asList(movieArray);
		
		List<Movie> filteredMovies = movies
				.stream()
				.filter( m -> m.getReleaseDate().getYear()>=2018 && m.duration>20 && m.type.toLowerCase().equals("horror"))
				.peek(System.out::println)
				.toList();

	}

}
