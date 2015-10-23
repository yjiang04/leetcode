/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has
 * only one digit.
 *
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit,
 * return it.
 *
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */



public class Solution {
    public int addDigits(int num) {
        int i=0;
        do{ 
            i=0;
            do {
                i=i+num%10;
                num=num/10; 
            }while(num>0);
            num=i;
            
        }while(num>9);
            
        
        return num;
    }
}