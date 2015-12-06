package datareader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UseBufferedReader {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		String path = "C:/Users/rrt/Desktop/sample.txt";
		String st = "";
		
		try{
			
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
		}catch(Exception ex){
			System.out.println("File is not found, probably it is located at different locaton, please check the path");
		}
		
		try {
			while((st=br.readLine())!= null){
				System.out.println(st);
			}
		} catch (IOException e) {
		
			e.printStackTrace();
			
		}finally{
			try{
				if(br != null)
					br.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	
	}

}
