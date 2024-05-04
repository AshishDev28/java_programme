package programmes.array;

public class sum_elements {

    public static int sum(int numbers){
        for (int i =0 ;i<numbers.length;i++){
            int add ;
            add = add + numbers[i];

        }
        return add;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,2,4,2,5,3,2,54,2};
        sum(numbers);
    }
    
}
