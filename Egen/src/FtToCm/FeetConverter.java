package FtToCm;

public class FeetConverter {
	public double feetToCm(double feet) {
		return feet < 0 ? -1 : (double)(30.48 * feet);
	}
}
