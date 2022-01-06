package singletonEX;

//ȸ���� ��ü�� �����ؾ��� -> ȸ��� �� ��, ������ ȸ��� ���� �� X
public class Company {
	
	private static Company instance = new Company();
	private Company() {
		
	}
	
	//�ܺο��� getInstance()�� ����� �� �Ϲ� �޼ҵ�� �ν��Ͻ��� �����ϰ� ȣ���� �� �����Ƿ� static���� ����
	public static Company getInstance() {
		if (instance == null) instance = new Company();
		return instance;
	}
}
