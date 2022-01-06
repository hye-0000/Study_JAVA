package singletonEX;

public class Test {

	public static void main(String[] args) {
		  
		//일반 메소드로 선언을 했으면 호출을 하기 위해 인스턴스를 만들어야 하지만
		//인스턴스를 생성하지 않고 바로 사용할 것이기 때문에 getInstance()는 static으로 선언 되어야 함
		Company company = Company.getInstance();
		System.out.println(company);
	}

}
