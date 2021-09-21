package StopWach;

public class MainS {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.setStartTime(System.currentTimeMillis());
        int[] array = new int[100000];
        for (int i = 100000, j = 0; i > 0; i--, j++) {      //sắp xếp chọn: là sắp xếp từ nhỏ tới lớn
            array[j] = i;
        }
        stopWatch.setEndTime(System.currentTimeMillis());
        System.out.println(stopWatch.getElapsedTime());
    }
}
