public class ass {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0||j==0 && i>(n)/2|| j == (n - 1) / 2 || i==n&& j<(n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }



        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if ( j==(n)/2&&  i>(n-1)/2|| j==(i) &&  i< (n)/2||j==(10-i) && i< (n)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j==0 ||i == 0&& j<(n-1)/2|| j == (n - 1) / 2 || i==n && j<(n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 ||j==0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
}
