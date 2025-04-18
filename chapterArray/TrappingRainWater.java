public class TrappingRainWater {
    public static int maxtWater(int arr[]){
        int trapedWater=0;
        int leftBoundry[] = new int[arr.length];
        int rightBoundry[] = new int[arr.length];
        leftBoundry[0]=arr[0];
        rightBoundry[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            leftBoundry[i]=Math.max(arr[i],leftBoundry[i-1]);
        }
        for(int i=(arr.length-2);i>=0;i--){
            rightBoundry[i]=Math.max(arr[i],rightBoundry[i+1]);
        }
        for(int i=0;i<arr.length;i++){
            int waterLevel=Math.min(leftBoundry[i],rightBoundry[i]);
            trapedWater += waterLevel-arr[i];
        }
        return trapedWater;
    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        int maxValue=maxtWater(arr);
        System.out.println(maxValue);
    }
}
