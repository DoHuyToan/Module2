package TongCheoChinh;

public class SumCross {
    public static void main(String[] args) {
        int arrTwo[][]= {
                {1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7},
                {4,5,6,7,8},
                {5,6,7,8,9}
        };
        int sum = 0;
        for(int i=0; i< arrTwo.length; i++){
            sum += arrTwo[i][i];
        }
        System.out.print("Tổng chéo: " + sum);
    }
}
