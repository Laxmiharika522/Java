//enhanced for loop gives the value. whatever value it gives we can store in n. we will get the value from nums(which is an array)
//it is also called as for each loop
class enhanced_forloop {
   public static void main(String a[]) {
    int nums[]=new int[4];
    nums[0]=1;
    nums[1]=2;
    nums[2]=3;
    nums[3]=4;
    //for each value not index in an array
    for(int n:nums){//n is a value
        System.out.print(n+" "); //1 2 3 4 
    }

   }
}
