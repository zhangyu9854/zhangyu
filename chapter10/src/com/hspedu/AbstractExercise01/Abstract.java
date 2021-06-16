package com.hspedu.AbstractExercise01;

public class Abstract {

}
abstract class Employee{
    private String name;
    private String id;
    private int salary;

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void work();
}
class Manager extends Employee{
    private int bonus;

    public Manager(String name, String id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理"+getName()+"正在干什么");
    }
}
class CommonEmployee extends Employee{
    public CommonEmployee(String name, String id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("员工"+getName()+"月工资"+getSalary());
    }
}
