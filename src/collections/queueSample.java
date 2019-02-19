package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;

public class queueSample {

	public void queue1() {
		Deque<Collections3> sp = new ArrayDeque<Collections3>();
		Collections3 c1 = new Collections3("saranya", 1, "sysveda");
		Collections3 c2 = new Collections3("Abhishek", 2, "sysveda");
		Collections3 c3 = new Collections3("selva", 3, "sysveda");
		// l.add(c1);
		sp.add(c1);
		sp.add(c2);
		sp.offer(c3);

		for (Collections3 i : sp) {
			System.out.println(i.getName() + " " + i.getId() + " " + i.getOffice());
		}

		sp.poll();
		System.out.println("After removing one record:");
		for (Collections3 i : sp) {
			System.out.println(i.getName() + " " + i.getId() + " " + i.getOffice());
		}
	}
}