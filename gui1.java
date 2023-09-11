import java.util.Scanner;

public class gui1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Input total score : ");
        int Score = scan.nextInt();

        String Grade;
        if (Score >= 80) {
            Grade = "A";
        } else if (Score >= 75) {
            Grade = "B+";
        } else if (Score >= 70) {
            Grade = "B";
        } else if (Score >= 65) {
            Grade = "C+";
        } else if (Score >= 60) {
            Grade = "C";
        } else if (Score >= 55) {
            Grade = "D+";
        } else if (Score >= 50) {
            Grade = "D";
        } else {
            Grade = "F";
        }

        System.out.println(" The Grade is " + Grade);
        System.out.println(" The Grade is " + Grade);

        scan.close();
    }

}
