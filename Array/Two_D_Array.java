package Array;

class Two_D_Array {
    int arr[][] = null;

    public Two_D_Array(int row, int col) {
        this.arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    void insertion(int row, int col, int val) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = val;
                System.out.println("Data inserted successfully !");
            } else {
                System.out.println("The index is already fulled :");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cant insert");
        }
    }
    // Accessing the value by index value
    void accessValue(int row, int col) {
        System.out.print("Accessing the vlaue of row : "+ row +" and col: "+ col+" = ");
        try{
            System.out.println(arr[row][col]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invilid index");
        }
    }
    // traversing the array
    void traver(){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[0].length; col++){
                System.out.print(arr[row][col]+",");
            }
            System.out.println();
        }
    }
    //searching in array
    void searching(int number){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[0].length; col++){
                if(arr[row][col]== number){
                    System.out.println("Value is founded at index ["+row +","+col+" ]");             
                    return;
                }
            }
        }
        System.out.println("Value is not present in the array !");
    }
    //deleting the value in 2D array
    void deletion(int row, int col){
        try{
            if(arr[row][col] != Integer.MIN_VALUE){
                arr[row][col]= Integer.MIN_VALUE;
                System.out.println("successfully deleted");
            }
            else{
                System.out.println("Index [ ["+row+"] ["+col+"] ] is alread empty");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("check the index size");
        }
    }
}

