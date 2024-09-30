class Solution {

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int[] answer = new int[arr.length -1];

        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        for (int i = 0; i < minIndex; i++) {
            answer[i] = arr[i];
        }

        for (int i = minIndex + 1; i < arr.length; i++) {
            answer[i - 1] = arr[i];
        }

        return answer;
    }

}
