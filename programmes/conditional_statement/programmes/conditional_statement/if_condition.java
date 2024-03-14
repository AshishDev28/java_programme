package programmes.conditional_statement;

public class if_condition {
    public static void main(String[] args){
        
        // test two values to find out if x is greator than y 
        //if  condition is true 
        //then execute statemant
        
        if (20>10) {
            System.out.println("condition true !!");
            System.out.println("20 is greator than 10..");            
        }

        // we can also test by variable
        int x = 50;
        int y= 20;
        if(x>y){
            System.out.println("condition true !!");
            System.out.println("x is greator than y.."); 
        }
    }
}
