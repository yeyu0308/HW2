package test_p14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_5 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("����������");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		switch(num)
		{
		case 1:
		{
			System.out.println("�������1");
			break;
		}
		case 2 :
		{
			System.out.println("�������2");
			break;
		}
		default:
		{
			System.out.println("������1��2");
			break;
			
		}
		}
		
	}

}
