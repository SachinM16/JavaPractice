package zoho;

public class RainWater {
//    public static void main(String[] args) {
//        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//
//        int left = 0, right = height.length-1;
//        int leftMax = 0, rightMax = 0;
//        int water = 0;
//
//        while (left < right) {
//            if (height[left] < height[right]) {
//                if (height[left] >= leftMax) {
//                    leftMax = height[left];
//                } else {
//                    water += leftMax - height[left];
//                }
//                left++;
//            } else {
//                if (height[right] >= rightMax) {
//                    rightMax = height[right];
//                } else {
//                    water += rightMax - height[right];
//                }
//                right--;
//            }
//        }
//
//        System.out.println("Water trapped: " + water);
//    }
	    public static void main(String[] args) {
	        int[] height = {0,1,0,2,1,0,1,3,2,4,2,1};
	        int n = height.length;

	        int water = 0;

	        for (int i = 0; i < n; i++) {
	            int leftMax = 0, rightMax = 0;

	            // Find max on left
	            for (int j = 0; j <= i; j++) {
	                leftMax = Math.max(leftMax, height[j]);
	            }

	            // Find max on right
	            for (int j = i; j < n; j++) {
	                rightMax = Math.max(rightMax, height[j]);
	            }

	            // Water trapped at i
	            water += Math.min(leftMax, rightMax) - height[i];
	        }

	        System.out.println("Water trapped: " + water);
	    }

}
