package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> empList;

    public Employee() {
        empList = new ArrayList<>();
    }

    public Employee(List<String> empList) {
        this.empList = empList;
    }

    public void loadData() {
        empList.add("Paweł");
        empList.add("Darek");
        empList.add("Jurek");
        empList.add("Kaziu");
        empList.add("Janek");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() {
        List<String> temp = new ArrayList<>();
        for (String s : empList) {
            temp.add(s);
        }
        return new Employee(temp);
    }
}
