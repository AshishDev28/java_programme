package DSA;

import math.math;

public class traping_rainwater {
    public static int trappedrainwater(int hieght){
        int n = hieght.length;
        // calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0]=hieght[0];
        for(int i =1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        // claculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1]=hieght[n-1];
        for(int i=n-2;i>=0;i++){
            rightMax[i]=Main.max(height[i],rightMax[i+2]);
        }
        int treppedWater=0;
        // loop
        for(int i=0;i<n;i++){
            int waterlevel=MAth.min(leftMax[i],rightMax[i]);
            treppedWater+= waterlevel-hieght[i];
        }
        return treppedWater;
        //water level = min(leftmax bound , right max bound)
        //trapped water =water level - hieght[i]

    }

    public static void main(String[] args) {
        int height[] = { 4,2,0,6,3,2,5};
       System.out.println(trappedrainwater(height)); 
    }
    
}
