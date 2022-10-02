import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Polynomial {
	double [] coefficients;
	int [] exponents;

	public Polynomial() {
		coefficients = new double[] {0};
		exponents = new int [] {0};
	}
	
	public Polynomial(double [] c, int[] e) {
		coefficients = c;
		exponents = e;
	}
	public Polynomial(File f){
		String data; //not completed
		try {
		      Scanner reader = new Scanner(f);
		      while (reader.hasNextLine()) {
		    	  data = reader.nextLine();
		      }
		      reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		
	}
	
	public int inIntArray(int [] a, int b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) return i;
		}
		return -1;
	}
	
	public Polynomial add(Polynomial p) {
		Polynomial result;
		int length;
		length = exponents.length + p.exponents.length;
		for (int i = 0; i < exponents.length; i++) {
			for (int j = 0; j < p.exponents.length; j++) {
				if (exponents[i] == p.exponents[j]) {
					length-=1;
				}
			}
		}
		result = new Polynomial(new double [length], new int [length]);
		
		for(int i = 0; i < exponents.length; i++) {
			result.exponents[i] = exponents[i];
			result.coefficients[i] = coefficients[i];
		}
		int i = exponents.length;
		while (i < length) {	
			for (int j=0; j<p.exponents.length; j++) {
				if (inIntArray(result.exponents,p.exponents[j]) == -1) {
					result.exponents[i] = p.exponents[j];
					result.coefficients[i] = p.coefficients[j];
					i += 1;
				}
				else {
					int l = inIntArray(result.exponents,p.exponents[j]);
					result.coefficients[l] +=  p.coefficients[j];
				}
			}
			
		}
		
		return result;
	}
	
	public double evaluate(double e) {
		double result = 0;
		for(int i=0; i<coefficients.length; i++) {
			result += coefficients[i] * Math.pow(e, exponents[i]);
		}
		return result;
	}
	
	public boolean hasRoot(double value) {
		return this.evaluate(value) == 0;
	}
	
	public Polynomial multiply(Polynomial p) {
		return p; //not completed
		
	}
	public void saveToFile(String filename) {
		//not completed
	}
}
