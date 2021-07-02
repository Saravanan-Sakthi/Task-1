package Task1;
public class MaxMin {
    Integer [] masterarray;
    MaxMin(Integer [] masterarray){
        this.masterarray= masterarray;
    }
    void findMaxMin(){
        int min=masterarray[0], max= masterarray[0];
        for (int iterator=0;iterator<masterarray.length;iterator++){
            if (masterarray[iterator]<min){
                min=masterarray[iterator];
            }
            if (masterarray[iterator]>max){
                max= masterarray[iterator];
            }
        }
        System.out.println("The maximum element is: "+max+"\nThe minimum element is: "+min);
    }
}
