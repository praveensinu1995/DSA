package java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TakeTheNameOfEmpToUpperCase {
    public static void main(String[] args) {
        Emp emp=new Emp();
        List<Emp> emps = emp.listEmp();
        emps.stream().filter(e->e.getName().contains("9")).map(e->e.getName().toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        emps.stream().mapToDouble(Emp::getSal).max();
        Optional<Emp> max = emps.stream().max(Comparator.comparing(Emp::getSal));
        System.out.println(max.get());
    }
}
