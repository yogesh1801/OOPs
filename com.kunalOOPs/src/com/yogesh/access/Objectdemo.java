package com.yogesh.access;

public class Objectdemo {

    int num;

    public Objectdemo(int num) {
        this.num = num;
    }

    // more in hashmap lecture (gives number to a object)
    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // to string method override
    @Override
    public String toString() {
        return super.toString();
    }

    // used during garbage collection
    @Override
    public void finalize() throws Throwable {
        super.finalize();
    }
}
