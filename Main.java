
import java.util.Arrays;
import java.util.ArrayList;
public class Main{

    public static void main(String[] args){
        Main main = new Main();
        main.test();
    }

    public void test(){
        Pair p = new Pair<Integer,String>(5,"derp");
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}