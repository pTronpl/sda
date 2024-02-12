package sda2024_02_12_2_kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class GenericList<T> {
	
	GenericList(){
	}
	
	public List<T> uniqeList(Collection<? extends T> list){
		return new ArrayList<T> (new HashSet<>(list));
	}
}
