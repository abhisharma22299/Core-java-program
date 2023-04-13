
public class patternjava {
    static void creatingPatternA() {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0  || j == 0 || i == (n - 1) / 2 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }

    }

    static void creatingPatternC() {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0 || i ==n ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }

    }

    static void creatingPatternE() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j==0||i == 0&& j<(n-1)/2 || i==n && j<(n-1)/2|| i==(n-1)/2 && j<(n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternF() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j==0||i == 0&& j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternG() {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || i==(n)/2 && j> (n-1)/2 || j == 0 || i ==n && j<(n-1)/2|| j==(n-1)/2 && i>(n-1)/2 || j==n && i>(n)/2  ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }

    }


    static void creatingPatternH() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == n|| i == (n - 1) / 2 || j==0){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternI() {
        int n = 10;

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
    static void creatingPatternJ() {
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
    }
    static void creatingPatternK() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (  j== (n-1)/2 ||  j==i &&  i> (n)/2||j==(10-i) && i< (n-4)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternL() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j==0  || i==n && j<(n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternM() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j ==0 ||  j== n ||  j==(i) &&  i< (n+2)/2||j==(10-i) && i< (n)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternN() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j ==0 ||  j== n ||  j==i ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }

  /*  {

    */

    static void creatingPatternO() {
        int n = 10;

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
    }
    static void creatingPatternP() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j==0  || i == 0&& j<(n-1)/2|| j == (n - 1) / 2 && i<(n-1)/2|| i==(n-1)/2 && j<(n)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }

    static void creatingPatternT() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == (n - 1) / 2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternU() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j==n || i==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternV() {
        int n = 11;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (  j==(n-1)/2 || i==0||j==0|| j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }

    static void creatingPatternY() {
        int n = 10;

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
    }
    static void creatingPatternZ() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i==0||j==(10-i) || i==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternOfHollowTrangle() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i==0||j==i || j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternOfVerticalHollowTrangle() {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j==i || j==0|| i==n ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
    static void creatingPatternTrangle(){
        int n = 10;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i==0 ||j==0|| j==n || i==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }

    }
    static void creatingPatternOfDimand() {
        int n = 11;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i==0 && j==(n-1)/2 || j==0 && i== (n)/2||  i+j<=(n-1)/2
                   || i==0 && j>= (n-1)/2 || j==n-1 && i <= (n-1)/2 || j-i>=(n-1)/2
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
static void creatingAFullDiognalPattern(){

    int n=10;
    for (int i= 0;i<n;i++){
    for (int j=0;j<=i;j++){
        System.out.print("* ");
    }
        System.out.println();
    }

    }
    public static void main(String[] args) {

  //creatingPatternV();
//   creatingPatternOfDimand();
//  creatingPatternOfHollowTrangle();
//  creatingPatternOfVerticalHollowTrangle();
//  creatingAFullDiognalPattern();

  creatingPatternTrangle();
    }

}



