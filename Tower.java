import java.util.stream.Stream;

public class Tower {
    public static void Hanoi(int n, String src , String helper, String dest)
    {
        if (n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        Hanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    }
    public static void main(String[] args) {
        int n=3;
        Hanoi(n,"S","H","D");
    }
}
