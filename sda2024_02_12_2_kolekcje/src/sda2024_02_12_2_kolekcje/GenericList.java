package sda2024_02_12_2_kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericList<T> {
	private T element;
	private List<T> list;
	private Set<T> set;
	
	GenericList(){
		this.set = new HashSet<T>();
		this.list = new ArrayList<T>();
	}
	
	public List<T> uniqeList(Collection<? extends T> list){
		 this.set.addAll(list);
		 this.list.addAll(set);
		 return this.list;
	}
}
