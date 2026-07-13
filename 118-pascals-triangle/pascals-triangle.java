class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int count = numRows;
        while (count != 0) {

            if (l1.isEmpty()) {
                l2 = new ArrayList<>();
                l2.add(1);
                l1.add(l2);
            } else if (l1.size() == 1) {
                l2 = new ArrayList<>();
                l2.add(1);
                l2.add(1);
                l1.add(l2);
            } else {
                l2 = new ArrayList<>();
                l2.add(1);
                for (int i = 0; i < l1.get(l1.size() - 1).size() - 1; i++) {
                    l2.add(l1.get(l1.size() - 1).get(i) + l1.get(l1.size() - 1).get(i + 1));

                }
                l2.add(1);
                l1.add(l2);
            }

            count--;
        }
        return l1;
    }
}