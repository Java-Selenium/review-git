package constructor;

public class TestStudent {

	public static void main(String[] args) {
		
		Student st1 = new Student(2356,"Mike Henderson",108673241,9101985);
		
		System.out.println(st1.getStudentId()+" "+st1.getStudentName()+" "+st1.getStudentSSN()+" "+st1.getStudentDOB());
		
		Student st2 = new Student(4578,"Doreen Zubrin",8932709,10671980);

		System.out.println(st2.getStudentId()+" "+st2.getStudentName()+" "+st2.getStudentSSN()+" "+st2.getStudentDOB());
	}

}
