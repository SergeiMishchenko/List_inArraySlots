/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    private int[] list;
	private int elementsFilled;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
		list = new int[5];
		elementsFilled = 0;
    }


    /**
      @return the number of elements in this list
     */
     public int size() {
		 return elementsFilled;
     }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
     public String toString() {
		String result = "[";
        for (int i = 0; i < elementsFilled; i++) {
            result += list[i] + ",";
        }
        return result + "]";
		 
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
      public boolean add( int value) {
		if(elementsFilled == list.length) //checks if there slots that are open
            expand();
        list[elementsFilled++] = value;
        return true;
      }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
      private void expand() {
         System.out.println( "expand... (for debugging)");
            /* S.O.P. rules for debugging:
               Working methods should be silent. But during
               development, the programmer must verify that
               this method is called when that is appropriate.
               So test using the println(), then comment it out.
               */
	    int[] storage = list; 
        list = new int[2 * elementsFilled]; 
        for(int i = 0; i < storage.length; i++)
           list[i] = storage[i];
     }
 }
