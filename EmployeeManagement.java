import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + " Name: " + name + " Salary: " + salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        while(true){
            System.out.println("\n1.Add 2.Update 3.Delete 4.Display 5.Exit");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter ID:");
                    int id = sc.nextInt();
                    System.out.print("Enter Name:");
                    String name = sc.next();
                    System.out.print("Enter Salary:");
                    double salary = sc.nextDouble();
                    list.add(new Employee(id,name,salary));
                    System.out.println("Employee Added");
                    break;

                case 2:
                    System.out.print("Enter ID to update:");
                    int uid = sc.nextInt();
                    for(Employee e:list){
                        if(e.id==uid){
                            System.out.print("New Name:");
                            e.name=sc.next();
                            System.out.print("New Salary:");
                            e.salary=sc.nextDouble();
                            System.out.println("Updated");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to delete:");
                    int did=sc.nextInt();
                    list.removeIf(e->e.id==did);
                    System.out.println("Deleted");
                    break;

                case 4:
                    for(Employee e:list){
                        System.out.println(e);
                    }
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}