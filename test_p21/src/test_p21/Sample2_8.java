package test_p21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_8 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("����Ҫѡ������·��");
		System.out.println("����������Y��N");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int res=Integer.parseInt(str);
		char ans=(res==1)?'A':'B';
		System.out.println("ѡ����"+ans+"·��");

}
}