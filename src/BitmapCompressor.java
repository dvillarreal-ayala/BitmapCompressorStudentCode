/******************************************************************************
 *  Compilation:  javac BitmapCompressor.java
 *  Execution:    java BitmapCompressor - < input.bin   (compress)
 *  Execution:    java BitmapCompressor + < input.bin   (expand)
 *  Dependencies: BinaryIn.java BinaryOut.java
 *  Data files:   q32x48.bin
 *                q64x96.bin
 *                mystery.bin
 *
 *  Compress or expand binary input from standard input.
 *
 *  % java DumpBinary 0 < mystery.bin
 *  8000 bits
 *
 *  % java BitmapCompressor - < mystery.bin | java DumpBinary 0
 *  1240 bits
 ******************************************************************************/

import java.util.NoSuchElementException;

/**
 *  The {@code BitmapCompressor} class provides static methods for compressing
 *  and expanding a binary bitmap input.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 *  @author Zach Blick
 *  @author Damian Villarreal-Ayala
 */
public class BitmapCompressor {

    /**
     * Reads a sequence of bits from standard input, compresses them,
     * and writes the results to standard output.
     */

    /**
     * current_digit = what is being read in; then move FileReader back to original loc.
     *
     * while the current index is 0
     *
     */
    public static void compress() {

        // TODO: complete compress()
        // When reading in the bits, use readInt using 1 as r so that we can only care about
        // the first bit being either 1 or 0.
        int bit = BinaryStdIn.readInt(1);
        int numSequencesRepetition = 0;

        // While the file isn't empty, continue to read and compress
        while(!BinaryStdIn.isEmpty())
        {
            //Continue adding code to this section
            if(bit == 0)
            {
                // do smth
            }
            //Given that we're using a bitmap, I know all the values are always going to be 0 or 1.
            else
            {
                // do smth else
            }
        }

        BinaryStdOut.close();
    }

    /**
     * Reads a sequence of bits from standard input, decodes it,
     * and writes the results to standard output.
     */
    public static void expand() {

        // TODO: complete expand()

        BinaryStdOut.close();
    }

    /**
     * When executed at the command-line, run {@code compress()} if the command-line
     * argument is "-" and {@code expand()} if it is "+".
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        if      (args[0].equals("-")) compress();
        else if (args[0].equals("+")) expand();
        else throw new IllegalArgumentException("Illegal command line argument");
    }
}