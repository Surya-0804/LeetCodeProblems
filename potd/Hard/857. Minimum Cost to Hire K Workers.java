class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        List<Pair<Double, Integer>> ratio = new ArrayList<>();
        int n = quality.length;
        int qualitySum = 0;
        double result = Double.MAX_VALUE;
        double maxRate = 0.0;

        for (int i = 0; i < n; ++i) {
            ratio.add(new Pair<>((double) wage[i] / quality[i], i));
        }

        ratio.sort(Comparator.comparingDouble(p -> p.getKey()));
        for (int i = 0; i < k; ++i) {
            qualitySum += quality[ratio.get(i).getValue()];
            maxRate = Math.max(maxRate, ratio.get(i).getKey());
            maxHeap.offer(quality[ratio.get(i).getValue()]);
        }

        result = maxRate * qualitySum;
        for (int i = k; i <n; ++i) {
            maxRate = Math.max(maxRate, ratio.get(i).getKey());
            qualitySum -= maxHeap.poll();
            qualitySum += quality[ratio.get(i).getValue()];
            maxHeap.offer(quality[ratio.get(i).getValue()]);
            result = Math.min(result, maxRate * qualitySum);
        }

        return result;
    }
}
