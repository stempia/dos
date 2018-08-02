import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(1);
		b.add(2);
		b.clear();
		b.addAll(a);
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
