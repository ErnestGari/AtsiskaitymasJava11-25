import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class veiksmai {

    public static void logicalOperations(){

        Scanner input = new Scanner(System.in);

        System.out.println("Iveskite pirma skaiciu: ");
        int pirmasSk = input.nextInt();
        System.out.println("Iveskite antra skaiciu: ");
        int antrasSk = input.nextInt();

        boolean even = false;
        boolean positive = false;
        boolean larger = false;

        if(pirmasSk % 2 == 0 && antrasSk % 2 == 0){
            even = true;
        }
        if(pirmasSk > 0 || antrasSk > 0){
            positive = true;
        }
        if(pirmasSk > antrasSk && (pirmasSk % 5 == 0 && antrasSk % 5 == 0)){
            larger = true;
        }

        System.out.printf("Abu lyginiai: " + "%b", even);
        System.out.println();
        System.out.printf("Bent vienas teigiamas: " + "%b", positive);
        System.out.println();
        System.out.printf("Pirmas skaicius didesnis uz antra ir abu dalomi is 5: " + "%b", larger);
        System.out.println();

    }

    public static void stringOperations(){

        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite savo sakini: ");
        String text = input.nextLine();

        StringBuilder builderText = new StringBuilder(text);


        boolean startsJava = false;

        int n = 0;

        for (String s : text.split(" ")) {
            n++;
        }

        if(text.startsWith("Java")){
            startsJava = true;
        }


        System.out.print("Originalus sakinys: ");
        System.out.println(text);
        System.out.print("Didziosioms: ");
        System.out.println(text.toUpperCase());
        System.out.print("Atvirksiais: ");
        System.out.println(builderText.reverse());
        System.out.println("Zodziu skaicius: " + n);
        System.out.print("Prasideda 'Java': ");
        System.out.printf("%b", startsJava);


    }

    public static void arrayOperations(){

        Scanner input = new Scanner(System.in);

        System.out.println("Iveskite penkis sveikus skaicius: ");

        int[] masyvas = new int[5];
        double sum = 0;

        for(int i = 0; i < 5; i++){

            masyvas[i] = input.nextInt();


            sum += masyvas[i];
        }

        double vid = sum/5;

        Arrays.sort(masyvas);

        System.out.println("Koki skaiciu norite surasti?: ");

        int sk;

        sk = input.nextInt();

        if(Arrays.binarySearch(masyvas, sk) > -1){
            System.out.println("Skaicius: " + (Arrays.binarySearch(masyvas, sk) + 1) + "vietoje");
        }else{
            System.out.println("Tokio skaiciaus nera");
        }

        System.out.printf("Didziausias: " +"%d", masyvas[4]);
        System.out.println();
        System.out.printf("Maziausias: "+"%d", masyvas[0]);
        System.out.println();
        System.out.printf("Vidurkis: "+"%.2f", vid);
        System.out.println();

    }

    public static void matrixOperations(){

        Random rand = new Random();

        int[][] matrix = new int[3][3];
        int[] suma = new int[3];

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = rand.nextInt(10);

                str.append(matrix[i][j]);
                str.append(" ");
                suma[i] += matrix[i][j];
            }

            str.append('\n');
        }
        System.out.println(str);

        for(int i = 0; i < 3; i++){

            System.out.println("Eilutes " + (i+1) + " suma: " + suma[i]);

        }

    }

    public static void printNumbers(){

        Scanner input = new Scanner(System.in);

        System.out.println("Iveskite n: ");
        int n = input.nextInt();

        double suma = 0;
        for(int i = 1; i < n + 1; i++) {

            System.out.printf(i + " ");
            suma += i;
        }

        System.out.println();

        for(int i = n; i >= 1; i--){

            System.out.printf(i + " ");

        }
        System.out.println();

        System.out.printf("Visu skaiciu suma: " +  suma);
    }


    public static void calculateFactorial(){

        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite n: ");
        int n = input.nextInt();
        int ans = n;

        for(int i = n-1; i > 0; i--){
            ans *= i;
        }
        System.out.println(ans);
    }

    public static int calculate(int a, int b, boolean add){

        if(add){
            return (a + b);
        }
        else{
            return (a - b);
        }
    }


    public static void isPalindrome(){

        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String text = input.nextLine();

        StringBuilder str = new StringBuilder();
        boolean palindrome = false;

        str.append(text);

        String normal = str.toString();
        String reversed = (str.reverse()).toString();

        if(normal.equals(reversed)){
            palindrome = true;
        }

        System.out.printf("Zodis '" + text + "' yra palindromas: " + "%b", palindrome);
    }


    public static void findMaxInMatrix(){

        Random rand = new Random();

        int[][] matrix = new int[4][4];
        int maxVal = 0;
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){

                matrix[i][j] = rand.nextInt(20);

                str.append(matrix[i][j]);
                str.append(" ");

                maxVal = Math.max(maxVal, matrix[i][j]);

            }
            str.append('\n');
        }

        System.out.println(str);
        System.out.println("Didziausia reiksme: " + maxVal);

    }

    public static void analyzeInput(){

        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite kiek norite sveiku skaiciu: ");
        int n = input.nextInt();
        int[] array = new int[n];
        double sum = 0;



        for(int i = 0; i < n; i++){
            System.out.println("Iveskite " + (i+1) + ". Reiksme: ");
            array[i] = input.nextInt();
            sum += array[i];
        }


        Arrays.sort(array);

        System.out.println("Koki skaiciu norite surasti?: ");

        int sk;

        sk = input.nextInt();

        if(Arrays.binarySearch(array, sk) > -1){
            System.out.println("Skaicius: " + (Arrays.binarySearch(array, sk) + 1) + " vietoje");
        }else{
            System.out.println("Tokio skaiciaus nera");
        }


        int maxVal = 0;
        int minVal = array[0];

        for(int i = 0; i < n; i++){

            maxVal = Math.max(maxVal, array[i]);
            minVal = Math.min(minVal, array[i]);


        }


        System.out.println("Reiksmes: " + Arrays.toString(array));
        System.out.printf("Vidurkis: " + "%.2f", sum/n);
        System.out.println();
        System.out.printf("Didziausia: " + "%d", maxVal);
        System.out.println();
        System.out.printf("Maziausia: " + "%d", minVal);
        System.out.println();
    }

}
