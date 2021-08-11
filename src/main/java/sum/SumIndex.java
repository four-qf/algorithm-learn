package sum;

import java.util.*;

/**
 * @author qiuxian
 * @date 2021/8/11
 *
 * @since
 * question : 一个有序数组，例如【1，3，5，7，9】，找到两个数和为8的下标。
 *
 */
public class SumIndex {

    public List<String> findIndexToSum(int[] arr, int sum) {

        Map<Integer, Integer> indexMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        for(int i = 0; i < arr.length; i++) {

            int num1 = arr[i];
            arrayList.add(arr[i]);

            for(int j = arr.length-1; j>i; j--) {

                if (num1 + arr[j] == sum && !indexMap.keySet().contains(num1)
                        && !indexMap.keySet().contains(arr[j])
                        && !indexMap.values().contains(num1)
                        && !indexMap.values().contains(arr[j])
                        ) {
                    indexMap.put(num1, arr[j]);
                }


            }

        }
        
        List<String> indexList = new ArrayList<>();

        for (Map.Entry entry : indexMap.entrySet()) {

            indexList.add(arrayList.indexOf(entry.getKey()) + "|" + arrayList.indexOf(entry.getValue()));

        }


        return indexList;
    }

    public static void main(String[] args) {

        SumIndex sumIndex = new SumIndex();
        int[] arr = {1,3,6,7,9};

        System.out.println(sumIndex.findIndexToSum(arr, 10));

    }


}
