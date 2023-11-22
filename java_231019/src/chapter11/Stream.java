package chapter11;

import java.io.IOException;
import java.io.InputStream;

public class Stream {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		int a = is.read();	
		System.out.println(a);
			}
	
	}

