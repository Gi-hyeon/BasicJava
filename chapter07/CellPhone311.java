package chapter07;

class CellPhone{
	void powerOn() {
		System.out.println("전월을 켭니다.");
	}
	void powerOff() {
		System.out.println("전월을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}


class DmbCellPhone extends CellPhone{
	String model;
	String color;
	int channel;
	
	DmbCellPhone(String model, String color, int channel){        //CellPhone에서 상복받은 필드
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb() {
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}


public class CellPhone311 {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("iPhone12", "black", 10); //DmbCellPhone 객체 생성
		CellPhone cellphone = new CellPhone();
		
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		System.out.println("채널: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("안녕");
		dmbCellPhone.sendVoice("안녕");
		dmbCellPhone.powerOff();
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb();
		dmbCellPhone.turnOffDmb();
	}
}
