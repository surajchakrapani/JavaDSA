package leetcode.two_pointers;

public class MaxHeight {

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int[] height2 = { 2, 3, 4, 5, 18, 17, 6 };
		System.out.println(maxArea(height2));
	}

	public static int maxArea(int[] height) {

		int max = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {
			int w = right - left;
			int h = Math.min(height[left], height[right]);
			int area = w * h;
			max = Math.max(max,area);
			if (height[left] < height[right]) {
				left++;
			} else if (height[left] > height[right]) {
				right--;
			} else {
				left++;
				right--;
			}

		}

		return max;
	}

}
