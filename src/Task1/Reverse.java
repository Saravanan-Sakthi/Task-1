package Task1;
import java.util.Arrays;
public class Reverse {
    Integer [] masterarray;
    Reverse(Integer [] masterarray){
        this.masterarray= masterarray;
    }
    void reverseArray(){
        for (int iteratorfor=0,iteratorrev=masterarray.length-1;iteratorfor<iteratorrev;iteratorfor++,iteratorrev--){
            masterarray[iteratorfor]=masterarray[iteratorfor]+masterarray[iteratorrev];
            masterarray[iteratorrev]=masterarray[iteratorfor]-masterarray[iteratorrev];
            masterarray[iteratorfor]=masterarray[iteratorfor]-masterarray[iteratorrev];
        }
        //String output=Arrays.toString(masterarray);
        System.out.println("The reversed array: "+Arrays.toString(masterarray));
    }
}
