package prob4;

public class CurrencyConverter {

	private static double RATE = 0.;

	public static double toDollar(double won) {
		/* 원 -> 달러 */
		
		return won/RATE;
	}

	public static double toKWR(double dollar) {
		/* 달러 -> 원 */
		return dollar*RATE;
	}

	public static void setRate(double r) {
		RATE = r;
	}

	public static void main(String[] args) {
		
		CurrencyConverter convert = new CurrencyConverter();
		convert.setRate(1205);
		
		int OHW = 1000000;
		int OHD = 100;
		
		System.out.println("백만원은 "+convert.toDollar(OHW)+"달러 입니다.");
		System.out.println("백달러는 "+convert.toKWR(OHD)+"원 입니다.");
	}
}
