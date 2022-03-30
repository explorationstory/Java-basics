package nl.java.comparable;

import nl.jamie.comparable.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingStringListObjectTests {
    List<Employee> listEmployees = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Employee employee1 = new Employee("Tom", "Eagar");
        Employee employee2 = new Employee("Tom", "Smith");
        Employee employee3 = new Employee("Bill", "Joy");
        Employee employee4 = new Employee("Bill", "Gates");
        Employee employee5 = new Employee("Alice", "Wooden");
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        listEmployees.add(employee3);
        listEmployees.add(employee4);
        listEmployees.add(employee5);
    }

    @Test
    void testComparabeOnEmployeeClass() {
        Collections.sort(listEmployees);
        for(Employee emp : listEmployees) {
            System.out.println(emp);
        }
    }
}
