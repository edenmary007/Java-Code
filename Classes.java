public class Classes
{
    public static void main (String[] args)
    {
        person Person1 = new person();
        Person1.name = "Eden";
        Person1.age = 17;
        person Person2 = new person();
        Person2.name = "Behbuh";
        Person2.age = 10;
        Person2.get_confirmation();
        Person1.get_confirmation();
        person Person3 = new person();
        Person3.name = "Mona";
        Person3.age = 22;
        Person3.get_confirmation();
       
    }
}

class person
{
    String name;
    int age;
    
    void get_confirmation()
    {
        if (age >= 16){
            System.out.println(name + " is allowed to go to the AC/DC concert");
        }
        if (age <= 15){
            System.out.println(name + " is allowed to go to the Pink Panther concert");
        }        
    }
}