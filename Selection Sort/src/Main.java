public class Main {
    public static void main(String[] args) {
        int [] arr = {10,3,7,5};
        printArray(selectionSort(arr));
    }

    //It will copy the array's elements to another array.
    public static int [] copyArray(int [] arr){
        int [] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        return arrCopy;
    }

    //It will print the array's elements one by one.
    public static void printArray(int [] arr){
        for (int j : arr) System.out.println(j);
    }

    //This method is for selection sorting the array
    public static int [] selectionSort(int [] arr){
        //Copy the array to not change the original one
        int [] arrayCopy = copyArray(arr);


        for(int i=0;i<arr.length;i++){
            //take a current value as an minimum just for now
            int min =arrayCopy[i];
            //take j as i+1 to compare the values
            int j=i+1;
            //take an index for swapping
            int index = i;
            while(j<arrayCopy.length){
                if(arrayCopy[j] <min){
                    //change the min value if it is false
                    min = arrayCopy[j];
                    //change index as j to understand which index we will swap
                    index =j;}
                    j++;
            }
            //swap the values
            arrayCopy[index]=arrayCopy[i];
            arrayCopy[i]=min;
        }



        return arrayCopy;
    }
}