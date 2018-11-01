public class App {

	public static void main(String[] args){
		int myArray [] = {1,2,3,3,4,5};
		checkForDuplicates(myArray);
		checkForDuplicatesWithSet(myArray);
	}

	//Check the duplicates in this array [1,2,3,3,4,5]

	public static void checkForDuplicates(int myArray[]){
		// time complexity = O(n^2)
		for(int i = 0; i < myArray.length; i++){

			for(int j = i+1; j < myArray.length; j++){

				if(myArray[i] == myArray[j] && i != j){
					System.out.println("A duplicate exists");
				}
			}
		}
	}

	public static void checkForDuplicatesWithSet(int myArray[]){
		// time complexity = O(n)
		Set<Integer> mySet = new HashSet<Integer>();

		for(Integer x: myArray){
			if(mySet.add(x) == false){
				System.out.println("A duplicate exists ---> " + x);
			}
		}
	}
}