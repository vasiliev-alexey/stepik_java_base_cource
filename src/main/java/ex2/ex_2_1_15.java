package ex2;


import java.util.BitSet;

public class ex_2_1_15 {
    public static int flipBit(int value, int bitIndex) {
        BitSet bs = BitSet.valueOf(new long[]{value});
        bs.set(bitIndex);
        return (int)bs.toLongArray()[0];
    }
    public static void main(String[] args) {
        System.out.println(flipBit(0 , 1));
    }
}
