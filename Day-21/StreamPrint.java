import java.util.*;
public class StreamPrint {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int Sum=l.stream().filter(i->i%2==0).map(i->i*i).reduce(0,Integer::sum);
        System.out.println(Sum);
    }
}