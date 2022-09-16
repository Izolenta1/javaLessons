package lab3;

import java.util.ArrayList;

public class Part3Report {
    private ArrayList<Part3Employee> employeeMas;

    public Part3Report() {
        this.employeeMas = new ArrayList<>();
    }

    public void addEmployee(Part3Employee employee) {
        employeeMas.add(employee);
    }

    public void generateReport() {
        for (int i = 0; i < this.employeeMas.size(); i++) {
//            System.out.printf("%.2f%n", employeeMas.get(i).getSalary());
            String str = String.format("%-20s - %.2f", employeeMas.get(i).getFullname(), employeeMas.get(i).getSalary());
            System.out.println(str);
        }
    }
}
