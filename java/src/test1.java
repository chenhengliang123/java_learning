import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class test1 {
    public static void main(String[] args)
    {
        int[] numbers = new int[1000];

        Date t1= new Date();
        int a = 0;
        for(int i = 0;i < numbers.length;i++)
        {
            a++;
            System.out.println((numbers[i] = a * 2));
        }

        Date t2 = new Date();
        System.out.println("执行时间为："+ (t2.getTime()-t1.getTime())+"毫秒");

    }
}
