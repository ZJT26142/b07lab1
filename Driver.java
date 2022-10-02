public class Driver { 
 public static void main(String [] args) { 
	 Polynomial p = new Polynomial(); 
	 System.out.println(p.evaluate(3)); 
	 double [] c1 = {1,1,1,1}; 
	 int [] e1 = {1,0,2,4};
	 Polynomial p1 = new Polynomial(c1, e1); 
	 double [] c2 = {6,-2,5}; 
	 int [] e2 = {0,1,3};
	 Polynomial p2 = new Polynomial(c2, e2); 
	 Polynomial s = p1.add(p2); 
	 System.out.println("s(0.1) = " + s.evaluate(0.1)); 
	 if(s.hasRoot(1)) 
		 System.out.println("1 is a root of s"); 
	 else 
		 System.out.println("1 is not a root of s"); 
 	} 
} 