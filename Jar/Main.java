package Jar;

public class Main {
    public static void main(String[] args) {
        Jar<String> stringJar = new Jar<String>();
        stringJar.add("Nelly");
        stringJar.add("John");
        stringJar.add("Michael");

        System.out.println(stringJar.remove());
        System.out.println(stringJar.remove());

        Jar<Integer> integerJar = new Jar<Integer>();
        integerJar.add(15);
        integerJar.add(30);
        integerJar.add(60);

        System.out.println(integerJar.remove());
    }
}
