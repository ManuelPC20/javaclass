public class Encapsulation {
    public static void main(String args[]) {
        Department sales = new Department(1, "Sales", "John");
        Employee emp1 = new Employee("john", 52145, 100000, sales);
        emp1.setEmpNo(52145);
        emp1.setName("john");
        emp1.setSalary(100000);
        System.out.println("Employee no: " + emp1.getEmpNo() + "\tEmployee name: " + emp1.getName() + "\tEmployee salary: " + emp1.getSalary() + "\tDepartment: " + emp1.getDepartment().getName() + ", In Charge: " + emp1.getDepartment().getInCharge());

        Department marketing = new Department(2, "Marketing", "Jane");
        Employee emp2 = new Employee("jane", 32645, 15000, marketing);
        emp2.setEmpNo(52645);
        emp2.setName("jane");
        emp2.setSalary(500000);
        System.out.println("Employee no: " + emp2.getEmpNo() + "\tEmployee name: " + emp2.getName() + "\tEmployee salary: " + emp2.getSalary() + "\tDepartment: " + emp2.getDepartment().getName() + ", In Charge: " + emp2.getDepartment().getInCharge());
    }

    static class Employee {
        private String name;
        private int empno;
        private float salary;
        private Department department;

        public Employee(String name, int empno, float salary, Department department) {
            this.name = name;
            this.empno = empno;
            this.salary = salary;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public int getEmpNo() {
            return empno;
        }

        public void setEmpNo(int empno) {
            this.empno = empno;
        }

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }
    }

    static class Department {
        private int id;
        private String name;
        private String inCharge;

        public Department(int id, String name, String inCharge) {
            this.id = id;
            this.name = name;
            this.inCharge = inCharge;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInCharge() {
            return inCharge;
        }

        public void setInCharge(String inCharge) {
            this.inCharge = inCharge;
        }
    }
}
