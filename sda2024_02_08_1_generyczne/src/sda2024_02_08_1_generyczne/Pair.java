package sda2024_02_08_1_generyczne;

public class Pair <F,S>{
	private F first;
	private S second;
	
	public Pair() {}
	
	public Pair(F first, S second) {
		super();
		this.first = first;
		this.second = second;
	}

	/**
	 * @return the first
	 */
	public F getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(F first) {
		this.first = first;
	}

	/**
	 * @return the second
	 */
	public S getSecond() {
		return second;
	}

	/**
	 * @param second the second to set
	 */
	public void setSecond(S second) {
		this.second = second;
	}
	
	
}
