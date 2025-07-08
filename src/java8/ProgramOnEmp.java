package java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProgramOnEmp {
    public static void main(String[] args) {
        Emp emp=new Emp();
        List<Emp> emps = emp.listEmp();
        System.out.println(emps.get(0).getName());
        double maxSal=emps.stream().mapToDouble(Emp::getSal).max().orElse(0);
        System.out.println(maxSal);
//       List<Emp> emps1= emps.stream().filter(e->e.getName().contains("9")).collect(Collectors.toList());
        emps.stream().filter(e->e.getName().contains("9")&&e.getSal()==900).collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println(emps1);
        Optional<Emp> min = emps.stream().min(Comparator.comparing(Emp::getSal));
        if (min!=null){
            System.out.println("min");
            System.out.println(min.get());


            Optional<Emp> emp1= emps.stream().max(Comparator.comparing(Emp::getSal));
            System.out.println(emp1.get());
        }
    }
}
