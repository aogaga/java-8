package coreval;

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


}
