package Classes;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Collections;

public class MyArray<T extends Comparable<T>> {
    private ArrayList<T> data;
    public MyArray(int size){
        this.data = new ArrayList<>(size);
    }
    public MyArray(){
        this(0);
    }
    public MyArray(T[] array){
        this(array.length);
        for (T item: array) {
            this.data.add(item);
        }
    }
    public boolean add(T value){
        return this.data.add(value);
    }
    public T remove(int index){
        try {
            return data.remove(index);
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public void removeAll(T value){
        while (this.data.remove(value)) {}
    }
    public T getMin(){
        return Collections.min(this.data);
    }
    public T getMax(){
        return Collections.max(this.data);
    }
    public double getSum(){
        double result = 0.0;
        try {
            for (T item: this.data) {
                result += Double.parseDouble(item.toString());
            }
            return result;
        }
        catch (NullPointerException  ex){
            System.out.println("Can't to summarize elements!\n" + ex.getMessage());
        }
        catch (NumberFormatException ex){
            System.out.println("Can't to summarize elements!\n" + ex.getMessage());
        }
        return 0.0;
    }
    public double getMultiple(){
        double result = 1.0;
        try {
            for (T item: this.data) {
                result *= Double.parseDouble(item.toString());
            }
            return result;
        }
        catch (NullPointerException  ex){
            System.out.println("Can't to multiply elements!\n" + ex.getMessage());
        }
        catch (NumberFormatException ex){
            System.out.println("Can't to multiply elements!\n" + ex.getMessage());
        }
        return 0.0;
    }
    public int indexOf(T item){
        return this.data.indexOf(item);
    }
    public boolean contains(T item){
        return this.data.contains(item);
    }
    public void sortBubble(){
        for (int i = 0; i < this.data.size() - 1; i++) {
            for (int j = 0; j < this.data.size() - i - 1; j++) {
                if (this.data.get(j).compareTo(this.data.get(j+1)) > 0){
                    Collections.swap(this.data, j, j +1);
                }
            }
        }
    }
    public void sortChoice(){
        for (int i = 0; i < this.data.size() - 1; i++) {
            int iMin = i;
            for (int j = i; j < this.data.size(); j++) {
                if (this.data.get(iMin).compareTo(this.data.get(j)) > 0){
                    iMin = j;
                }
            }
            Collections.swap(this.data, i, iMin);
        }
    }
    public T get(int index){
        try {
            return this.data.get(index);
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public void set(int index, T value){
        try {
            this.data.set(index, value);
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    public void print(){
        System.out.println(this);
    }
    public int size(){
        return this.data.size();
    }

}
