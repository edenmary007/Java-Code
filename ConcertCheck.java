public class ConcertCheck
{
    public static void main (String[] args)
    {
        Person person1 = new Person("Eden", 17);
        Person person2 = new Person("Behbuh", 4);
        Person person3 = new Person("Mona", 22);
        Person person4 = new Person("Little Shit", 10);
        
        printAllowedConcertName(person1);
        printAllowedConcertName(person2);
        printAllowedConcertName(person3);
        printAllowedConcertName(person4);
       
    }

    private static void printAllowedConcertName(Person person)
    {
        int age = person.getAge();

        if (age >= 10 && age <= 15){
            System.out.println(person.getName() + " is allowed to go to the Pink Panther concert");
        }
        else if (age < 10) {
            System.out.println(person.getName() + " should stay at home!");
        } 
        else {
            System.out.println(person.getName() + " is allowed to go to the AC/DC concert");
        }        
    }
}

class Person
{
    private String name;
    private int age;

    // Constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }   

    // getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
}