package com.thoughtworks.collection;

import main.java.com.thoughtworks.collection.MySingleLink;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.naming.NoInitialContextException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(arrayList);
    }

    public double getMinimum() {
        return Collections.min(arrayList);
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(x->x).average().getAsDouble();
    }

    public double getOrderedMedian() {
        int size = arrayList.size();
        if(size % 2 == 1){
            return arrayList.get(size / 2);
        }
        else{
            return(arrayList.get(size / 2 - 1) + arrayList.get(size / 2)) / 2.0;
        }
    }

    public int getFirstEven() {
        return arrayList.stream().filter(x -> x % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i <= arrayList.size(); i++) {
            if(arrayList.get(i) % 2 == 0){
                return  i;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(this.arrayList.size() == arrayList.size()){
            for (int i = 0; i < arrayList.size(); i++) {
                if(this.arrayList.get(i) != arrayList.get(i)){
                    return false;
                }
            }
            return true;
        }
        else {
            return  false;
        }

    }
    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(com.thoughtworks.collection.SingleLink<Integer> singleLink) {
        for (Integer item : arrayList) {
            singleLink.addTailPointer(item);
        }
        return getOrderedMedian();
    }

    public int getLastOdd() {
        List<Integer> list = arrayList.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
        return list.get(list.size() - 1);
    }

    public int getIndexOfLastOdd() {
        for (int i = arrayList.size()  - 1; i >= 0; i--) {
            if(arrayList.get(i) % 2 == 1){
                return  i;
            }
        }
        return -1;
    }
}
