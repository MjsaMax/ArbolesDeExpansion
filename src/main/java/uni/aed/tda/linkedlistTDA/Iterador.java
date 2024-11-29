package uni.aed.tda.linkedlistTDA;

import uni.aed.tda.listTDA.IteratorTDA;
import uni.aed.tda.listTDA.NoSuchElementException;

public class Iterador<E> implements IteratorTDA<E> {
    public Nodo<E> actual;
    private LinkedListTDA linkedlist;

   public Iterador(Nodo<E> actual){
        this.actual = actual;
    }
    public Iterador(LinkedListTDA<E> linkedlist){
        this.actual = linkedlist.head;
    }

    @Override
    public boolean hasNext() {
        return actual!=null;
    }

    @Override
    public E next() throws NoSuchElementException {
        if(actual==null)
            throw new NoSuchElementException("No hay mas elementos");
        E data=actual.getData();
        actual=actual.getNext();
        return data;
    }
    
}
