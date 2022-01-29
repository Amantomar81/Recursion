public class Remove {
    public static String remove(String str)
    {
        //Base case
        if(str.length() == 0)
        {
            return str;
        }
        String result = " ";
        if (str.charAt(0) != 'a')
        {
            result = result + str.charAt(0);

        }
        //recursive call
        String r = remove(str.substring(1));

        return result+r;

    }
    public static void main(String[] args) {
        String str = "abcdafa";
       
        System.out.println(remove(str));
    }
}

