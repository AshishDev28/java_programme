package programmes.loop;

public class nested_loop {
    public static void main(String[] args){

        int i,j;

        // outer loop 
        for (i =1;i<=2;i++){
            System.out.println("outer " +i);
            //inner loop
            for (j=1;j<=3;j++){
                System.out.println("Inner "+j);
            }
        }
    }
    
}
