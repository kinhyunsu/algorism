class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        char[] str = Integer.toString(x).toCharArray();
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += Character.getNumericValue(str[i]);
        }
        if (x % sum != 0) answer = false;
        return answer;
    }
}