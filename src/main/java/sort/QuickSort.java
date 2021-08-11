package sort;

/**
 * @author qiuxian
 * @date 2021/6/20
 * @desc
 * 快速算法：
 * 1.在数组中，选取一个基准数，通常选取第一个数字作为基准数；
 *
 * 2.以基数为准，比基数小的数字放在基数左侧，比基数大的数字放在基数右侧；
 * 具体过程：
 * 2.1.需要两个指针：
 *     i.从右往左的指针，去找比基数小的数字的指针所在位置;
 *    ii.从左往右的指针，去找比基数大或者相等的数字的指针所在位置
 *    iii.交换两个指针所指向的数字
 * 2.2.如果指针没有相遇，继续2.1的步骤
 *      如果指针相遇，将基数和指针相遇处的数字进行交换
 *
 * 3.重复以上步骤(递归方法)，直到排序完成.
 *
 */
public class QuickSort {

    public static void sort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        //选取一个基准数,通常选取第一个数字作为基准数
        int base = arr[left];

        int startOps = left;

        int endOps = right;

        while (left != right) {
            //去找比基数小的数字的指针所在位置
            while (arr[right] > base && right > left) {
                right--;
            }
            //找左侧数字，去找比基数大的数字的指针所在位置
            while (arr[left] <= base && right > left) {
                left++;
            }
            //交换两个指针所指向的数字
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //如果指针相遇，将基数和指针相遇处的数字进行交换
        arr[startOps] = arr[left];
        arr[left] = base;

        //重复以上步骤对左右两侧进行排序；
        //对左侧进行排序
        sort(arr, startOps, left -1);

        //对右侧进行排序
        sort(arr, right + 1, endOps);

    }

    public static void main(String[] args) {

        int[] arr = {6,4,5,8,7,9,3,2,10};

        sort(arr, 0, arr.length -1);

        for(int i =0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


}
