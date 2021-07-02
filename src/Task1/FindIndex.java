package Task1;
import java.util.Scanner;
public class FindIndex {
    static Scanner getin= Task1TestRunner.getin;
    Integer [] masterarray;
    int outputs=0;
    FindIndex(Integer [] arrayofinterest){
        this.masterarray=arrayofinterest;
    }
    void searchFor(int key,int index){
        if (masterarray[index]==key){
            if (outputs==0){
                System.out.print("The element is present in : "+ index);
                outputs++;
            }
            else System.out.print(", "+index);
            if (index==masterarray.length-1) System.out.println();
            if (index+1<masterarray.length)searchFor(key,index+1);
        }
        else if(masterarray[index]!=key){
            if (index==masterarray.length-1){
                if (outputs==0)System.out.println("The element is not present in the array\n");
                else System.out.println("\n");
            }
            else searchFor(key,index+1);
        }
    }
}
