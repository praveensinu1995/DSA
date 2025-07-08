package java8;

import java.util.ArrayList;
import java.util.List;

public class Emp {

    String name;
    double sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public List<Emp> listEmp(){
        List<Emp> emps=new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            Emp e=new Emp();
            e.setName("name"+i);
            e.setSal(i*100);
            emps.add(e);
        }
        return emps;
    }
}
