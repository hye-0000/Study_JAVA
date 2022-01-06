package singletonEX;

//회사라는 객체는 유일해야함 -> 회사는 한 개, 동일한 회사는 있을 수 X
public class Company {
	
	private static Company instance = new Company();
	private Company() {
		
	}
	
	//외부에서 getInstance()를 사용할 때 일반 메소드면 인스턴스를 생성하고 호출할 수 있으므로 static으로 생성
	public static Company getInstance() {
		if (instance == null) instance = new Company();
		return instance;
	}
}
