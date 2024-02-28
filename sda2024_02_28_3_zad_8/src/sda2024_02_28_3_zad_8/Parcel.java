package sda2024_02_28_3_zad_8;

import java.util.Objects;

public class Parcel implements Validator{
	int xLength;
	int yLength;
	int zLength;
	float weight;
	boolean isExpress;
	
	
	
	public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) throws ParcelException {
		super();
		this.xLength = xLength;
		this.yLength = yLength;
		this.zLength = zLength;
		this.weight = weight;
		this.isExpress = isExpress;
		
		if (!validate(this)) {
			throw new ParcelException("Improper dimensions or weight");
		}
	}

	@Override
	public boolean validate(Parcel input) {
		
				if(input.isExpress) {
					return (input.xLength+input.yLength+input.zLength<=300)?
							(input.xLength>=30 && input.yLength>=30 && input.zLength>=30 && input.weight<=15.0f)?
									true:false
									   : false;
				} else {
					return (input.xLength+input.yLength+input.zLength<=300)?
							(input.xLength>=30 && input.yLength>=30 && input.zLength>=30 && input.weight<=30.0f)?
									true:false
									   : false;
				}
	}
	
	@Override
	public String toString() {
		return "Parcel [xLength=" + xLength + ", yLength=" + yLength + ", zLength=" + zLength + ", weight=" + weight
				+ ", isExpress=" + isExpress + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(isExpress, weight, xLength, yLength, zLength);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Parcel))
			return false;
		Parcel other = (Parcel) obj;
		return isExpress == other.isExpress && Float.floatToIntBits(weight) == Float.floatToIntBits(other.weight)
				&& xLength == other.xLength && yLength == other.yLength && zLength == other.zLength;
	}



	
	
}
