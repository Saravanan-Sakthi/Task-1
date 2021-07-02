package Task1;
public class SumArray {
    Integer [] masterarray;
    SumArray(Integer [] masterarray){
        this.masterarray=masterarray;
    }
    void addAll(){
        int sum=0;
        for (int iterator=0;iterator<masterarray.length;iterator++){
            sum=sum+masterarray[iterator];
        }
        System.out.println("The sum of the elements is: "+sum+"\n");
    }
}
