class array {
    public static void main(String a[]){
        int nums1[]={3,2,4,5};
        nums1[2]=9;//u can change/modify the value
        for(int i=0;i<4;i++){
            System.out.println(nums1[i]);
        }
        int nums2[]=new int[4];//dynamically we created an array
        //by default all the values will be zero
        
        for(int i=0;i<4;i++){
            System.out.println(nums2[i]);
        }
    }
}
