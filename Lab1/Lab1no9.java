// ข้อ 9

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Maxnumber = -1;
        int Occurencecount = 0;
        int inputnum;
        while ((inputnum = scanner.nextInt()) != 0) {
            if(inputnum > Maxnumber) {
                Maxnumber = inputnum;
                Occurencecount = 1;
            } else if (inputnum == Maxnumber){
                Occurencecount++;
            }
        }
        if(Maxnumber == -1) {
            System.out.println("No number enter!");
        } else {
            System.out.println(Maxnumber + " " + Occurencecount);
        }
        scanner.close();
    }
}