package Task1;
import java.util.Scanner;
public class RemoveElement {
    static Scanner getin= Task1TestRunner.getin;
    Integer [] masterarray;
    RemoveElement(Integer [] masterarray){
        this.masterarray=masterarray;
    }
    void remove(int element){
        int removed=0;
        System.out.print("The output: ");
        for (int iterator=0;iterator<masterarray.length;iterator++){
            if (masterarray[iterator]==element){
                removed++;
                continue;
            }
            System.out.print(masterarray[iterator]+" ");
        }
        System.out.println();
        if (removed==0) System.out.println("Element not found, no elements removed\n");
        else System.out.println();
    }
}
