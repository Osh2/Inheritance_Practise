package staff;

import com.sun.xml.internal.ws.util.StringUtils;

import static java.lang.Boolean.parseBoolean;

public abstract class Employee {

    private String name;
    private String niNum;
    private double salary;

    public Employee(String name, String niNum, double salary){
        this.name = name;
        this.niNum = niNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNum() {
        return niNum;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase){
        if(increase > 0){
        salary += increase;
        }
    }

    public double payBonus(){
        return Math.round(salary/100);
    }

    public void setName(String name) {
        if(name != null && name.length() != 0) {
            this.name = name;
        }
    }
}
