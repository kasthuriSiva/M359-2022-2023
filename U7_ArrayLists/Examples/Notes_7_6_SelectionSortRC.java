package U7_ArrayLists.Examples;
import java.util.ArrayList;

public class Notes_7_6_SelectionSortRC {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(6);
        nums.add(2);

        selectionSort(nums);
        System.out.println(nums);
    }

    public static void selectionSort (ArrayList<Integer> list){
        for(int i=0; i<list.size()-1; i++){
            int minIndex = i;
            //Look for the smallest index
            for(int j=i+1; j<list.size(); j++){
                if(list.get(j) < list.get(i)){
                    minIndex = j;
                }
            }

            //Swap the values
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);

        }
    }
}
