package test_p19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_7
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("��������������");
		System.out.println("������Y��N");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String string=br.readLine();
		char letter=string.charAt(0);
		if(letter=='Y'||letter=='y')
		{
			System.out.println("������������");
		}
		else if(letter=='N'||letter=='n')
		{
			System.out.println("����Ů������");
		}
		else
		{
			System.out.println("��������Y��N");
				
		}
		}
	}

