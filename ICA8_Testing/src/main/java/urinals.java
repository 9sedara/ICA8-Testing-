import java.util.Scanner;

//Author:Sai Susmita Edara

public class urinals {




    public static void main(String[] args) {
        String ln= getString();
        boolean a=goodString(ln);
        if(a==false)
        {
            System.out.println("invalid string");
        }
        else {
            int b=urinals_count(ln);
            System.out.println(b);
        }

    }
    public static boolean goodString(String ln){
        for(int i=0;i<ln.length();i++)
        {
            if(ln.charAt(i)=='0' || ln.charAt(i)=='1')
            {
                if(i>0 && ln.charAt(i)=='1' && ln.charAt(i-1)=='1')
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

    public static int urinals_count(String ln)
    {
        int[]p=new int[ln.length()];
        for(int i=0;i<p.length;i++)
        {
            p[i]=0;
        }
        for(int i=0;i<ln.length();i++)
        {
            if(i==0)
            {
                if(ln.charAt(i)=='0')
                {
                    if(i+1<ln.length()) {
                        if (ln.charAt(i + 1) == '1') {
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
                if(ln.charAt(i)=='1') {
                    p[i] = p[i - 1];
                }
                else
                {
                    if(ln.charAt(i-1)=='1')
                    {
                        p[i]=p[i-1];
                    }
                    else if(i+1<ln.length() && ln.charAt(i+1)=='1')
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
                if(ln.charAt(i)=='1') {
                    p[i] = p[i - 1];
                }
                else
                {
                    if(ln.charAt(i-1)=='1')
                    {
                        p[i]=p[i-1];
                    }
                    else if(i+1<ln.length() && ln.charAt(i+1)=='1')
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
        return p[ln.length()-1];
    }
    public static String getString(){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter string:");
        String ln=scr.next();
        return ln;
    }

}