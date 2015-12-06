package useofsuper;

public class Father {

	String lastName;
	String profession = "Engineer";
	
	public Father(String lastName){
		this.lastName = lastName;
		System.out.println(lastName);
	}
	
	public void appearance(){
		System.out.println("mid size height");
	}
}
