package test;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "ab";
	    String s2 = "ab";  //s1==s2  返回true还是false
	    Double d1 = 2.0;
	    Double d2 = 2.0;  //d1==s2  返回true还是false
	    double d3 = 2.0;
	    double d4 = 2.0;  //d3==d4  返回true还是false
	    Integer i1 = 10;
	    Integer i2 = 10;
	    
	    System.out.println(s1==s2); // true
	    System.out.println(s1.equals(s2)); // true
	    System.out.println(d1==d2); // false
	    System.out.println(d3==d4); // true
	    System.out.println(i1==i2); // true

	}

}
