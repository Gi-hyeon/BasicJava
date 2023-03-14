package sabstract;

class Unit {
    public void attack() {
        System.out.println("유닛 공격");
    }
}
 
class Zealot extends Unit {
    public void attack() {
        System.out.println("찌르기");
    }
 
    public void teleportation() {
        System.out.println("프로토스 워프");
    }
}
 
public class UnitExample {
    public static void main(String[] args) {
    
        Unit unit_up;
        Zealot zealot = new Zealot();
        
        // * 업캐스팅(upcasting)
		unit_up = (Unit) zealot;
		unit_up = zealot; // 업캐스팅은 형변환 괄호 생략 가능
    }
}












