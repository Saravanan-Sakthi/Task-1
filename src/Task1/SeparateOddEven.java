package Task1;
import java.util.Arrays;
public class SeparateOddEven {
    Integer [] masterarray;
    SeparateOddEven(Integer [] masterarray){
        this.masterarray= masterarray;
    }
    void separateNumbers(){
        int iterator1=0;
        for (int iterator=0;iterator<masterarray.length;iterator++){
            if (masterarray[iterator]%2==0){
                masterarray[iterator]=masterarray[iterator]+masterarray[iterator1];
                masterarray[iterator1]=masterarray[iterator]-masterarray[iterator1];
                masterarray[iterator]=masterarray[iterator]-masterarray[iterator1++];
            }
        }
        System.out.println("The separated array: "+Arrays.toString(masterarray)+"\n");
    }
}
