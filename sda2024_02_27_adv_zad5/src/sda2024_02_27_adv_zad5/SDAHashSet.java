package sda2024_02_27_adv_zad5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SDAHashSet<V> implements Iterable<V> {

	private Map<V, V> map;

	public SDAHashSet() {
		super();
		this.map = new HashMap<V, V>();
	}
	
	public Set<V> add(V value){
		this.map.put(value, value);
		return this.map.keySet();
	}
	
	public boolean remove(V value){
		return this.map.keySet().remove(value);
	}	
	
	public int size(){
		return this.map.keySet().size();
	}
	
	public boolean contains(V value){
		return this.map.keySet().contains(value);
	}
	
	public void clear(){
		this.map.clear();
	}

	@Override
	public Iterator<V> iterator() {
		return this.map.keySet().iterator();
//		return new CustomIterator(this);
	}
	
//	add
//	remove
//	size
//	contains
//	clear
	
	
	class CustomIterator implements Iterator<V>{

	public CustomIterator(SDAHashSet<V> sdaHashSet) {
			// TODO Auto-generated constructor stub
		}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V next() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}
}
