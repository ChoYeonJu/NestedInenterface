package Interfacee2;

public class Anonymous {

	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 5;
		int var2 = 2;
		
		field = 10;
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				// TODO Auto-generated method stub
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
