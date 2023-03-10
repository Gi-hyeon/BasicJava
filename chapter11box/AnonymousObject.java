package chapter11box;

interface TactSwitch{
	void onClick();
}

public class AnonymousObject {
	public static void main(String[] args) {
		TactSwitch tactSwitch = new TactSwitch() {
			boolean check = false;
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				if(check) {
					check = false;
					System.out.println("OFF");
				} else {
					check = true;
					System.out.println("ON");
				}
			}
			
		};
	}
}
