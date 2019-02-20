package collections;

public class Main {

	public static void main(String[] args) {

		SampleArrayList cc = new SampleArrayList();
		cc.list1();
		cc.list2();
		setsample ss=new setsample();
		ss.set1();
		queueSample qs=new queueSample();
		qs.queue1();
		mapsample S=new mapsample();
		S.map1();
		int arr[] = { 1, 2, 5};
		S.hashmap1(arr);

		System.out.println(" ");
		S.hashmap2("Hello hi");
		hashtableSample hs=new 	hashtableSample();
		hs.n();
	}

}
