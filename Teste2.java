import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Teste2 {

	private ArrayList<Integer> iarr;
	public Teste2() throws IOException {
		
		try {
			int t;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			t = Integer.parseInt(br.readLine());
			String s = br.readLine();
			
			iarr = this.gerarArrayInt(s, t);
	
			
			
		
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Integer> gerarArrayInt(String s, int tamanho){
		
		int t = tamanho;
		String[] sarr = new String[t];
        iarr = new ArrayList<Integer>();
		String s1 = s;
		
		for (int i = 0; i < t; i++) {
			sarr = s1.split("\\s+");
		}
		Arrays.sort(sarr);
		for(String str: sarr){
			if(!iarr.contains(Integer.parseInt(str.toString()))){
				iarr.add(Integer.parseInt(str.toString()));
			}
		}
		
		return iarr;
	}
	
	public static void main(String[] args) throws IOException {
		{
			// TODO Auto-generated method stub
			new Teste2();
		}

	}
}
