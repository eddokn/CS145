import java.util.LinkedList;

/**
 * Represent a JaggedArray of characters in n bins
 */
public class JaggedArray<T> {
    private int size;
    private int bins;
    private boolean packed;
    // Unpacked representation
    private LinkedList<T>[] unpackedValues;

    // Packed representation
    private int[] offsets;
    private T[] packedValues;

    /**
     * Create a unpacked JaggedArray with the given number of bins
     *
     * @param bins The number of bins to create
     */
    public JaggedArray(int bins) {
      LinkedList[] temp = new LinkedList[bins];
      this.unpackedValues = (LinkedList<T>[]) new LinkedList[bins];
      this.packedValues = (T[]) new Object[bins];
      this.size = 0;
      this.bins = bins;
      this.packed = false;
      for(int i=0;i<bins;i++){
        LinkedList newbin = (LinkedList<T>) new LinkedList();
        this.unpackedValues[i] = newbin;
      }
    }

    /**
     * Return the unpacked array of linked lists.
     * Don't change this, the tests use it.
     */
    public final LinkedList<T>[] getUnpackedValues() {
        return unpackedValues;
    }

    /**
     * Return the packed values.
     * Don't change this, the tests use it.
     */
    public final T[] getPackedValues() {
        return packedValues;
    }

    /**
     * Return the offsets array.
     * Don't change this, the tests use it.
     */
    public final int[] getOffsets() {
        return offsets;
    }



    /**
     * Return the number of elements in the jagged array
     */
    public int size() {
        return this.size;
    }

    /**
     * Return the number of bins
     */
    public int numberOfBins() {
        return this.bins;
    }

    /**
     * Return the number of slots in the given bin
     */
    public int numberOfSlots(int bin) {
        return this.unpackedValues[bin].size();
    }

    /**
     * Return the element at the given bin and slot number
     */
    public T getElement(int bin, int slot) throws IndexOutOfBoundsException {
      if(bin>this.bins || bin < 0){
        throw new IndexOutOfBoundsException();
      }
      if(this.packed == false){

        return this.unpackedValues[bin].get(slot);
    }else{
      if(slot>this.offsets[bin+1]-this.offsets[bin]){
        throw new IndexOutOfBoundsException();
      }
      return this.packedValues[this.offsets[bin]+slot];
      }
    }

    /**
     * Add an element into the bin at the end
     */
    public boolean addElement(int bin, T element) throws IndexOutOfBoundsException {
      if(bin>this.bins || bin < 0){
        throw new IndexOutOfBoundsException();
      }
      if(this.packed == true){
        return false;
      }else{
        this.unpackedValues[bin].add(element);
        this.size ++;
        return true;
      }
    }

    /**
     * Remove an element at the given bin and slot number
     */
    public boolean removeElement(int bin, int slot) throws IndexOutOfBoundsException {
      if(bin>this.bins || bin < 0){
        throw new IndexOutOfBoundsException();
      }
      if(this.packed == true){
        return false;
      }else{
        this.unpackedValues[bin].remove(slot);
        this.size --;
        return true;
      }
    }

    /**
     * Unpack the representation from packed.
     *
     * @return True if successful, or false if already unpacked
     */
    public boolean unpack() {
      if(this.packed == false){
        return false;
      }else{
        this.unpackedValues = (LinkedList<T>[]) new LinkedList[bins];
        for(int i=0;i<bins;i++){
          LinkedList newbin = (LinkedList<T>) new LinkedList();
          this.unpackedValues[i] = newbin;
        }
        int end = 0;
        for(int i=0;i<this.bins;i++){
            int binsize = this.offsets[i+1] - this.offsets[i];
            for(int x=0;x<binsize;x++){
              this.unpackedValues[i].add(this.packedValues[end]);
              end ++;
          }
        }
        this.packedValues = null;
        this.offsets = null;
        this.packed = false;
        return true;
      }
    }

    /**
     * Pack the values
     *
     * @return True if successful, or false if already packed
     */
    public boolean pack() {
      if(this.packed == true){
        return false;
      }else{
        T[] temp = (T[]) new Object[this.size];
        int end = 0;
        int[] offset = new int[this.bins + 1];
        offset[0] = 0;
        for(int i=0;i<this.bins;i++){
          int size = this.unpackedValues[i].size();
            for(int x=0;x<size;x++){
              temp[end] = this.unpackedValues[i].get(x);
              end ++;
            }
          offset[i+1] = size + offset[i];
        }
        this.packedValues = temp;
        this.offsets = offset;
        this.unpackedValues = null;
        this.packed = true;
        return true;
      }
    }

    /**
     * A helpful method to print out a jagged array. Useful for debugging.
     */
    public void print() {
        System.out.println("JaggedArray(Number of Bins=" + numberOfBins());
        for (int i = 0; i < numberOfBins(); i++) {
            System.out.print("\tBin " + i + "(Slots=" + numberOfSlots(i) + ": ");
            for (int j = 0; j < numberOfSlots(i); j++) {
                System.out.print(getElement(i, j));
                if (j < numberOfSlots(i) - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
        System.out.println(")");
    }
}
