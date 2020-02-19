package com.madejski;

public class ListImpl<E> implements List<E> {
    public Node<E> first = null;
    public int n = 0;
    public void insert(int pos, E data) throws WrongIndexException {
        if(pos < 0 || pos > this.n) throw new WrongIndexException();
        if(this.first == null) {
            Node<E> new_node = new Node<E>(data);
            this.first = new_node;
            this.n = this.n + 1;
        }else{
            Node<E> prev = null;
            Node<E> curr = this.first;
            for(int i=1; i<= pos; i++){
                prev = curr;
                curr = curr.next;
            }
            Node<E> new_node = new Node<E>(data, curr);
            if (prev != null){
            prev.next = new_node;
            }
            else {
                this.first = new_node;
            }
        }
        this.n = this.n + 1;
    }

    public void delete(int pos) throws WrongIndexException {
        //FIXME
    }

    public E get(int pos) throws WrongIndexException {
        return null;
        //FIXME
    }

    public int size() {
        return this.n;
    }

    public String toString(){
        if (this.n == 0) {
            return "[]";
        }
        String str = "[";
        Node<E> curr = this.first;
        for(int i = 0; i<this.n-1; i++){
            str = str + curr.data.toString() + ",";
            curr = curr.next;
        }
        str = str + curr.data.toString() + "   ]";
        return str;
    }
}
