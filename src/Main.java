import Classes.MyArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MyArray<Integer> arrInteger = new MyArray<>();
        arrInteger.add(4);
        arrInteger.add(3);
        arrInteger.add(2);
        arrInteger.add(1);
        arrInteger.print();
        System.out.println("-------------------");
        arrInteger.sortChoice();
        arrInteger.print();

        Random rnd = new Random();
        MyArray<Double> arrDouble = new MyArray<>();
        for (int i = 0; i < 10; i++) {
            arrDouble.add(rnd.nextDouble());
        }
        arrDouble.print();
        System.out.println("-------------------");
        arrDouble.sortBubble();
        arrDouble.print();
        System.out.printf("Minimum: %f\n", arrDouble.getMin());
        System.out.printf("Maximum: %f\n", arrDouble.getMax());
        arrDouble.removeAll(arrDouble.getMax());
        arrDouble.print();

    }
}