package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class mapsample {
	public void map1(){
	Scanner sc=new Scanner(System.in);
	TreeMap <Integer,String> tm=new TreeMap<>();
	tm.put(1,"saranya");
	tm.put(2,"sandhya");
	tm.put(3,"veena");
	for(Map.Entry m:tm.entrySet())
	{
		System.out.println(m.getKey()+ " "+m.getValue());
	}
	System.out.println("proceed further");
	if(tm.containsKey(sc.nextInt()))
	{
		System.out.println("the value is present");
	}
	
	else
	{
		TreeMap <Integer,String> tm1=new TreeMap<>();
		tm1.put(4,"shruthi");
		tm1.put(5,"sri");
		tm.putAll(tm1);
		tm.putAll(tm1);
		for(Map.Entry m:tm1.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}
	}
}
	public void hashmap1(int arr[]) {
		HashMap<Integer, Integer> hs = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			Integer j = hs.get(arr[i]);
			if (hs.get(arr[i]) == null) {
				hs.put(arr[i], 1);
			} else {
				hs.put(arr[i], ++j);
			}
		}

		for (Map.Entry k : hs.entrySet()) {
			System.out.println("Occurence of  " + k.getKey() + " is " + k.getValue());
		}
	}

	public void hashmap2(String str) {
		HashMap<Character, Integer> hs1 = new LinkedHashMap<>();

		str = str.replace(" ", "");

		for (char ch : str.toCharArray()) {

			if (hs1.containsKey(ch))

			{
				hs1.put(ch, (Integer) hs1.get(ch) + 1);

			} else {
				hs1.put(ch, 1);
			}

		}
		for (Map.Entry k : hs1.entrySet()) {
			System.out.println("Occurence of  " + k.getKey() + " is " + k.getValue());
		}
	}
}