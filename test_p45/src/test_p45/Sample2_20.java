package test_p45;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_20
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("������5���˵ķ���");
        int test[] = new int[5];

        for (int i = 0; i < test.length; i++)
        {
            String str = br.readLine();
            test[i]=Integer.parseInt(str);
        }

        for (int s = 0; s < test.length; s++)
        {
            for (int t = s+1; t < test.length; t++)
            {
                if(test[t]>test[s])
                {
                    int tmp = test[t];
                    test[t] = test[s];
                    test[s] = tmp;
                }
            }
        }

        for (int i = 0; i < test.length; i++)
        {
            System.out.println("��"+(i+1)+"���ķ�����"+test[i]);
        }

    }
}