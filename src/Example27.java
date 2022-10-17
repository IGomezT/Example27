public class Example27 {
    public static void main(String [] argv) {
        int n = 40;
        int firsTerm =0;
        int secondTerm =1;


        for(int i = 1; i<=n; i++) {
            System.out.print(firsTerm+ " ,");
            int nexTerm = firsTerm + secondTerm;
            firsTerm = secondTerm;
            secondTerm = nexTerm;

        }

    }
}
