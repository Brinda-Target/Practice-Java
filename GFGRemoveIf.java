import java.util.*;
public class GFGRemoveIf {
    public static void main(String[] args)
    {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(21);
        Numbers.add(32);
        Numbers.add(47);
        Numbers.add(63);

        Numbers.removeIf(n->(n%3==0));

        for(int i : Numbers){
            System.out.println(i);
        }
    }
}
