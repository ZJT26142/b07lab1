public class Polynomial {
	double [] coefficients;

	public Polynomial() {
		coefficients = new double[] {0};
	}
	
	public Polynomial(double [] c) {
		coefficients = c;
	}
	
	public Polynomial add(Polynomial p) {
		Polynomial result;
		
		if(p.coefficients.length > coefficients.length) {
			result = p;
			for (int i = 0; i<coefficients.length; i++) {
				result.coefficients[i] += coefficients[i];
			}
		} else {
			result = this;
			for (int i=0; i<p.coefficients.length; i++) {
				result.coefficients[i] += p.coefficients[i];
			}
		}
		
		return result;
	}
	
	public double evaluate(double e) {
		double result = 0;
		for(int i=0; i<coefficients.length; i++) {
			result += coefficients[i] * Math.pow(e, i);
		}
		return result;
	}
	
	public boolean hasRoot(double value) {
		return this.evaluate(value) == 0;
	}
	
}
