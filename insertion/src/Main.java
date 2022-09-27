public class Main {
    public static void main(String[] args) {
        int [] arr = {2,24,1,234,34,5};
        printArray(insertionSorting(arr));
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

    //This method is for sorting the array
    public static int [] insertionSorting(int [] arr){
        //Copy the array to not change the original one
        int [] arrCopy = copyArray(arr);
        //Take a constant key value to compare with the other elements
        for(int i=1;i<arrCopy.length;i++){
            int key = arrCopy[i];
            //take a j value to compare key with the previous elements
            int j = i-1;
            while(j>=0){
                //If key is smaller than the other elements than shift
                // the big elements to the right position
                if(key<=arrCopy[j]){
                    arrCopy[j+1] = arrCopy[j];
                //If key is bigger than the j'th value then place key to the
                // jth position
                } else if (key>arrCopy[j]) {
                    arrCopy[j+1]=key;
                    break;
                }
                j--;
                if(j<0)
                    arrCopy[0]=key;
            }


        }

        return arrCopy;
    }
}