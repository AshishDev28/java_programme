package programmes.array;

public class subarray {
    public static void subarrays(int numbers[]){
        int min=numbers[0],max=numbers[0];
        for (int i=0;i<numbers.length;i++){
           
            for(int j=i;j<numbers.length;j++){
                int sum=0;

                for(int k=i;k<=j;k++){
                   // System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                    if (min>sum){
                        min =sum;

                    }
                    if (max<sum){
                        max=sum;
                    }
                }
                System.out.println(sum);
               // System.out.println();
            }
            //System.out.println();

        }
        System.out.println("max "+max+" \nmin "+min);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        subarrays(numbers);
    }
    
}
