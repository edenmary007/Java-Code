public class ConcertCheck
{
    public static void main (String[] args)
    {
        Person person1 = new Person("Eden", 17);
        Person person2 = new Person("Behbuh", 10);
        Person person3 = new Person("Mona", 22);
        
        printAllowedConcertName(person1);
        printAllowedConcertName(person2);
        printAllowedConcertName(person3);
       
    }

    private static void printAllowedConcertName(Person person)
    {
        if (person.getAge() <= 15){
            System.out.println(person.getName() + " is allowed to go to the Pink Panther concert");
        } else {
            System.out.println(person.getName() + " is allowed to go to the AC/DC concert");
        }        
    }
}

class Person
{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }   

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
}