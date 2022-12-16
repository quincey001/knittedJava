package OOPS;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
    public Customer (String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }

    public Customer(){
        this("jackson wang","jaskcon@gmail.com");
    }
    public Customer(String name, String email){
        this(name, 40,email);
    }
    public static void main(String[] args){
        Customer customer = new Customer("james",399,"j@gmail.com");
        System.out.println(customer.toString());//Customer{name='james', creditLimit=399.0, email='j@gmail.com'}

        Customer customer1 = new Customer();
        System.out.println(customer1.toString());//Customer{name='jackson wang', creditLimit=40.0, email='jaskcon@gmail.com'}

        //public defined variables can be accessed from inside and outsides of the packages.
        CodingExercise30 c = new CodingExercise30();

        System.out.println(c.schoolName);
    }
}
