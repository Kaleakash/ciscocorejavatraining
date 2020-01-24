import java.util.*;
import java.util.function.*;
class Abc implements Consumer<Integer> {
	public void accept(Integer n) {
		System.out.println(n);
	}
}
class DesDemo {
	public static void main(String args[]) {
	List<Integer> ll = new ArrayList<Integer>();
	ll.add(10);ll.add(20);ll.add(30);ll.add(40);
	System.out.println(ll);	

	ll.forEach((v)->System.out.println(v));
	System.out.println("Without lambda expression");
	Consumer obj =  new Abc();
	ll.forEach(obj);
	}
}