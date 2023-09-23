package problems.bit.manipulation.easy;

/*
190. Reverse Bits
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int solution = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            solution <<= 1;
            if ((n & 1) > 0) solution++;
            n >>= 1;
        }
        return solution;
    }
}
