package Task1;
import java.util.Arrays;
public class SortArray {
    Integer [] masterarray;
    SortArray(Integer [] masterarray){
        this.masterarray= masterarray;
    }
    void sortArray(){
        Arrays.sort(masterarray);
        System.out.println("The sorted array: "+ Arrays.toString(masterarray)+"\n");
    }
}
