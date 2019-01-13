import java.util.ArrayList;

class LRU
{ 
	// Method to find page faults using indexes 
	static int pageFaults(int pages[], int capacity) 
	{

		int faults = 0;
		ArrayList<Integer> leastRecentlyUsed = new ArrayList<>();
		for (int i = 0; i < pages.length; i++){
			boolean exists = false;
			for (int j = 0; j < leastRecentlyUsed.size(); j++){
				if (leastRecentlyUsed.indexOf(pages[i]) != -1){
					exists = true;
					leastRecentlyUsed.remove(Integer.valueOf(pages[i]));
					leastRecentlyUsed.add(pages[i]);
				}
			}
			if (!exists){
				faults++;
				if (leastRecentlyUsed.size() == capacity){
					leastRecentlyUsed.remove(0);
				}
				leastRecentlyUsed.add(pages[i]);
			}
		}

		return faults;
	}

	// Driver Method to test your algorithm with a simple example
	public static void main(String args[]) 
	{
		/*
		 * This is an array that holds the reference string for all
		 * page requests.
		 */
	//	int pages[] = {5, 1, 0, 3, 2, 3, 0, 4, 2, 3, 0, 3, 5, 2};
		int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};

		int memoryCapacity = 4;
		// This is the number of available page frames
	//	int memoryCapacity = 3;
		
		int faults = pageFaults(pages, memoryCapacity);
		System.out.println(faults);
	} 
} 
