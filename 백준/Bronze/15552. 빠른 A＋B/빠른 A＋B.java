import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bl = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer AB;
		
		int T = Integer.parseInt(bl.readLine());
		
		for (int i = 0; i < T; i++) {
			AB = new StringTokenizer(bl.readLine());
			bw.write((Integer.parseInt(AB.nextToken())+Integer.parseInt(AB.nextToken()))+"\n");
		}
		bw.close();
		
	}
	}

