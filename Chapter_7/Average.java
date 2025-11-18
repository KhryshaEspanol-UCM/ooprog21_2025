public class Average {
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(countAboveAvg(responseTimes));
    }
    public static int countAboveAvg(int[] responseTimes) {
        int count = 0;
        int sum = responseTimes[0];
        int average;
        for (int i = 1; i < responseTimes.length; i++) {
            average = sum / i;
            if (responseTimes[i] > average) {
                count++;
            }
            sum = sum + responseTimes[i];
        }
        return count;
    }
}
