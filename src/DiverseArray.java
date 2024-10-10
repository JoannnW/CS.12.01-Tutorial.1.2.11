public class DiverseArray {

    public static int arraySum(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter += arr[i];
        }
        return counter;
    }

    public static int[] rowSums(int[][] twoDArray) {
        int[] sums = new int[twoDArray.length];
        for (int i = 0; i < twoDArray.length; i++) {
            {
                int rowSum = 0; // Initialize sum for current row
                for (int j = 0; j < twoDArray[i].length; j++) {
                    rowSum += twoDArray[i][j]; // Add each element in the row to the sum
                }
                sums[i] = rowSum; // Store the sum of current row in the sums array
            }
        }
        return sums;
    }

    public static boolean isDiverse (int[][] twoDArray)
    {
        int[] sums = rowSums(twoDArray);

        //check if there are any repeating elements in the 1D array
        for (int i = 0; i < sums.length; i++){
            for (int j = 0; j < sums.length; j++)
            {
                if (sums[i] == sums[j] && i != j) //condition: the current element in the idex equals another element that doesn't have the same index
                {
                    return false;
                }
            }
        }
        return true;
    }
}
