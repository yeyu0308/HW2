package test_p47;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Sample2_21
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("������5���˵ķ���");
        Integer test[] = new Integer[5];

        for (int i = 0; i < test.length; i++)
        {
            String str = br.readLine();
            test[i]=Integer.parseInt(str);
        }

        Arrays.sort(test, Collections.reverseOrder());

        for (int i = 0; i < test.length; i++)
        {
            System.out.println("��"+(i+1)+"���ķ�����"+test[i]);
        }
    }
}
