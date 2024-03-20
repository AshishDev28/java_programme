package array;

public class operation_in_array {
    public static void update(int numbers[]) {
    for(int i =0;  i  <  numbers.length;i++){
        numbers[i]=numbers[i]+1;
    }    
    }
    public static void main(String[] args) {
       // int marks[] =new int [50]; // by defalt null array
        int  numbers[] = {1,2,3,4,5}; // by default array size is count 5

        update(numbers);

        for (int i=0;i<numbers.length;i++ ){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    
}
