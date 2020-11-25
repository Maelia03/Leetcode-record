// 题目:数组代表一个数字，[1,2,3] 就代表 123，然后给它加上 1，输出新的数组。
// 数组每个位置只保存 1 位，也就是 0 到 9。

// 总结：考虑好各种情况，但思考相同法则。
// 避免复杂，比如很对三种情况分开写，其实只要看一种情况。
// 是否+1为0，是则下一位加一，不是则返回。

// 思路第一步：有三种情况。
//      1-末尾无进位
//      2-末尾有进位
//      3-末尾有进位，且知道最高位都需进位。New新数组
// 思路第二步：如何统一执行。避免复杂。


// 最优解法：(后往前每一位循环,判断是否为0，不为0返回 就行了)

public class solution{
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len-1; i >= 0; i--){
            digits[i]++;
            digits[i] %= 10;               // 10/10 取余数，0则继续下一位循环
            if(digits[i] != 0){
                return digits;
            }
        }
        int[] arr = new int[digits.length+1];
        arr[0] = 1;
        return arr;
    }
}

//我的解法：(想复杂了)
public class solution{
    	public int[] plusOne(int[] digits) {
        boolean[] carry = new boolean[digits.length];     //设置一个进位记录数组
        int carryNb = 0;
        for(int k = 0; k < digits.length; k++){           //记录是否需进位，是否全部需进位
            if(digits[k] == 9){
                carry[k] = true;
                carryNb += 1;
            }
            else{
                carry[k] = false;
            }
        }

        if (carry[digits.length-1] == false){   //想题时，重要的是想出三种情况！--> 然而想好三种情况之后要 归一
            digits[digits.length-1] += 1;
        }

        if(carryNb == digits.length){
            int[] digits2 = new int[digits.length + 1];
            for(int j = 1; j < digits2.length; j++){
                digits2[j] = 0;
            }
            digits2[0] = 1;
            return digits2;
        }        

        if(carryNb != digits.length && carry[digits.length-1] == true){
            int i = digits.length-1;
            while(carry[i] == true){
                digits[i] = 0;
                i--;
            }
            digits[i] += 1;
        }
        return digits;
    }
}