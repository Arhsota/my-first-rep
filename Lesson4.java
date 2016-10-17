/**
 * Andrey Sevastyanov, author 17/10/2016 homework for lesson4, Java 1 17.10.2016.
 *
 */

class Lesson4 {
    public static void main(String[] args) {
        {
            Employee[] staff = new Employee[5];
            staff[0] = new Employee("Ivanov", "manager", "111", "a@b.com", 100, 25);
            staff[1] = new Employee("Petrov", "manager", "222", "b@b.com", 200, 70);
            staff[2] = new Employee("Sidorov", "manager", "333", "c@b.com", 200, 30);
            staff[3] = new Employee("Kozlov", "manager", "444", "d@b.com", 400, 60);
            staff[4] = new Employee("Petrovf", "manager", "555", "e@b.com", 200, 30);
             for (Employee e :staff) {
                 if (e.getAge() >= 40) {
                  System.out.println(e.getName() + ' ' + e.getRole() + ' ' + e.getTel() + ' ' + e.getEmail() + ' ' + e.getPayroll());
                 }
             }
        }
    }
}
     class Employee {
        String FIO;
        String role;
        String tel;
        String email;
        int payroll;
        int age;
       //constructor
        Employee(String FIO, String role, String tel, String email, int payroll, int age) { //constructor
            this.FIO = FIO;
            this.role = role;
            this.tel = tel;
            this.email = email;
            this.payroll = payroll;
            this.age = age;
        }
        // methods

        public String getName(){
            return FIO;
        }
        public String getRole(){
            return role;
        }
        public String getTel(){
            return tel;
        }
        public String getEmail(){
            return email;
        }
        int  getPayroll() {
            return payroll;
        }
        public int getAge(){
            return age;
        }
    }

