package Task1;
public class EvenOdd {
    Integer [] masterarray;
    int even=0,odd=0;
    EvenOdd(Integer [] masterarray){
        this.masterarray= masterarray;
        checkNum();
    }
    void checkNum(){
        for (int iterator=0;iterator<masterarray.length;iterator++){
            if(masterarray[iterator]%2==0) even++;
            else odd++;
        }
        System.out.println("The number of even numbers: "+even+"\nThe number of odd numbers: "+odd+"\n");
    }
}
