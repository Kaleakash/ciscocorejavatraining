import java.util.*;
class Employee{}
class CollectionDemo {
	public static void main(String args[]){
	
	/*List ll = new ArrayList();
	ll.add(10);		//auto-boxing : converting primitive to object. 
	ll.add(10.10);
	ll.add("Ravi");
	ll.add(20);

	Object obj = ll.get(0);
	Integer i = (Integer)obj;
	int n = i.intValue();
	System.out.println(n);*/
	
	List<Integer> ll = new ArrayList<Integer>();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	
	int n =ll.get(0);	//auto-unboxing :converting object to primitive 
	System.out.println(n);	
	}
}