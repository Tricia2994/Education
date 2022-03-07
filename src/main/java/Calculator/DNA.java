/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author patricia
 */
public class DNA {
    //DNA sequence

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;
        int length = dna.length();
        System.out.println("Length:" + length);
        int start = dna.indexOf("ATG");
        System.out.println("Start:" + start);
        int stop = dna.indexOf("TGA");
        System.out.println("Stop:" + stop);
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println(start + "and " + stop + "and " + (stop - start) % 3 == 0 + "are satisfied.");
        } else {
            System.out.println("No protein.");
        }
    }

}
