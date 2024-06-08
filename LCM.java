//This program prints the LCM of two numbers in Java

public class LCM {
    public static void main(String args[])
    {
        int a = 10;
        int b = 15;
        int max = Math.max(a,b);
        int mul = a*b;
        int ans = max;
        for(int i=max;i<=mul;i++)
        {
            if(i%a==0 && i%b==0)
            {
                ans = i;
                break;
            }
        }
        System.out.println("LCM of "+a+" and "+b+" = "+ans);
    }
}