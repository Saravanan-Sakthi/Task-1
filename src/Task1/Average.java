package Task1;
public class Average {
    Integer [] masterarray;
    Average(Integer [] masterarray){
        this.masterarray= masterarray;
    }
    void averageExcept(){
        int min=masterarray[0], max=masterarray[0],mincount=1,maxcount=1;
        float sum=masterarray[0];
        for (int iterator=1;iterator<masterarray.length;iterator++){
            if (masterarray[iterator]==min) mincount++;
            if (masterarray[iterator]==max) maxcount++;
            if (masterarray[iterator]<min){
                min=masterarray[iterator];
                mincount=1;
            }
            if (masterarray[iterator]>max){
                max= masterarray[iterator];
                maxcount=1;
            }
            sum=sum+masterarray[iterator];
        }
        System.out.printf("The average of the numbers except largest and smallest is:%.2f\n\n",(sum-(min*mincount)-(max*maxcount))/(masterarray.length-mincount-maxcount));
    }
}
