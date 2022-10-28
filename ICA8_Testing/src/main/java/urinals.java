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

            System.out.println("valid String, print 0");
        }

    }
    public static boolean goodString(String str){
        for(int x=0;x<str.length();x++)
        {
            if(str.charAt(x)=='0' || str.charAt(x)=='1')
            {
                if(x>0 && str.charAt(x)=='1' && str.charAt(x-1)=='1')
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


    public static String getString(){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=scr.next();
        return str;
    }

}