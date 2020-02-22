package cse360assign2;

/**
 * 
 * @author Luke Dantuono
 *
 */
public class Main {

	public static void main(String[] args) {

		SimpleList myList = new SimpleList();

		myList.add(2);
		myList.add(4);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(8);
		myList.add(3);
		myList.add(5);
		myList.add(6);
		myList.add(1);  //11
		// myList.add(0);
		myList.add(2);
		myList.add(4);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(8);
		myList.add(3); //19
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(8); // 23
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		

		// variables

		// System.out.println(myList.search(1));
		// System.out.println(myList.count());
		
		
		myList.remove(9);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());

		
		myList.remove(3);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());

		
		myList.remove(2);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
///
	
		myList.remove(8);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.remove(8);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.remove(7);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.remove(6);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
	//	
		myList.remove(4);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());

		myList.remove(2);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.remove(1);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.remove(6);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.remove(3);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		
		System.out.println();
		
		myList.add(2);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.add(4);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.add(6);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.add(7);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.add(8);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());
		
		myList.add(9);
		System.out.println(myList);
		System.out.println("The size of array is: " + myList.count());
		System.out.println("The total size of the array is: " + 
		myList.arraySize());

	} // End of main()

} // End of main class
