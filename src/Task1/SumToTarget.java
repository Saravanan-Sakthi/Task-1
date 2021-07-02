package Task1;
public class SumToTarget {
    Integer[] masterarray;
    int iterator1=0,outputs=0;
    SumToTarget(Integer [] masterarray){
        this.masterarray= masterarray;
    }
    void addToTarget(int target){
        if (iterator1<masterarray.length){
            for (int iterator=iterator1+1;iterator<masterarray.length;iterator++){
                if (masterarray[iterator1]+masterarray[iterator]==target){
                    System.out.println(masterarray[iterator1]+"+"+masterarray[iterator]+"="+target+"\n");
                    outputs++;
                }
            }
            iterator1++;
            addToTarget(target);
        }
        else if(outputs==0) System.out.println("No combination to get the target\n");
    }
}
