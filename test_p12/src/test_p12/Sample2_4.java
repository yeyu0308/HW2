package test_p12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_4 {
public static void main(String[] args)throws IOException
{
	System.out.println("请输入整数");
	
	BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
	int num=Integer.parseInt(br.readLine());
	if (num==1)
	{
		System.out.println("输入的是1");
	}
	else if(num==2)
	{
		System.out.println("请输入1或2");
	
	}
}
}
