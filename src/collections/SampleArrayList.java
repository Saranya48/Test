package collections;

import java.util.*;

enum month {
	AUGUST, OCTOBER, SEPTEMBER, JULY
}

public class SampleArrayList {

	protected String a;
	protected int b;
	protected float i;

	public SampleArrayList() {

	}

	public SampleArrayList(String a, int b) {
		this.a = a;
		this.b = b;

	}

	public void list1() {

		List<String> al = new ArrayList<>();
		al.add("c");
		al.add("c++");
		al.add(0, "phython");
		al.add("sara");
		al.remove(1);
		// al.
		al.set(1, "java");

		List<String> al1 = new ArrayList<>();
		al1.add("ji");
		al1.add("hi");
		int p = al1.size();
		System.out.println(p);
		// al1.addAll(al);
		if (al1.isEmpty()) {
			System.out.println("no elements is present");
		}
		al.retainAll(al1);
		for (String c : al) {
			System.out.println(c);
		}

		/*
		 * LinkedList<String> li = new LinkedList<>(); li.add("b");
		 * li.addFirst("a"); li.addLast("c"); Iterator<String> ir =
		 * li.iterator(); while (ir.hasNext()) {
		 * System.out.println("the elements are:" + ir.next()); }
		 */
	}

	public void list2() {

		// TODO Auto-generated method stub
		Set<month> s = EnumSet.allOf(month.class);
		System.out.println(s);

		List<String> list = new ArrayList<>();
		list.add("sara");
		list.add("riya");
		list.add("mathi");
		list.add("hari");
		Collections.reverse(list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		System.out.println(Collections.max(list1));
	}
}