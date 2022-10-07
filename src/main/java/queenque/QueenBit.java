package queenque;

/**
 * @author qiux
 * @Date 2022/10/7
 * @since 使用位运算解决
 * 在n*n的棋盘放置n个皇后，要求：皇后不同行、不同列、不在同一个斜线
 */
public class QueenBit {

    public static void main(String[] args) {
        int n = 8;
        int chessBoardLimit = n == 32 ? -1 :(1<<n)-1; //int的最大限制是2^32位，所以最大能计算到32*32
        int result = process(chessBoardLimit, 0, 0, 0);
        System.out.println(result);
    }

    /**
     * @param chessBoardLimit 棋盘大小
     * @param columnLimit 每行放置的列，所有行都放置了则等于chessBoard
     * @param leftLimit 左斜线的不能放置的位置
     * @param rightLimit 右斜线不能放置的位置
     * @return
     */
    public static int process(int chessBoardLimit, int columnLimit, int leftLimit, int rightLimit) {
        if (chessBoardLimit == columnLimit) {
            return 1;
        }
        int pos = chessBoardLimit & (~(columnLimit | leftLimit | rightLimit)); //还可以放置皇后的位置
        int res = 0; //结果
        while ( pos != 0) {
            //将pos最右位置依次取出尝试
            int rightPos = pos & (~pos + 1);
            pos = pos - rightPos;
            res += process(chessBoardLimit, columnLimit| rightPos, (leftLimit | rightPos)<<1, (rightLimit | rightPos)>>1 );
        }
        return res;
    }

}
