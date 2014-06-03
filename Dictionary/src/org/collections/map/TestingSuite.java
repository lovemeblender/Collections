package org.collections.map;

public class TestingSuite {

	public static void main(String[] args) {
	
		Dictionary<String, Integer> dict = new Dictionary<String, Integer>();
		
		System.out.println(dict.put(":)", 1));
		System.out.println(dict.isEmpty());
		System.out.println(dict.put(":)", 10));
		dict.put(":)", 1);
		System.out.println(dict.getValue(":)"));
	}
}
