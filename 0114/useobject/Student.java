package useobject;

public class Student {

	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentNum + ", " + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student stu = (Student)obj;
			if(this.studentNum == stu.studentNum)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
