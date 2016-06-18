package regular;

import java.util.Vector;

public class regular {
	
	static Vector<String> s = new Vector<String>();
	static Vector<String> r = new Vector<String>();
	static boolean b ;
	
	
	public static void main(String[] args) {
			s.add("my name is gzb");
			r.add(".gzb.");
			
			b = s.get(0).matches(r.get(0));
			System.out.println(" " + b);
	}

}
