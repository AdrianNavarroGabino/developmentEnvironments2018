// Adrián Navarro Gabino

import java.util.*;

public class FunctionalProgramming4
{
    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Nacho", 40));
        people.add(new Person("Juan", 70));
        people.add(new Person("Ana", 36));
        people.add(new Person("Pepe", 65));
        people.add(new Person("Mario", 5));
        
        people.stream()
              .sorted((p1,p2) -> Integer.compare(p2.getAge(),p1.getAge()))
              .limit(3)
              .forEach(p -> System.out.println(p));
    }
}

class Person
{
    String name;
    int age;
    
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() { return age; }
    
    public String getName() { return name; }
    
    @Override
    public String toString()
    {
        return name + " - " + age;
    }
}
