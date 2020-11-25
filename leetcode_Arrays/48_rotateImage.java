// 题目：顺时针旋转矩阵90度

// 解题思路：
// 方法一：转置+翻转 （主要转置只转上半矩阵）
// 方法二：旋转四个小矩阵
// 方法三：纯坐标swap

// 方法一：转置+翻转 （主要转置只转上半矩阵）
public class solution{
	public void rotate(int[][] matrix) {
        //转置+翻转
        //A.length表示数组的行数
        //A[0].length表示对应行的长度,即列数
        int len = matrix.length;

        //transpose
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){        //转置只转上半矩阵, 否组转两次相当于没转
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //reverse
        for(int i=0; i<len; i++){
            for(int j=0; j<len/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][(len-1-j)];
                matrix[i][(len-1-j)] = temp;
            }
        }
    }
}
