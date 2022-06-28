package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = cathetusLength - 1; i >= 0; i--) {
            int number = cathetusLength;
            boolean isFirstHalf = true;
            System.out.print(" ");
            //Print spaces up to the first number
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                number--;
            }
            //Print all numbers in line
            for (int j = 0; j < (cathetusLength - i) * 2 - 1; j++) {
                System.out.print(number);
                if (number == 1)
                    isFirstHalf = false;
                if (isFirstHalf)
                    number--;
                else
                    number++;
            }
            //Print spaces after the numbers
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(7);
    }
}
