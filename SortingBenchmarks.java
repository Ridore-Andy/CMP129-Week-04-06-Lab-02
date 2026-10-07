public class SortingBenchmarks 
{
    public static void main(String[] args) 
    {
        int[] array1 = {12,13,67,45,34,78,22,31,48,90,99,86,66,67,332,10,1,4,9,6};
        int[] array2 = {12,13,67,45,34,78,22,31,48,90,99,86,66,67,332,10,1,4,9,6};

        //bubble sort display
        int bubbleCount = bubbleSort(array1);
        System.out.println("Bubble Sort Array:");
        for(int num:array1)
        {System.out.print(num+" ");}
        System.out.println("\nNumber of exchanges: "+bubbleCount);

        //selection sort display
        int selectionCount = selectionSort(array2);
        System.out.println("\nSelection Sort Array:");
        for(int num:array2)
        {System.out.print(num+" ");}
        System.out.println("\nNumber of exchanges: "+selectionCount);  
    }

    //bubble sort
    public static int bubbleSort(int[] array1)
    {
        int counter = 0;
        int n = array1.length;
        for(int i=0; i < n-1; i++)
        {
            for(int j=0; j < n-i-1; j++)
            {
                if(array1[j] > array1[j+1])
                {
                    int temp = array1[j];//temporarily stores current value
                    array1[j] = array1[j+1];//moves smaller value to left
                    array1[j+1] = temp;//adds temp value to right
                    counter++;
                }
            }
        }
        return counter;
    }
    
    //selection sort
    public static int selectionSort(int[] array2)
    {
        int counter = 0;
        int n = array2.length;
        for(int i=0; i < n-1; i++)
        {
            int minValue = i;
            for(int j = i+1; j<n; j++)
            {
                if(array2[j] < array2[minValue])
                {minValue = j;}
            }
            if(minValue != i) 
            {
                int temp = array2[i];
                array2[i] = array2[minValue];
                array2[minValue] = temp;
                counter++;
            }
        }    
        return counter;
    }
}