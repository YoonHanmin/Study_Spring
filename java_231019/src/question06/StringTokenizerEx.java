package question06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) throws IOException {
//		String str = "홍길동/장화/홍련/콩쥐/팥쥐";
//		StringTokenizer st = new StringTokenizer(str,"/");
//		
//		
//		
//		while(st.hasMoreTokens()) {
//		System.out.println(st.nextToken());
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s); 
			
				bw.write(st.nextToken());
				bw.write(st.nextToken());
				bw.write(st.nextToken());
			
				bw.close();
		
		
	}
}
