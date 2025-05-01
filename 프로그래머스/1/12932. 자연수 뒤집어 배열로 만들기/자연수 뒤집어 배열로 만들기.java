class Solution {
    public int[] solution(long n) {
        String a = Long.toString(n); //length()를 얻기 위한 String 형변환
        int[] answer = new int [a.length()];
        int i = 0;
        while (n > 0) {
            answer[i] = (int)(n%10);
            n/=10;
            i++;
        }
        return answer;
    }
}