public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 32482, 1);
        employees[1] = new Employee("Иванов1 Иван1 Иванович", 33000, 2);
        employees[2] = new Employee("Иванов2 Иван2 Иванович", 31000, 3);
        employees[3] = new Employee("Иванов3 Иван3 Иванович", 35231, 4);
        employees[4] = new Employee("Иванов4 Иван4 Иванович", 41000, 5);
        employees[5] = new Employee("Иванов5 Иван5 Иванович", 36234, 1);
        employees[6] = new Employee("Иванов6 Иван6 Иванович", 42664, 2);
        employees[7] = new Employee("Иванов7 Иван7 Иванович", 55000, 3);
        employees[8] = new Employee("Иванов8 Иван8 Иванович", 25000, 4);
        employees[9] = new Employee("Иванов9 Иван9 Иванович", 48332, 5);

        printInfoEmployee(employees); // печать полной информации о всех сотрудниках (8.a)
        double allSalary = getAllSalary(employees); // зарплата всех сотрудников (8.b)
        System.out.println("Сумма всех зарплат " + allSalary);
        System.out.println("Сотрудник с минимальной зарплатой - "+getEmployeeMinSalary(employees)); // Сотрудник с минимальной зарплатой (8.c)
        System.out.println("Сотрудник с максимальной зарплатой - " + getEmployeeMaxSalary(employees)); // Сотдрудник с максимальной зарплатой (8.d)
        double averageSalary = allSalary/employees.length; // средняя зарплата (8.e)
        System.out.println("Средняя зарплата " + averageSalary);
        printFullNameEmployee(employees); // печать ФИО всех сотрудников (8.f)


    }

    public static void printInfoEmployee(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printFullNameEmployee(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName());
        }
    }

    public static double getAllSalary(Employee[] arr) {
        int allSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            allSalary += arr[i].getSalary();
        }
        return allSalary;
    }

    public static Employee getEmployeeMinSalary(Employee[] arr) {
        int min = Integer.MAX_VALUE;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() < min) {
                min = arr[i].getSalary();
            }
            if (min == arr[i].getSalary()) {
                x = i;
            }
        }
        return arr[x];
    }

    public static Employee getEmployeeMaxSalary(Employee[] arr) {
        int max = Integer.MIN_VALUE;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() > max) {
                max = arr[i].getSalary();
            }
            if (max == arr[i].getSalary()) {
                x = i;
            }
        }
        return arr[x];
    }
}
