class Solution {
    public int getSum(int a, int b) {
//loop until no carry/remainder left        
while( b !=0){
        //variable is set to the carry of the two values
        int tmp = (a&b)<< 1;
        //variable is == to the addition using XOR
        a = a ^ b;
        //if there is remainder, set this value equal in order to loop until no remainder/carry
        b=tmp;
        }
         return a;
    }
}
