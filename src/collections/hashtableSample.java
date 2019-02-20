package collections;

import java.util.Hashtable;
import java.util.Map;

public class hashtableSample {
	protected void n() {
		Map<Integer, Collections3> ht = new Hashtable<>();
		Collections3 c4 = new Collections3("saranya", 1, "sysveda");
		
		
		ht.put(1, c4);
	
		
		for (Map.Entry<Integer, Collections3> m : ht.entrySet()) {
			int k = m.getKey();
			Collections3 i = m.getValue();
			System.out.println("key:" + k);
			System.out.println(i.getName() + " " + i.getId() + " " + i.getName());
		}
		System.out.println("After removing:");
		ht.remove(3);
		for (Map.Entry<Integer, Collections3> m : ht.entrySet()) {
			int k = m.getKey();
			Collections3 i = m.getValue();
			System.out.println("key:" + k);
			System.out.println(i.getName() + " " + i.getId() + " " + i.getName());
		}
	}
}
