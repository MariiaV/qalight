package libs;

import java.util.List;

public class WorkWithList {

    public void addListToList(List<List<String>> ourList, List<String> value) {

        ourList.add(value);

    }

    public void addValueToListList(int numberOfList, String value, List<List<String>> ourList) {
        List<String> listBynumber = ourList.get(numberOfList);
        listBynumber.add(value);

    }


    public void printListList(List<List<String>> ourList) {
        for (int i = 0; i < ourList.size(); i++) {
            //System.out.println("element" + i + ourList.get(i));
            //   ourList.get(i).forEach(v -> System.out.println(v));
            List<String> listOfStrings = ourList.get(i);
            listOfStrings.forEach(v -> System.out.println(v));
        }
}}
