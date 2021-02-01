package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNum, double salary, String deptName) {
        super(name, niNum, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
