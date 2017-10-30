public class ContainerWithMostWater {
    public static void main(String[] args) {
        int x=1;
        Scanner scanner = new Scanner(System.in);
        while (x!=0) {
            System.out.println("Enter the size of the array");
            scanner = new Scanner(System.in);
            int[] height =new int[scanner.nextInt()];
            for (int i = 0; i <height.length ; i++) {
                System.out.println("Enter the elements of array");
                height[i]= scanner.nextInt();
            }
            System.out.println("Max= "+maxArea(height));

            System.out.println("Enter 1 to continue or 0 to exit");
            x = scanner.nextInt();
        }
    }
    public static int maxArea(int[] height) {
        int area = 0;
        int max = 0;
        // getting the possible continers and their area in forward order..
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] <= height[j]) {
                    area = height[i] *(j-i);
                    System.out.println("area= "+area);
                    max = (max < area) ? area : max;
                }

            }
        }
        //getting possible containers and their areas in backward order
        for (int i = height.length - 1; i > 0; i--) {
            for (int j = (i - 1); j >= 0; j--) {
                if (height[i] <= height[j]) {
                    area = height[i]*(i-j);
                    System.out.println("area in backward= "+area);
                    max = (max < area) ? area : max;
                }
            }

        }
        return max;
    }
}
