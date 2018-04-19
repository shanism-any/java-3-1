package main.java.com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class MySingleLink implements com.thoughtworks.collection.SingleLink<Integer> {

    List<Integer> arrayList;

    public MySingleLink(){
        arrayList = new ArrayList<>();
    }

    @Override
    public Integer getHeaderData() {
        if(arrayList.size() > 0){
            return arrayList.get(0);
        }
        else{
            return  null;
        }

    }

    @Override
    public Integer getTailData() {
        int size = arrayList.size();
        if(size > 0){
            return arrayList.get(size - 1);
        }
        else{
            return  null;
        }
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
       return arrayList.isEmpty();
    }

    @Override
    public boolean deleteFirst() {
        if(arrayList.size() > 0){
            arrayList.remove(0);
            return true;
        }
        else{
            return  false;
        }

    }

    @Override
    public boolean deleteLast() {
        int size = arrayList.size();
        if(size > 0){
            arrayList.remove(size - 1);
            return true;
        }
        else{
            return  false;
        }
    }

    @Override
    public void addHeadPointer(Integer item) {
        arrayList.add(0, item);
    }

    @Override
    public void addTailPointer(Integer item) {
        arrayList.add(item);
    }

    @Override
    public Integer getNode(int index) {
        return arrayList.get(index - 1);
    }
}
