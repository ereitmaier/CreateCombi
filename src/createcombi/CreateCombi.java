/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createcombi;

/**
 *
 * @author ericr
 */
public class CreateCombi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letters[] = {"EI", "SN", "TF", "JP"};


        for (int j = 0; j < 16; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                char c = checkBit(j, i) ? letters[i].charAt(1) : letters[i].charAt(0);
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }

    public static boolean checkBit(int x, int k) {
        return (x & 1 << k) != 0;
    }
} 