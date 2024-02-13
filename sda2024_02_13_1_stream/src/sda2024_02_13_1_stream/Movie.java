package sda2024_02_13_1_stream;

import java.time.LocalDate;
import java.util.Objects;

public class Movie {
	String title;
    String type;
    long duration;//min
    private LocalDate releaseDate;
	public Movie(String title, String type, long duration, LocalDate releaseDate) {
		super();
		this.title = title;
		this.type = type;
		this.duration = duration;
		this.releaseDate = releaseDate;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the duration
	 */
	public long getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(long duration) {
		this.duration = duration;
	}
	/**
	 * @return the releaseDate
	 */
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(duration, releaseDate, title, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Movie))
			return false;
		Movie other = (Movie) obj;
		return duration == other.duration && Objects.equals(releaseDate, other.releaseDate)
				&& Objects.equals(title, other.title) && Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", type=" + type + ", duration=" + duration + ", releaseDate=" + releaseDate
				+ "]";
	}
    
    
}
