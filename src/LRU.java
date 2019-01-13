
class LRU 
{ 
	// Method to find page faults using indexes 
	static int pageFaults(int pages[], int capacity) 
	{
		/*
		 * Put your code in here!
		 */

	} 
	
	// Driver Method to test your algorithm with a simple example
	public static void main(String args[]) 
	{
		/*
		 * This is an array that holds the reference string for all
		 * page requests.
		 */
		int pages[] = {5, 1, 0, 3, 2, 3, 0, 4, 2, 3, 0, 3, 5, 2}; 
		
		// This is the number of available page frames
		int memoryCapacity = 3; 
		
		int faults = pageFaults(pages, memoryCapacity);
		System.out.println(faults);
	} 
} 
