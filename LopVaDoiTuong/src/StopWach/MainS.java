package StopWach;

public class MainS {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();

        stopWatch.setStartTime(System.currentTimeMillis());

        int[] array = new int[100000];
        for (int i = 100000, j = 0; i > 0; i--, j++) {      //sắp xếp chọn: là sắp xếp từ nhỏ tới lớn
            array[j] = i;
        }
//        for (int i = 0; i < 100000; i++) {
//            array[i] = (int) Math.floor(Math.random()*100000 + 1);
//        }

        stopWatch.setEndTime(System.currentTimeMillis());
        System.out.println(stopWatch.getElapsedTime());
    }
}
