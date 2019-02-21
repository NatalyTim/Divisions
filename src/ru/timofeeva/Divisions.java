package ru.timofeeva;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Divisions {

    private Comparator<String> compDivisions;
    public Set divisionSet;

    public Divisions() {
        compDivisions = new NameDivisionsComparator();
        divisionSet = new TreeSet(compDivisions);
    }

    public void parseArray(String[] inputArr) {
        if(inputArr == null || inputArr.length == 0)
            return;
        for (int e = 0; e < inputArr.length; e++) {
            addStringToSet(inputArr[e]);
        }
    }

    public void addStringToSet(String inputStr) {
        if(inputStr == null || "".equals(inputStr.trim())){
            return;
        }
        String[] arr = inputStr.split("\\\\");
        String str = arr[0];
        divisionSet.add(str);

        if(arr.length <= 1)
            return;
        for(int i = 1; i<arr.length; i++){
            str += "\\" + arr[i];
            divisionSet.add(str);
        }
    }

    public Set getDivisionSet() {
        return divisionSet;
    }
}
