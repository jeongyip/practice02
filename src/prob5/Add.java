package prob5;

public class Add extends Arith {

	@Override
	public void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
	}

	public int calculate(){
		result = a + b;
		return result;
	}
}
