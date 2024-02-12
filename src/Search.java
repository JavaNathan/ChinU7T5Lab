import java.util.ArrayList;

public class Search {

    public static int linearSearchFirst(int[] array, int target){
        int first = -1;
        for (int i = array.length - 1; i >= 0; i--){
            if (array[i] == target){
                first = i;
            }
        }
        return first;
    }


    public static int linearSearchLast(int[] array, int target){
        int last = -1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                last = i;
            }
        }
        return last;
    }


    public static boolean linearSearchFound(int[] array, int target){
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                return true;
            }
        }
        return false;
    }

    public static int linearSearchCount(int[] array, int target){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                count++;
            }
        }
        return count;
    }


    public static int linearSearchFirst(ArrayList<Integer> arrayList, int target){
        int first = -1;
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) == target){
                first = i;
            }
        }
        return first;
    }

    public static int linearSearchLast(ArrayList<Integer> arrayList, int target){
        int last = -1;
        for (int i = arrayList.size() - 1; i >= 0; i--){
            if (arrayList.get(i) == target){
                last = i;
            }
        }
        return last;
    }

    public static boolean linearSearchFound(ArrayList<Integer> arrayList, int target){
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) == target){
                return true;
            }
        }
        return false;
    }

    public static int linearSearchCount(ArrayList<Integer> arrayList, int target){
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) == target){
                count++;
            }
        }
        return count;
    }

}