package interfacd;

public class Anonymous {

	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("TV�� �մϴ�");
		}
		
		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("������� �մϴ�");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("������� ���ϴ�");
			}
		};
		
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
