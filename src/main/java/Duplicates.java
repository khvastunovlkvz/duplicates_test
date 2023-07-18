import java.util.*;

public class Duplicates {

    private static String sorted(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static List<String> findDuplicates(String[] inputArr) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<String> resultsArr = new ArrayList<>();

        for (int i = 0; i < inputArr.length; i++) {
            String sortStr = sorted(inputArr[i]);
            if (map.containsKey(sortStr)) {
                List<Integer> indexes = map.get(sortStr);
                indexes.add(i);
            } else {
                List<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                map.put(sortStr, indexes);
            }
        }

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> listIndexes = entry.getValue();
            if (listIndexes.size() > 1) {
                String preResult = entry.getKey() + " = " + listIndexes;
                String result = preResult.replaceAll("\\[|\\]", "");
                resultsArr.add(result);
            }
        }
        return resultsArr;
    }
}
