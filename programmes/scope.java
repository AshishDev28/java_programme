
public class scope {
    public static void function(String globalvar){
       // System.out.println(localvar);     // HERE WE CANT USE A LOCAL VARIABLE OUT OF SCOPE
        System.out.println(globalvar);
        int localvar=10;
        System.out.println(localvar);
    }

    public static void main(String[] args) {
        String globalvar="this is a local variable";
        final int finalvar=20;
        // finalvar=50;                 // HERE A FINAL VAR CANT BE CHANGE ONCE IT ASSIGN BY  FINAL KEYWORD; 
        System.out.println(finalvar);
       //System.out.println(x);         // HERE WE CANT USE A LOCAL VARIABLE OUT OF SCOPE
        function(globalvar);
    }
    
}
