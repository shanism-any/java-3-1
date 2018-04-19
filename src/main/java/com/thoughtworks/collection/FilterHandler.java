package com.thoughtworks.collection;

public interface FilterHandler<T> {
    public boolean apply(T t);
}
