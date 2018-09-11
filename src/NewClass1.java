
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class NewClass1 {

    public static void main(String[] args) {
//        List<Emp> emplist = new ArrayList<>();
//        emplist.add(new Emp("Mohamed", 30, 4000.0, setDate(3)));
//        emplist.add(new Emp("Ahmed", 45, 7000.0, setDate(665)));
//        emplist.add(new Emp("Moustafa", 25, 6000.0, setDate(2)));
        
        //save(emplist);
        List<Emp> read = read();
        System.out.println(read);
    }

    private static Date setDate(int x) {
        return new Date(System.currentTimeMillis() - x * 24 * 60 * 60 * 1000);

    }

    private static void save(List<Emp> emps) {
        try {
            FileOutputStream fos = new FileOutputStream("emps.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emps);
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static List<Emp> read() {
        List<Emp> emps = null;
        try {
            FileInputStream fis = new FileInputStream("emps.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            emps = (List<Emp>) ois.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emps;
    }

}
