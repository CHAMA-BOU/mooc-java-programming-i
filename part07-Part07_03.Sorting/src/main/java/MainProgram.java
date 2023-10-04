
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }
    public static int smallest(int[] array){
    // write your code here
        int small=array[0];
        for(int i:array){
            if(i<small){
                small=i;
            }
        }
        return small;
    }
    public static int indexOfSmallest(int[] array){
        int smallest= smallest(array);
        for(int i=0;i<array.length;i++){
            if (array[i]==smallest){
                smallest=i;
                break;
            }
        }
        return smallest;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int[] array= new int[table.length-startIndex];
        for(int i=startIndex;i<table.length;i++){
            array[i-startIndex]=table[i];
        }
        return indexOfSmallest(array)+startIndex;
    }
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int helper= array[index1];
        array[index1]=array[index2];
        array[index2]=helper;
    }
    public static void sort(int[] array) {
        show(array);
        int index;
        for(int i=0;i<array.length-1;i++){
            index= indexOfSmallestFrom(array, i);
            swap(array, index, i);
            show(array);
        }
    }
    public static void show(int[] array){
        System.out.print("[");
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                System.out.println(array[i]+"]");
                break;
            }
            System.out.print(array[i]+", ");
        }
    }

}
