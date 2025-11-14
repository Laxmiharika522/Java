class multidimensional_array {
    public static void main(String a[]){
         int nums[][]=new int[3][3];//3 rows 4 columns
         nums[0][1]=10;
         nums[1][0]=12;  //manual assignment

        //random gives point values like 0.17,0.18 we have to multiply with 100 to get two digit number after type casting
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                nums[i][j]=(int)(Math.random()*100);//random function(inbuilt function) returns a double value which is less than 1
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();//println come on new line
        }
        //enhanced for loop
        for(int[] n:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
