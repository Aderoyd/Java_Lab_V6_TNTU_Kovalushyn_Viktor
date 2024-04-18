import java.util.Arrays;

/* Виконав студент групи СІ-22
Ковалишин Віктор Петрович
Варіант 6
В одновимірному масиві, що складається з N дійсних елементів, обчислити:
    мінімальний елемент масиву;
    суму елементів масиву, що розташовані між першим і останнім додатними елементами.
    Перетворити масив таким чином, щоб спочатку розташовувались всі елементи, рівні нулю, а потім -- решта.
 */
public class Main {
    public static void main(String[] args) {
        double[] A = {-4.25, -8.92, 6.91, -1.07, 0.22, 0, 6.03, 0, 9.72, 5.07, 3.34, -9.72};
        double min = A[0];
        for (int i = 1; i < A.length; i++) {   //min element search
            if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.println("Завдання 1");
        System.out.print("Мінімальний ел. масиву: ");
        System.out.println(min);
        int firstPositiveIndex = -1;  // first plus search
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                firstPositiveIndex = i;
                break;
            }
        }
        int lastPositiveIndex = -1;  //  last plus search
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] > 0) {
                lastPositiveIndex = i;
                break;
            }
        }
        double sum = 0;
        if (firstPositiveIndex != -1 && lastPositiveIndex != -1 && firstPositiveIndex < lastPositiveIndex) {
            for (int i = firstPositiveIndex + 1; i < lastPositiveIndex; i++) {
                sum += A[i];
            }
        }
        System.out.println();
        System.out.println("Завдання 2");
        System.out.print("Перший додатній ел.масиву: ");
        System.out.println(firstPositiveIndex);
        System.out.print("Останій додатній ел.масиву: ");
        System.out.println(lastPositiveIndex);
        System.out.print("Сума між перщим і останім ,,+,, ел.масиву: ");
        System.out.println(sum);
        int nonZeroIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                double temp = A[nonZeroIndex];
                A[nonZeroIndex] = A[i];
                A[i] = temp;
                nonZeroIndex++;
            }
        }
        System.out.println();
        System.out.println("Завдання 3");
            for (double element : A) {
                System.out.print(element + " ");
            }
    }
}
