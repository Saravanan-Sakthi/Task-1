package Task1;
import java.util.Arrays;
import java.util.Scanner;
public class InsertElement {
    static Scanner getin= Task1TestRunner.getin;
    String [] masterarray;
    InsertElement(String [] masterarray){
        this.masterarray= masterarray;
    }
    void addElement(String element, int index){
        if (index<0 || index>masterarray.length-1) System.out.println("Index out of bounds\n");
        else{
            for (int iterator=masterarray.length-1;iterator>index;iterator--){
                masterarray[iterator]=masterarray[iterator-1];
            }
            masterarray[index]=element;
            System.out.print("The final array: " );
            System.out.print(Arrays.toString(masterarray));
            System.out.println();
        }
    }
}
