public class SortingBenchmarks 
{
    public static void main(String[] args) 
    {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        bubbleSort(array1);
        //selectionSort(array2);

        //bubble sort display
        System.out.println("Bubble Sort Array:");
        for(int num:array1)
        {System.out.print(num+" ");}
        System.out.println("Number of exchanges: ");

        //selection sort display
        System.out.println("Selection Sort Array:");

        
    }

    //bubble sort
    public static void bubbleSort(int[] array1)
    {
        int s = array1.length;

        for(int i=0; i < s-1; i++)
        {
            for(int j=0; j < s-i-1; j++)
            {
                if(array1[j] > array1[j+1])
                {
                    int temp = array1[j];//temporarily stores current value
                    array1[j] = array1[j+1];//moves smaller value to left
                    array1[j+1] = temp;//adds temp value to right
                }
            }
        }
    }
    
    //selection sort
    public static void selectionSort(int[] array2)
    {
        int n = array2.length;
        for(int i=0; i < n-1; i++)
        {
            int minValue = i;
            
        }

    }
    
}
