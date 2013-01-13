import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Teste2 {

	public Teste2(){
		int t;
		Scanner sc = new Scanner(System.in).useDelimiter(" ");
		
		try {
			t = sc.nextInt();
			ArrayList<Integer> array1 = new ArrayList<Integer>();
				for (int i =0; i< t; i++){
					
					while(sc.hasNextInt()){
							int x = sc.nextInt();
							if(!array1.contains(x)){	
								array1.add(x);		
						}
					}
				
					Collections.sort(array1);
				}
				
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public static void main(String[] args) {
		{
		// TODO Auto-generated method stub
			new Teste2();
		}	
		
	}
}
