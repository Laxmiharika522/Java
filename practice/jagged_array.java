//each row has different coloumns in jagged array
class jagged_array {
    public static void main(String a[]){
        int nums[][]=new int[3][];
        nums[0]=new int[3];//1 st row has 3 coloumns
        nums[1]=new int[4];//2nd row has 4 coloumns
        nums[2]=new int[5];//3rd row has 5 coloumns
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*100);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();//println come on new line
        }
    }
}
