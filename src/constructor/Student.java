package constructor;

public class Student {
	
	private int studentId;
	private String studentName;
	private int studentSSN;
	private int studentDOB;
	
	public Student(int studentId,String studentName, int studentSSN, int studentDOB){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSSN = studentSSN;
		this.studentDOB = studentDOB;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getStudentSSN() {
		return studentSSN;
	}
	public int getStudentDOB() {
		return studentDOB;
	}
	
	
	
	

}
