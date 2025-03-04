package Projekte.JavaLernen.Auswahlanweisungen.KinderJavaLand;

import java.util.Scanner;

public class KinderJavaLand {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[][] IncomeTable = new int[2][4];

    IncomeTable[0][0] = 70;
    IncomeTable[0][1] = 130;
    IncomeTable[0][2] = 220;
    IncomeTable[0][3] = 240;
    IncomeTable[1][0] = 70;
    IncomeTable[1][1] = 70;
    IncomeTable[1][2] = 140;
    IncomeTable[1][3] = 140;

    int Income;
    int Outcome = 0;
    int NumChilds = 0;
    int Check = 0;

    System.out.print("Geben Sie ihr Gehalt ein: ");
    Income = input.nextInt();
    System.out.print("Geben Sie die Anzahl der Kinder ein: ");
    NumChilds = input.nextInt();

    if (Income == 0) {
      input.close();
      System.out.println("Gehalt muss größer als 0 sein");
      return;
    }

    if (Income > 45000) {
      Check = 1;
    }

    switch (NumChilds) {
      case 1:
        Outcome = IncomeTable[Check][NumChilds - 1];
        break;
      case 2:
        Outcome = IncomeTable[Check][NumChilds - 1];
        break;
      case 3:
        Outcome = IncomeTable[Check][NumChilds - 1];
        break;
      case 4:
        Outcome = IncomeTable[Check][NumChilds - 1];
        break;
      default:
        break;
      }

    System.out.println("Ihr erhaltenes Kindergeld " + Outcome + " €");
    input.close();
  }
}
