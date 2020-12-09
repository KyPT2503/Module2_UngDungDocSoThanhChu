import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int numberInString;
        boolean isChecking=true;
        while(isChecking==true)
        {
            numberInString=scanner.nextInt();
            System.out.println(read(numberInString));
            isChecking=scanner.nextBoolean();
        }
    }
    static String read(int number)
    {
        if(number<11)
        {
            if(number==0) return "zero";
            if(number==1) return "one";
            if(number==2) return "two";
            if(number==3) return "three";
            if(number==4) return "four";
            if(number==5) return "five";
            if(number==6) return "six";
            if(number==7) return "seven";
            if(number==8) return "eight";
            if(number==9) return "nine";
            if(number==10) return "ten";
        }
        if(number<20)
        {
            if(number==11) return "eleven";
            if(number==12) return "twelve";
            if(number==13) return "thirteen";
            if(number==15) return "fifteen";
            return read(number-10)+"teen";
        }
        if(number<100)
        {
            if(number%10==0)
            {
                if(number==20) return "twenty";
                if(number==30) return "thirty";
                if(number==50) return "fifty";
                return read(number/10)+"ty";
            }
            else
            {
                return read(number/10*10)+" "+read(number%10);
            }
        }
        if(number<1000)
        {
            if(number%100==0)
            {
                return read(number/100)+" hundred";
            }
            return read(number/100)+" hundred "+read(number%100);
        }
        return "Out of range!";
    }
}
