
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    
*/
public class NewClass {
    public static void main(String[] args) {
        List<Emp> emplist = new ArrayList<>();
         emplist.add(new Emp("Mohamed", 30, 4000.0, setDate(3)));
         emplist.add(new Emp("Ahmed", 45, 7000.0, setDate(665)));
         emplist.add(new Emp("Moustafa", 25, 6000.0, setDate(2)));
         
         System.out.println(emplist);
         sortByDate(emplist);
         System.out.println(emplist);
    }
    
    private static Date setDate(int x){
     return new Date(System.currentTimeMillis()-x*24*60*60*1000);

    }
    
    private static void sortByName(List<Emp> emps){
        Collections.sort(emps,new Comparator<Emp>(){

            @Override
            public int compare(Emp o1, Emp o2) {
                return  o1.getName().compareTo(o2.getName());
            }
            
        });
    }
    
    private static void sortByAge(List<Emp> emps){
        Collections.sort(emps,new Comparator<Emp>() {

            @Override
            public int compare(Emp o1, Emp o2) {
            return  o1.getAge().compareTo(o2.getAge());
            }
        });
    }
    
    
    private static void sortBySalary(List<Emp> emps){
        Collections.sort(emps,new Comparator<Emp>() {

            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });
    }
    
    private static void sortByDate(List<Emp> emps){
        Collections.sort(emps,new Comparator<Emp>() {

            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getHireDate().compareTo(o2.getHireDate());
            }
        });
    }
}
