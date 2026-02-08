package projects.assignment;
public class practis {
    public static void main(String[] arge) {
        int n = 7;
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*\t");
            }
            System.out.println();
            // }
            for (int k = 1; k <= 4; k++) {
                for (int j = 1; j <= k; j++) {
                    System.out.print(" \t");
                }
                for (int j = 4; j >= k; j--) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
            for (int l = 1; l <= 4; l++) {
                for (int j = 4; j >= l; j--) {
                    System.out.print(" \t");
                }
                for (int j = 1; j <= l; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }
}
