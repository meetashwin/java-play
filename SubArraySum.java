/**
	Given an unsorted array A of size N of non-negative integers, 
	find a continuous sub-array which adds to a given number S.
*/

class SubArraySum {
	public static void main(String[] args) {
		System.out.println("Sub Array Sum");

		int[] originalArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int[] subArr = findSubArraySum(originalArr, -3);

		System.out.println("Sub array with sum: " + subArr[0] + " - " + subArr[1]);

	}

	/**
	 	Find the subarray from originalarray that adds up to given sum
	*/
	public static int[] findSubArraySum(int[] originalArr, int sum) {
		int[] startEndIndex = {-1, -1};
		int localSum = 0;

		int startIndex = 0;
		int endIndex = 0;

		if (sum < 0) {
			startEndIndex[0] = -1;
			startEndIndex[1] = -1;

			return startEndIndex;
		}

		for(int i=0; i < originalArr.length; ++i) {
			localSum = findArraySum(createSubArray(originalArr, startIndex, endIndex));

			if (localSum == sum) {
				startEndIndex[0] = startIndex;
				startEndIndex[1] = endIndex;
			} else if (localSum > sum) {
				startIndex++;
				i--;
			} else if (localSum < sum) {
				endIndex++;
			}
		}

		return startEndIndex;
	}

	/**
		Create a subarray from originalarray based on start and end index
	*/
	public static int[] createSubArray(int[] originalArr, int startIndex, int endIndex) {

		int originalArrIndex = originalArr.length - 1;

		int subArr[] = new int[endIndex - startIndex + 1];

		if (startIndex < 0 || endIndex < 0) {
			return null;
		}
		else if (startIndex > originalArrIndex || endIndex > originalArrIndex) {
			return null;
		} else {
			for(int i = startIndex, j=0; i <= endIndex; ++i, ++j) {
				subArr[j] = originalArr[i];
			}
		}

		return subArr;
	}

	/**
		Find the sum of any given array 
	*/
	public static int findArraySum(int[] anyArray) {
		
		int localSum = 0;

		for(int i=0; i < anyArray.length; ++i) {
			localSum += anyArray[i];
		}

		return localSum;
	}
}