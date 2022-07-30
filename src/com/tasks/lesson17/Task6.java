package com.tasks.lesson17;

import java.io.Serializable;

public class Task6<T extends String, V extends Integer & Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public void printInfo(Task6 task6) {
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass());
    }

    public Task6(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public static void main(String[] args) {
    }
}
