package com.example.mylibrary.kotlin1119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionnalTest {

    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Jack","Jason","Tommy");
        List<String> shirtSizes = Arrays.asList("large","x-large","medium");
        Map<String, String> employeesShirtSizes = new HashMap<>();
        for (int i = 0; i <employees.size(); i++) {
            employeesShirtSizes.put(employees.get(i),shirtSizes.get(i));
        }
        List<String> formattedList = new ArrayList<>();
        for (Map.Entry<String, String> entry:employeesShirtSizes.entrySet()) {
            formattedList.add(String.format("%s,shirt size:%s",entry.getKey(),entry.getValue()));
            System.out.println(formattedList);
        }
    }
}
