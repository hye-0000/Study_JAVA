package singletonEX;

public class Test {

	public static void main(String[] args) {
		  
		//�Ϲ� �޼ҵ�� ������ ������ ȣ���� �ϱ� ���� �ν��Ͻ��� ������ ������
		//�ν��Ͻ��� �������� �ʰ� �ٷ� ����� ���̱� ������ getInstance()�� static���� ���� �Ǿ�� ��
		Company company = Company.getInstance();
		System.out.println(company);
	}

}
