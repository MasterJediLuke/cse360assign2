package cse360assign2;
/**
 * @author Luke Dantuono <br>
 * Class ID: 191 <br>
 * Assignment: assign1 <br>
 * Date: 3 February 2020 <br>
 * Desc: A class called SimpleList. Used for JUnit testing. The class will 
 * initialize an int array of size 10. The class will allow for the adding and 
 * removing of elements as well as a counter to track the number of elements in
 * the array. If an element is added to a full array the element at the end is 
 * dropped off. The class also has getters that will return the counter and 
 * search the array for a given value. 
 */

public class SimpleList {
	
	//Constants
	private final int SIZE = 10;    //array size
	
    //Instance Variables
    private int list[];     //array to hold no more than 10 elements
    private int count;      //tracks the number of elements in array 

    
    //Constructors
    /**
     * SimpleList() constructor. Creates an array to hold 10 integers and sets
     * count to zero.
     */
    public SimpleList() {
        list = new int[SIZE];
        count = 0;
    }// End of constructor 

    
    // Methods
    
    /**
     * add() method. Adds the parameter to the beginning of the list (index = 0)
     * Moves all other integers in the list over so there is room. If the list
     * is full then the method calls the growArray() method to increase the size
     * of the array. The counter is incremented as needed.
     *
     * @param num -int value to added.
     */
    public void add(int num) {
        
    	//grow array if at max
    	if ( count == list.length) {
    		growArray();
    	}
    	
    	//move elements over one
        for (int index = (count - 1); index >= 0; index--) {
            list[index + 1] = list[index];    
        }
            
        list[0] = num;     // places the parameter in front
        count++;
    } // End of add() method 

    
    /**
     * remove() method. If the parameter is in the list it is removed. The other
     * elements of the list will be shifted to down to the beginning. If there 
     * are more than 25% empty spaces in the array the method will call the 
     * shrinkArray() method to decrease the size. The counter is decremented as 
     * needed.
     *
     * @param num - int value to remove.
     */
    public void remove(int num) {
        int position = search(num); //gets position

        if (position != -1) {      // removes only if position found
            for (int index = position; index < count - 1; index++) {
                list[index] = list[index + 1];
            }
            count--;
        }
         
        if ((100 - ((count * 100) / list.length)) > 25) {
        	shrinkArray();
        }

    } // End of remove() method

    
    /**
     * count() method. Returns the count value.
     *
     * @return - int number of elements
     */
    public int count() {
        return count;
    } // End of count() method

    
    /**
     * toString() method. Returns the list as a String. A space is placed 
     * after each element except the last.
     *
     * @return - String of the array
     */
    @Override
    public String toString() {
        String arrayString = "";
        for (int index = 0; index < count; index++) {
            arrayString += Integer.toString(list[index]);
            if (index < count - 1)
                arrayString += " ";
        }
        return arrayString;
    } // End of toString() method

    
    /**
     * search() method. Returns the location of the parameter in the list. If
     * the parameter is not listed then returns -1.
     *
     * @param val - the value to be found
     * @return - int - location in the array
     */
    public int search(int val) {
        int pos = -1;
        for (int index = 0; index < count; index++) {
            if (list[index] == val) {
                pos = index;
            }
        }

        return pos;
    } // End of search() method


    
    /**
     * growArray() method. Called when the add() method encounters a full list[] 
     * array. When called, the method will create a new temporary array thats
     * 50% larger than the existing full list, copy all elements and then rename
     * the temporary array as list[].
     */
    private void growArray() {
    	// Create temporary array
    	int temp[] = new int[(int) (count * 1.5)];
    	
    	// Copy array
    	for(int i = 0 ; i < count ; i ++) {
    		temp[i] = list[i];
    		
    	}
    	
    	list = temp;
    	 	
    } // End of growArray() method
    		

    /**
     * shrinkArray() method. Called when the remove() method, after removing an
     * element, sees that the list[] array is 25% or more empty spaces. Creates 
     * a temporary array of size 'count', copies all the elements and then 
     * renames the temporary array as list[].
     */
    private void shrinkArray() {
    	// create temporary array
    	int temp[] = new int[count];
    	
    	// Copy array
    	for(int i = 0 ; i < count ; i ++) {
    		temp[i] = list[i];
    	}
    	list= temp;
    	
    } // End of shrinkArray() method
    
    
    /**
     * arraySize(). Returns the total size of the list[] array.
     * @return - int - Array size.
     */
    public int arraySize() {
    	
    	return list.length;
    }
    
}// End of class SimpeList()

