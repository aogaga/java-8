import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Developer {

    private String name;
    private BigDecimal salary;
    private Integer age;

    public Developer(String name, BigDecimal salary, Integer age){

        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return " I am  " + this.name + " and I make "+  this.salary + " and yes i am " + this.age + " old";
    }

    public static List<Developer> getDevelopers() {
        List<Developer> developers = new ArrayList<Developer>();
        developers.add(new Developer("Ogaga Agi", new BigDecimal("120000"), 32));
        developers.add(new Developer("Tim Carson", new BigDecimal("130000"), 30));
        developers.add(new Developer("Mike Branson", new BigDecimal("5000"), 28));
        developers.add(new Developer("Judge Miller", new BigDecimal("2000"), 26));
        developers.add(new Developer("Bryson Edwards", new BigDecimal("50000000"), 40));
        developers.add(new Developer("James Madden", new BigDecimal("350000"), 38));

        return developers;
    }
}
