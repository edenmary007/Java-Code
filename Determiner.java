public class Determiner{
    public static void main (String[] args){
        String[] array = {"Java", "python", "Eden", "behbuh", "stink", "nostalgia", "prepostourous"};
        int length = array.length;
        String largest = " "; 
        int i=0;
        while (i <= length-1){
            if (array[i].length() > largest.length()){
                largest = array[i];
            }
            i++;
        }

        System.out.println(largest);

    

    }
}