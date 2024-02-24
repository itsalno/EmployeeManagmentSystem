package BE;

public class Employee {

    private String name;
    private Float salary;
    private Long date;
    private Long phoneNumber;
    private int id;


    public Employee(int id,String name, Float salary, Long date, Long phoneNumber) {
        this.id=id;
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Float getSalary() {
        return salary;
    }

    public Long getDate() {
        return date;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }


}
