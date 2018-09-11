
import java.io.Serializable;
import java.util.Date;
//Java Bean -> POJO plain old java object
public class Emp implements Serializable{
    private String name;
    private Integer age;
    private Double salary;
    private Date hireDate;

    public Emp() {
    }

    public Emp(String name, Integer age, Double salary, Date hireDate) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return name+" : "+age+" : "+hireDate+" : "+salary;
    }

    

    
    
    
}
