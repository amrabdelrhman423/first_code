/*

 */
public class NewClass5 {
    public static <T> void printX(T ... x){
        for (T y : x) {
            System.out.println(y); 
        }
    }

    
    
    
    public static void main(String[] args) {
        printX(1,2,3);
        printX("A","B","C");
        printX(23.0,4.5);
        printX(2.15478,24.3658);
    }
 
}
