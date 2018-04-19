package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if(leftBorder > rightBorder){
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        int sum = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        if(leftBorder > rightBorder){
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        int sum = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            if(i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(x -> x * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int val = arrayList.get(i);
            if(val % 2 == 1){
                arrayList.set(i,val * 3 + 2);
            }
        }
        return  arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(m -> m % 2 == 1).mapToInt(x -> x * 3 + 5).sum();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            list.add((arrayList.get(i) + arrayList.get(i + 1))*3);
        }
        return  list;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(m -> m % 2 == 0).mapToInt(x -> x).sum() / 2.0;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(m -> m % 2 == 0).mapToInt(x -> x).average().getAsDouble();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream().filter(m -> m % 2 == 0).anyMatch(m -> m == specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(m -> m % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> list =  arrayList.stream().filter(m -> m % 2 == 0).sorted().collect(Collectors.toList());
        list.addAll(arrayList.stream().filter(m -> m % 2 == 1).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        return list;
    }


}
