package creational.prototype;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.loadData();

        Employee employee1 = (Employee) employee.clone();
        Employee employee2 = (Employee) employee.clone();

        List<String> list = employee1.getEmpList();
        list.add("John");
        List<String> list1 = employee2.getEmpList();
        list1.remove("Paweł");

        System.out.println("Oryginal: " + employee.getEmpList());
        System.out.println("list1" + list);
        System.out.println("list2" + list1);
    }
}
