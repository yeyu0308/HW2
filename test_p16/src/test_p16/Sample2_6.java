package test_p16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_6 {
	public static void main(String[] args)throws IOException{
		
		System.out.println("������a��b");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String string=br.readLine();
		char letter=string.charAt(0);
		
		switch(letter)
		{
		case'a':
		{
			System.out.println("�������a");
			break;
		}
		case'b':
		{
			System.out.println("�������b");
			break;
		}
		default:
		{
			System.out.println("������a��b");
			break;
		}
		}
		}
		}
