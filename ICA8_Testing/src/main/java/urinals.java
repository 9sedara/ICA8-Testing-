

/*Author
    Sai Susmita Edara
 */


public class urinals {

    public static void main(String[] args) {

        System.out.println("Author:Sai Susmita Edara");
    }

    public boolean good_string(String str)
    {
        if(str.matches("[01][10]"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
