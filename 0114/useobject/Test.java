package useobject;

public class Test {

	public static void main(String[] args) {
		
		Student stu1 = new Student(100, "LEE");
		Student stu2 = new Student(100, "LEE");
		
		//equals�� ������ ���Ǵ� �� �ּҰ��� ������ ��
		System.out.println(stu1 == stu2);
		//�������� ������ ���ϱ� ���� overriding
		System.out.println(stu1.equals(stu2));
		
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
