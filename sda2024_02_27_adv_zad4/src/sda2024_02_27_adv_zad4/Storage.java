package sda2024_02_27_adv_zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Storage<K,V> {
	
	private Map<K,List<V>> map;
	
	
	
	public Storage() {
		super();
		this.map = new HashMap<K, List<V>>();
	}

	public Map<K,List<V>> addToStorage(K key, V value) {
		
		if(this.map.containsKey(key)) {
			this.map.get(key).add(value);
		} else {
			List<V> list = new ArrayList<V>();
			list.add(value);
			this.map.put(key, list);
		}
		
		return this.map;
	}
	
	public void printValues(K key) {
		if (key != null) {
			for (V value : this.map.get(key)) {
				System.out.println(value);
			}	
		} else {
			System.out.println("No values at null key");
		}
	}
	
	public List<K> findKeysByValue(V seeekedValue){
		List<K> list = new ArrayList<K>();
		for (Entry<K, List<V>> entry : this.map.entrySet()) {
			if (entry.getValue().contains(seeekedValue)) {
				list.add(entry.getKey());
			}
		}
		return list;
	}

}
