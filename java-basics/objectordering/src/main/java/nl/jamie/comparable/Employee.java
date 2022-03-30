package nl.jamie.comparable;

import java.util.Date;

public class Employee implements Comparable<Employee>{
    String firstName;
    String lastName;
    Date joinDate;

    public Employee(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, Date joinDate) {
        this(firstName,lastName);
        this.joinDate = joinDate;
    }

    @Override
    public int compareTo(Employee o) {
        int compareValue = this.firstName.compareTo(o.firstName);
        if(compareValue == 0) {
            return this.lastName.compareTo(o.lastName);
        }
        return compareValue;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", joinDate=").append(joinDate);
        sb.append('}');
        return sb.toString();
    }
}
