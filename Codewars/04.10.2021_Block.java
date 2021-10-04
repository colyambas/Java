
// https://www.codewars.com/kata/55b75fcf67e558d3750000a3/solutions/java

import org.jetbrains.annotations.NotNull;

public class Block {
    //private int[] {width, length, height}
    private int width;
    private int length;
    private int height;

   // public Block(int[] b1) {
   // }

    Block(int @NotNull [] array) {
        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getVolume() {
        return width * height * length;
    }

    public int SurfaceArea() {
        return 2 * ((width * height) + (width * length) + (height * length));
    }
}
