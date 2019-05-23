import java.util.Scanner;

public class GueesNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        do {
            System.out.println("Podaj liczbę");
            number = sc.nextInt();
            if (number < 100) System.out.println("Podana liczba jest za mała");
            if (number > 200) System.out.println("Podana liczba jest za duża");
            if (number >= 100 && number <= 200 && number % 3 != 0)
                System.out.println("Podana liczba nie jest podzielna przez trzy");
        }
        while (number >= 100 && number <= 200 && number % 3 != 0);
        

        System.out.println("Podana liczba jest ok");

    }
}
