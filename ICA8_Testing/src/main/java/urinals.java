import java.util.Scanner;

//Author:Sai Susmita Edara

public class urinals {
    public static void main(String[] args) {
        String str= getString();
        boolean a=goodString(str);
        if(a==false)
        {
            System.out.println("invalid string, print -1");
        }
        else {
            int b=urinalscount(str);
            System.out.println(b);
        }

    }
    public static boolean goodString(String str){
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0' || str.charAt(i)=='1')
            {
                if(i>0 && str.charAt(i)=='1' && str.charAt(i-1)=='1')
                {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static int urinalscount(String str)
    {
        int[]p=new int[str.length()];
        for(int i=0;i<p.length;i++)
        {
            p[i]=0;
        }
        for(int i=0;i<str.length();i++)
        {
            if(i==0)
            {
                if(str.charAt(i)=='0')
                {
                    if(i+1<str.length()) {
                        if (str.charAt(i + 1) == '1') {
                            p[i] = 0;
                        } else {
                            p[i] = 1;
                        }
                    }
                }
                else {
                    p[i]=0;
                }
            }
            else if(i==1)
            {
                if(str.charAt(i)=='1') {
                    p[i] = p[i - 1];
                }
                else
                {
                    if(str.charAt(i-1)=='1')
                    {
                        p[i]=p[i-1];
                    }
                    else if(i+1<str.length() && str.charAt(i+1)=='1')
                    {
                        p[i]=p[i-1];
                    }
                    else
                    {
                        p[i]=1;
                    }
                }
            }
            else {
                p[i]=p[i-1];
                if(str.charAt(i)=='1') {
                    p[i] = p[i - 1];
                }
                else
                {
                    if(str.charAt(i-1)=='1')
                    {
                        p[i]=p[i-1];
                    }
                    else if(i+1<str.length() && str.charAt(i+1)=='1')
                    {
                        p[i]=p[i-1];
                    }
                    else
                    {
                        p[i]=Math.max(p[i],1+p[i-2]);
                    }
                }
            }
        }
        return p[str.length()-1];
    }
    public static String getString(){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=scr.next();
        return str;
    }

}