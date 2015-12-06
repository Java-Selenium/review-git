package useofsuper;

public class Child extends Father{
	
	public Child(){
	   super("clinton");
	}
	public String getProfession(){
		
		return super.profession;
	}
	public void appearanceOfChild(){
		super.appearance();
		System.out.println("Son look like his father");
	}

}
