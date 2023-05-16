
public class cerchio {
	double raggio;
	public cerchio(double r) {
		this.raggio = r;
	}
	
	public cerchio(cerchio altroCerchio) {
		this.raggio = altroCerchio.getRaggio() * 2;
	}

	private double getRaggio() {
		return raggio;
	}

	public double diametro() {
		return 2 * raggio;
	}
	
	public double circonferenza() {
		return 2 * 3.14 * raggio;
	}
	
	public double area() {
		return 3.14 * Math.pow(raggio, 2);
	}

	
	public String toString() {
		return "Cerchio [ "
				+ "diametro = " + diametro() 
				+ ", circonferenza = " + circonferenza() 
				+ ", area = " + area()
				+ " ]";
	}
	
	
}

	
	
