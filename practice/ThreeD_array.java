class ThreeD_array {
    public static void main(String a[]){
        int arr[][][]=new int[3][4][5];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++){
                    arr[i][j][k]=(int)(Math.random()*100);
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
