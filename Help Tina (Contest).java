static class Solve {
    public ArrayList<Integer> solve(int n){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }
        Collections.reverse(result);
        return result;
    }
}
