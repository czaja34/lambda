package pl.kubaczajkowski.lambda;

import java.util.*;

public class LambdaApp {


    public static void main(String[] args) {

        Potega potega = (int x) -> x * x;

        Mnozenie mnozenie = (int x, int y) -> x * y;

        Mnozenie mnozenie2 = ( int x, int y) ->{
            return x * y;
        };

        List<String> lista = Arrays.asList("Kuba", "Ala", "Ola", "Maciek");
        Collections.sort(lista, (s1,s2)->s1.compareTo(s2));

        lista.forEach(n -> System.out.println(n));
        System.out.println(potega.potega(2));
        System.out.println(mnozenie.mnozenie(3, 4));
        System.out.println(mnozenie2.mnozenie(3, 4));
    }
}
