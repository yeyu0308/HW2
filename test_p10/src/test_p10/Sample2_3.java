package test_p10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_3 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("请输入整数");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		int num=Integer.parseInt(br.readLine());
		if(num==1)
		{
			System.out.println("输入的是1");
	}
	else
	{
		System.out.println("选择的是1以外的数字");
		
	}
		
		
	}

}
