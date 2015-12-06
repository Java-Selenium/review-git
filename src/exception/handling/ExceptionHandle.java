package exception.handling;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		int num = 10;
		int result = 0;
		try{
		
			result = 10/0;
		
		}catch(Exception ex){
		
			System.out.println(ex);
		}
		//System.out.println(result);
	}

}
