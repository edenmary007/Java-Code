public class StringSearch {
    public static void main(String[] args)
    {
       String[] names = new String[]{"Julius", "eden", "mona", "tom", "engleberth", "Andrew", "Lisa", "jefferson", "donetello"};
       String largest = "";
       for (var name : names) {
        if (name.length() > largest.length())
        {
            largest = name;
        }
       }

       System.out.println("The largest string is: " + largest);

    }
}