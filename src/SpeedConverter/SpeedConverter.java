
public class SpeedConverter {
	public static void main(String[]args) {
		double kms = 33;
		System.out.print(speedConvert(kms));
	}
	
	private static double speedConvert(double kms) {
//		double miles = 0;
//		miles = kms/1.608;
//		
//		return miles;
		return kms < 0 ? -1 : (double)kms/1.608;
	}
}
