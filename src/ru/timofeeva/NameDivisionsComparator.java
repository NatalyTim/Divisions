package ru.timofeeva;

import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collector;

public class NameDivisionsComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] arr1 = o1.split("\\\\");
        String[] arr2 = o2.split("\\\\");
        for (int i = 0; i < min(arr1.length, arr2.length); i++) {
            int resCompare = arr1[i].compareTo(arr2[i]);
            if (resCompare != 0) {
                return -resCompare;
            }
        }
        if (arr1.length == arr2.length){
            return 0;
        }else  if (arr1.length <= arr2.length){
            return  -1;
        }else {
            return 1;
        }

    }

    public int min(int len1, int len2){
        if (len1 < len2){
            return len1;
        }else {
            return len2;
        }
    }
}
