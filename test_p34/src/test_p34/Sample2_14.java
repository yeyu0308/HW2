package test_p34;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_14
{
    public static void main(String[] args) throws IOException {
        System.out.println("Ҫ�����ڼ��εĴ����أ���1~10��");
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for (int i = 0; i < 10; i++)
        {

            if(i == res)
                continue;
            System.out.println("��"+i+"�εĴ���");
        }

    }
}