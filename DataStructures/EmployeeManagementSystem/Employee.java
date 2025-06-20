class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int id, String name, String pos, double sal) {
        employeeId = id;
        this.name = name;
        position = pos;
        salary = sal;
    }

    public String toString() {
        return employeeId + ": " + name + " - " + position + " $" + salary;
    }
}

class EmployeeArray {
    Employee[] employees = new Employee[100];
    int count = 0;

    void add(Employee e) {
        employees[count++] = e;
    }

    Employee search(int id) {
        for (int i = 0; i < count; i++)
            if (employees[i].employeeId == id)
                return employees[i];
        return null;
    }

    void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++)
                    employees[j] = employees[j + 1];
                count--;
                break;
            }
        }
    }

    void traverse() {
        for (int i = 0; i < count; i++)
            System.out.println(employees[i]);
    }
}
