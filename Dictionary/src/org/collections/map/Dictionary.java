package org.collections.map;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary<K, V> extends AbstractMap<K, Integer> {

	private Map<K, Integer> dictionary = new HashMap<K, Integer>();
	
	// Put to the HashMap by increasing its value
	public Integer put(K key, Integer value) {
		if(!dictionary.containsKey(key)) {
			dictionary.put(key, value);
		}
		else {
			dictionary.put(key, dictionary.get(key) + value);
		}
		return key.hashCode();
	}
	
	// What normally a HashMap would do
	public void putReplace(K key, Integer value) {
		super.put(key, value);
	}

	// Returns the value for the given key
	public Integer getValue(K key) {
		return dictionary.get(key);
	}
	
	@Override
	public boolean isEmpty() {
		return dictionary.isEmpty();
	}
	
	@Override
	public Set<java.util.Map.Entry<K, Integer>> entrySet() {
		// TODO Auto-generated method stub
		return dictionary.entrySet();
	}
}
