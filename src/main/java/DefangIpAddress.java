import java.util.Arrays;
import java.util.StringTokenizer;

public class DefangIpAddress {
    public String defangIPaddr(String address) {
        StringTokenizer stringTokenizer=new StringTokenizer(address,".");
        StringBuilder builder = new StringBuilder();
        while(stringTokenizer.hasMoreTokens()){
            builder.append(stringTokenizer.nextToken());
            if(stringTokenizer.hasMoreElements())builder.append("[.]");
        }
        return builder.toString();
    }
}
