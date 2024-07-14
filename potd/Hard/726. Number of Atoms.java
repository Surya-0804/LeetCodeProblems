class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        Map<String, Integer> currentMap = new HashMap<>();
        int i = 0, n = formula.length();

        while (i < n) {
            if (formula.charAt(i) == '(') {
                stack.push(currentMap);
                currentMap = new HashMap<>();
                i++;
            } else if (formula.charAt(i) == ')') {
                i++;
                int start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int multiplicity = i > start ? Integer.parseInt(formula.substring(start, i)) : 1;

                if (!stack.isEmpty()) {
                    Map<String, Integer> tempMap = currentMap;
                    currentMap = stack.pop();
                    for (String key : tempMap.keySet()) {
                        currentMap.put(key, currentMap.getOrDefault(key, 0) + tempMap.get(key) * multiplicity);
                    }
                }
            } else {
                int start = i;
                i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String element = formula.substring(start, i);
                start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int multiplicity = i > start ? Integer.parseInt(formula.substring(start, i)) : 1;
                currentMap.put(element, currentMap.getOrDefault(element, 0) + multiplicity);
            }
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(currentMap);
        StringBuilder sb = new StringBuilder();
        for (String key : sortedMap.keySet()) {
            sb.append(key);
            if (sortedMap.get(key) > 1) {
                sb.append(sortedMap.get(key));
            }
        }
        return sb.toString();
    }
}
