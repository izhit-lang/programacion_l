public class CondicionalesYCiclos {
    public static void main(String[] args) {

        boolean a = true, b = true, c = true;
        if (!a && (b && c)) {
            System.out.println("sentencia if ejecutada");
        } else
            System.out.println("sentencia else ejecutada");

        // ****** realizar otro ejercicio */

        int marks = 80;

        if (marks > 70)
            System.out.println("Distinction");
        if (marks > 35)
            System.out.println("pass");
        else
            System.out.println("Fail");
        System.out.println("Better luck next time");

        // **realizar otro ejecicio */

        int india_score = 300, pakistan_score = 290;
        if (india_score > pakistan_score)
            System.out.println("India wins");
        else
            System.out.println("Pakistan wins");

        // **realizar otro ejercicio */
        int score_india = 300;
        int score_pakistan = 290;

        System.out.println(score_india > score_pakistan ? "India wins" : "pakistan wins");

        // * realizar otro ejercicio */

        int m = 7 * 3 + 6 / 2 - 5;
        int l = 21 - 8 + m % 3 * 11;

        if (m < l) {
            System.out.println("M is lees than L");
        }
        if (m == l) {
            System.out.println(" M is equal to L");
        }
        if (m > l) {
            System.out.println(" M is greater than L");
        }
        // *realizar otro ejecicio */

        if (true && true && false || false) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
