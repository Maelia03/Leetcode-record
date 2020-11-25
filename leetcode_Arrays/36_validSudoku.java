// 题目：9*9数独。横、竖、九小格子组成的大格子中，不能出现重复数字。

// 思路：
// box_index = (row / 3) * 3 + columns / 3
// 利用 value -> count 哈希映射来跟踪所有已经遇到的值。
// 遍历数独。
// 检查看到每个单元格值是否已经在当前的行 / 列 / 子数独中出现过

public class solution{
    public boolean isValidSudoku(char[][] board) {
            //每一行/列/大格 都是一个HashMap。比如9行是一个数组。
            HashMap<Integer,Integer> [] rows = new HashMap[9]; 
            HashMap<Integer,Integer> [] columns = new HashMap[9];
            HashMap<Integer,Integer> [] boxes = new HashMap[9];

            for(int i = 0; i < 9; i++){
                rows[i] = new HashMap<Integer,Integer>();
                columns[i] = new HashMap<Integer,Integer>();
                boxes[i] = new HashMap<Integer,Integer>();
            }
            // validate a board
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    char num = board[i][j];
                    if(num != '.'){
                        int n = (int)num;
                        int box_index = (i/3)*3 + j/3;

                        // keep the current cell value 记录本格子的出现次数
                        // 0 - 如果 HashMap 中没有该 key - n，则返回默认值0
                        rows[i].put(n, rows[i].getOrDefault(n, 0)+1);
                        columns[j].put(n, columns[j].getOrDefault(n, 0)+1);
                        boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0)+1);

                        // check if this value has been already seen before 查看本格次数是否为1
                        if(rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[box_index].get(n) > 1){
                            return false;
                        }
                    }
                }
            }
            return true;
    }
}