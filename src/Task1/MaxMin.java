package Task1;
import java.util.Arrays;
public class MaxMin {
    Integer [] masterarray;
    MaxMin(Integer [] masterarray){
        this.masterarray= masterarray;
    }
    void findMaxMin(){
        Arrays.sort(masterarray);
        System.out.println("The maximum element is: "+masterarray[masterarray.length-1]+"\nThe minimum element is: "+masterarray[0]);
    }
}
