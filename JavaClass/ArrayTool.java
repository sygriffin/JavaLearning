class ArrayTool {
   
    //1.获取元素最大值
    public int getMax (int[] arr) {
        
        int maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
             if (maxValue < arr[i]) {
                 maxValue = arr[i];
             }   
        }
        return maxValue;

    }
    //数组遍历
    public void traverse (int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


    //数组反转

    public void reverse (int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length-1-i] = temp;
        }
    } 


    



}
