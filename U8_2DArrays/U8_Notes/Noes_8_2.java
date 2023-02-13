package U8_2DArrays.U8_Notes;

public class Noes_8_2
{
    public static void main(String[] args)
    {
        int[][] myNums = {  {9,7,25,3},
                            {29,8,22,10},
                            {19,16,9,1}};

        //1. Output the array in normal form
        showArray(myNums);

        //2. Output the average of all numbers in myNum's
        double avg = getAvg(myNums);
        System.out.println("Average value: "+avg);

        //Find the number of rows that contain at least one even number
        int evenRowCount = getEvenRowCount(myNums);
        System.out.println("Number of rows with an even number: " + evenRowCount);

        //Find the number of columns that contain at least one even #
        int evenColCount = getEvenColCount(myNums);
        System.out.println("# of columns with an even #: " + evenColCount);

    }
    // 1.Output all of the elements of arr USING FOR_EACH loop
    public static void showArray(int[][] arr)
    {
        for(int[] row: arr)
        {
            for(int num : row)
            {
                System.out.print(num + " ");
            }
            System.out.println();   //Prints blank line
        }

    }

    //2.Return the average(mean of all num's in arr)
    public static double getAvg(int[][] arr)
    {
        //Add up all the numbers
        double sum = 0;

        for(int[] row: arr)
        {
            for(int num : row)
            {
               sum+= num;
            }
        }

        //Calculate the avg
        int count = arr.length * arr[0].length;
        return (double)sum/count;

    }
    //Returns the number of rows in arr that contain at least 1 even number
    public static int getEvenRowCount (int[][] arr)
    {
        int count = 0;

        for(int[] row: arr)
        {
            boolean hasEven = false;
            for(int num : row)
            {
               if(num%2 == 0)
               {
                   hasEven = true;
               }
            }

            if(hasEven == true)
            {
                count++;
            }
        }
        return count;

    }

    public static int getEvenColCount(int[][] arr)
    {
        int count =0;
        for( int col=0; col < arr.length; col++)
        {
            boolean hasEven = false;
            for( int row=0; row < arr.length; row++)
            {
                if (arr[row][col] % 2 == 0)
                {
                    hasEven =true;
                }
            }

            if(hasEven  == true)
            {
                count++;
            }

        }
        return count;
    }
}
