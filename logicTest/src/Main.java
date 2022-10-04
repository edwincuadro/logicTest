import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Input the number: ");
        String number = read.nextLine();


        String firstNumber = number.split(",")[0];
        String secondNumber = number.split(",")[1];


        int numberOfRepetitions=Integer.parseInt(firstNumber);

        int [] arrayCifras = new int[secondNumber.length()];
        int i;
        for(i=0;i<secondNumber.length();i++){
            arrayCifras[i] = Integer.parseInt(String.valueOf(secondNumber.charAt(i)));
            System.out.println(arrayCifras[i]);
        }
        String [][] displayArray = new String[secondNumber.length()][7];
        for (i=0;i<secondNumber.length();i++){
            switch (arrayCifras[i]){
                case 0:{
                    displayArray[i][0] = "---";
                    displayArray[i][1] = "|";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = " ";
                    displayArray[i][4] = "|";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = "---";
                    break;
                }
                case 1:{
                    displayArray[i][0] = " ";
                    displayArray[i][1] = " ";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = "   ";
                    displayArray[i][4] = " ";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = " ";
                    break;
                }
                case 2: {
                    displayArray[i][0] = "---";
                    displayArray[i][1] = " ";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = "---";
                    displayArray[i][4] = "|";
                    displayArray[i][5] = " ";
                    displayArray[i][6] = "---";
                    break;
                }
                case 3: {
                    displayArray[i][0] = "---";
                    displayArray[i][1] = " ";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = "---";
                    displayArray[i][4] = " ";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = "---";
                    break;
                }
                case 4: {
                    displayArray[i][0] = " ";
                    displayArray[i][1] = "|";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = "---";
                    displayArray[i][4] = " ";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = " ";
                    break;
                }
                case 5:{
                    displayArray[i][0] = "---";
                    displayArray[i][1] = "|";
                    displayArray[i][2] = " ";
                    displayArray[i][3] = "---";
                    displayArray[i][4] = " ";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = "---";
                    break;
                }
                case 6:{
                    displayArray[i][0] = "---";
                    displayArray[i][1] = "|";
                    displayArray[i][2] = " ";
                    displayArray[i][3] = "---";
                    displayArray[i][4] = "|";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = "---";
                    break;
                }
                case 7:{
                    displayArray[i][0] = "---";
                    displayArray[i][1] = " ";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = " ";
                    displayArray[i][4] = " ";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = " ";
                    break;
                }
                case 8:{
                    displayArray[i][0] = "---";
                    displayArray[i][1] = "|";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = "---";
                    displayArray[i][4] = "|";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = "---";
                    break;
                }
                case 9:{
                    displayArray[i][0] = "---";
                    displayArray[i][1] = "|";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = "---";
                    displayArray[i][4] = " ";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = "---";
                    break;
                }
            }
        }
        for (int j = 0; j < numberOfRepetitions; j++) {
            for (i=0;i<secondNumber.length();i++){
                System.out.printf(" %s  ", displayArray[i][0]);
            }
            System.out.println("");
            for (i=0;i<secondNumber.length();i++){
                System.out.printf("%s   %s ", displayArray[i][1], displayArray[i][2]);
            }
            System.out.println("");
            for (i=0;i<secondNumber.length();i++){
                System.out.printf(" %s  ", displayArray[i][3]);
            }
            System.out.println("");
            for (i=0;i<secondNumber.length();i++){
                System.out.printf("%s   %s ", displayArray[i][4], displayArray[i][5]);
            }
            System.out.println("");
            for (i=0;i<secondNumber.length();i++){
                System.out.printf(" %s  ", displayArray[i][6]);
            }
            System.out.println("");
        }
    }

}
