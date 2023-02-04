package ge.giga;

public class ArraySorter {
    public int[] sort(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(newArr[i] > newArr[j]) {
                    int temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }
}
