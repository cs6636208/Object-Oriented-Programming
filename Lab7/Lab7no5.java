
class Employee {

    protected int id;
    protected String name;
    protected double salary;
    protected Address address;

    public Employee() {
    }

    public Employee(int id, String name, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getDetails() {
        return "ID = " + id + ", Name = " + name + ", Salary = " + salary + ", Address = " + address.getAddressInfo();
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

class Manager extends Employee {

    protected String parkingNo;

    public Manager() {
    }

    public Manager(int id, String name, double salary, Address address, String parkingNo) {
        super(id, name, salary, address);
        this.parkingNo = parkingNo;
    }

    public String getParkingNo() {
        return parkingNo;
    }

    public void setParkingNo(String parkingNo) {
        this.parkingNo = parkingNo;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Parking No = " + parkingNo;
    }

}

class Address {

    protected String street;
    protected String city;

    public Address() {
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressInfo() {
        return street + ", " + city;
    }
}

public class Lab7no5 {

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Thongthat Lamthong", 100000.0, new Address("Ramkhamhaeng Rd. 142", "Bangkok"));
        System.out.println("Employee Details: " + emp.getDetails());
        Manager mng = new Manager(2, "Nadech Kugimiya", 85000.0, new Address("Phaya Thai Rd.", "Bangkok"), "TR23-1");
        System.out.println("Manager Details: " + mng.getDetails());
    }
}
