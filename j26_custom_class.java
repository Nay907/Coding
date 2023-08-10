class employee{
    int id;
    int salary;
    String name;
    String address;
    char chr;
    String details;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
        System.out.println("my fav char is " + chr);
        System.out.println("salary is " + salary);
        System.out.println("education  is " + details);
        System.out.println("address is " + address);
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getsalary(){
        return salary;
    }
    public String getdetails(){
        return details;
    }
    public String getaddress(){
        return address;
    }
}
public class j26_custom_class {
    public static void main(String[] args) {

        employee gaurav = new employee(); // Instaiating a new employee object 
        // setting attribute 
       gaurav.id = 15;
       gaurav.salary = 34;
       gaurav.name = "gaurav katiyar";
       gaurav.chr = 'G'; 
       gaurav.details = "CSE CORE STUDENT";
       gaurav.address = "607 near sbi bank rajpur";
       
        gaurav.printDetails();
        /*int id = gaurav.getid();
        System.out.println(id);
        String name= gaurav.getname();
        System.out.println(name);
        int salary = gaurav.getsalary();
        System.out.println(salary);
        String details = gaurav.getdetails();
        System.out.println(details);
        String address = gaurav.getaddress();
        System.out.println(address);*/
        
      
    }
    
} 
