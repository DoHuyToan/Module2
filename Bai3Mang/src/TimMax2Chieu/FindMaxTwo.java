package TimMax2Chieu;

public class FindMaxTwo {
    public static void main(String[] args) {
        int arrTwo[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,34,68,18,12}
        };      //khai báo mảng 2 chiều
        int max = arrTwo[0][0];
        for(int i=0; i< arrTwo.length; i++){
            for (int j=0; j<arrTwo[i].length; j++){
                if(arrTwo[i][j]>max)
                    max = arrTwo[i][j];
            }
        }
        System.out.print("Max is: " + max + "\n");
        int min = arrTwo[0][0];
        for(int i=0; i< arrTwo.length; i++){
            for (int j=0; j<arrTwo[i].length; j++){
                if(arrTwo[i][j]<min)
                    min = arrTwo[i][j];
            }
        }
        System.out.print("Min is: " + min);
    }
}
