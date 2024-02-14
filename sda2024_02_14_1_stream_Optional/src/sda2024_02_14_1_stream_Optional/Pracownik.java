package sda2024_02_14_1_stream_Optional;

import java.math.BigDecimal;
import java.util.Objects;

public class Pracownik {
	private int id;
	private String imie;
	private String nazwisko;
	private int wiek;
	private Dzial dzial; //: Enum (IT/HR/Sales)
	private BigDecimal pensja;
	
	public Pracownik(int id, String imie, String nazwisko, int wiek, Dzial dzial, BigDecimal pensja) {
		super();
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.dzial = dzial;
		this.pensja = pensja;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the imie
	 */
	public String getImie() {
		return imie;
	}

	/**
	 * @param imie the imie to set
	 */
	public void setImie(String imie) {
		this.imie = imie;
	}

	/**
	 * @return the nazwisko
	 */
	public String getNazwisko() {
		return nazwisko;
	}

	/**
	 * @param nazwisko the nazwisko to set
	 */
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	/**
	 * @return the wiek
	 */
	public int getWiek() {
		return wiek;
	}

	/**
	 * @param wiek the wiek to set
	 */
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	/**
	 * @return the dzial
	 */
	public Dzial getDzial() {
		return dzial;
	}

	/**
	 * @param dzial the dzial to set
	 */
	public void setDzial(Dzial dzial) {
		this.dzial = dzial;
	}

	/**
	 * @return the pensja
	 */
	public BigDecimal getPensja() {
		return pensja;
	}

	/**
	 * @param pensja the pensja to set
	 */
	public void setPensja(BigDecimal pensja) {
		this.pensja = pensja;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dzial, id, imie, nazwisko, pensja, wiek);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pracownik))
			return false;
		Pracownik other = (Pracownik) obj;
		return dzial == other.dzial && id == other.id && Objects.equals(imie, other.imie)
				&& Objects.equals(nazwisko, other.nazwisko) && Objects.equals(pensja, other.pensja)
				&& wiek == other.wiek;
	}

	@Override
	public String toString() {
		return "Pracownik [id=" + id + ", imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + ", dzial="
				+ dzial + ", pensja=" + pensja + "]";
	} 
	
	
	
	
}
