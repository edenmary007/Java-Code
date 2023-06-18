public class Determiner{
    public static void main (String[] args){
        String[] array = {"Java", "python", "Eden", "behbuh", "stink", "nostalgia", "prepostourous"};
        
        int length = array.length;
        int i = 0;
        int j=1;
        while (j <= length-1){
            if (array[i].length() > array[j].length()){
                j++;
            }
            if (array[j].length() > array[i].length() || array[j].length() == array[i].length()){
                i++;
                j++;
                if (j == length-1 && j > i){
                    System.out.println(array[j]);
                     System.exit(0);
                }
            }

        }

        System.out.println(array[i]);

        

    }
}