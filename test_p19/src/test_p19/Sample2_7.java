package test_p19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_7
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("请问你是男生吗？");
		System.out.println("请输入Y或N");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String string=br.readLine();
		char letter=string.charAt(0);
		if(letter=='Y'||letter=='y')
		{
			System.out.println("你是男生阿！");
		}
		else if(letter=='N'||letter=='n')
		{
			System.out.println("你是女生阿！");
		}
		else
		{
			System.out.println("请输入与Y或N");
				
		}
		}
	}

