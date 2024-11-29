package Complementos;

import uni.aed.tda.linkedlistTDA.LinkedListTDA;
import uni.aed.tda.linkedlistTDA.Iterador;

public class Sort {
    public static <T extends Comparable<T>> void sort(LinkedListTDA<T> list) {
        int n = list.size();
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                T element1 = list.get(j);
                T element2 = list.get(j + 1);
                
                if (element1.compareTo(element2) > 0) {
                    // Swap elements
                    list.modify(j, element2);
                    list.modify(j + 1, element1);
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
    }
}

