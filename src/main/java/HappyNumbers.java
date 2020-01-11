import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumbers {
    public boolean isHappyNumber(int n){
        Set<Integer> seen = new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            //n=getNext(n);
            int total =0;
            int j = n;
            while(j>0){
                int d = j%10;
                j=j/10;
                total += d * d;
            }
            n = total;
        }
        return n==1;
    }
    private int getNext(int j){
        int total = 0;
        while(j>0){
            int d = j%10;
            j=j/10;
            total += d * d;
        }
        return total;
    }

}
