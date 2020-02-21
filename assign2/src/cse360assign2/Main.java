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
		myList.add(1);
		// myList.add(0);

		System.out.println(myList);
		// variables

		// System.out.println(myList.search(1));
		// System.out.println(myList.count());
		myList.remove(9);
		myList.remove(3);
		myList.remove(2);

		System.out.println(myList);
		System.out.println(myList.count());


	} // End of main()

} // End of main class
