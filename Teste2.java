import java.util.Scanner;


public class Teste2 {

	public Teste2(){
		int t;
		Scanner sc = new Scanner(System.in);
		
		try {
			t = sc.nextInt();
			int[] seq = new int[t];
			
			if ( (t > 0) && (t <= Math.pow(10, 5)) ){
				for (int i =0; i< t; i++){
					
					if(sc.hasNextInt()){
						if((sc.nextInt() < 0) || sc.nextInt()  > (Math.pow(2, 31) -1)  ){
							break;
						}else{
							if( (i == 0) ){
								seq[i] = sc.nextInt();
							}else{
								if((seq[i] > seq[i -1])){
									if(i >=2 ){
										if( seq[i] == seq[i-2]){
											break;
										}else{
											seq[i] = sc.nextInt();
										}
									}
								}else{
									break;
								}
							}
						}
					}
					
					System.out.println(seq[i]);
				}
			}
			
			/* um for pra gerar uma string do seq -> S{n, n+1, n+2} e adicionar numa lista, verificando se já existe utilizando o método contains()
			 * https://www.interviewstreet.com/challenges/dashboard/#problem/50bff669014b8
			 */
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
