package collections;

import java.util.TreeSet;



public class setsample {
public void set1()
{
	 /* 
	 * HashSet<Collections1> hs = new HashSet<>(); Collections1 c1 = new
	 * Collections1("saranya", 123); hs.add(c1); for (Collections1 ab : hs)
	 * { System.out.println(ab.a + " " + ab.b); }
	 * 
	 * LinkedHashSet<Integer> hs1 = new LinkedHashSet<>(); hs1.add(1);
	 * hs1.add(2); hs1.add(3); if (hs1.contains(3)) { hs1.remove(2); for
	 * (Integer k : hs1) { System.out.println(k); } }
	 */

	//Set1 ab = new Set1();
	//ab.hashset();
	TreeSet<String> ts = new TreeSet<>();
	ts.add("saranya");
	ts.add("cse");
	ts.add("skcet");
	Object ai = ts.clone();
	//Object aj = ts.;
	// TreeSet<String> ts1=new TreeSet<>();
	System.out.println(ai);

	for (String a : ts) {
		System.out.println(a);
	}
	System.out.println(ts.first());
	System.out.println(ts.last());
	// .clone("skcet");
}
}
