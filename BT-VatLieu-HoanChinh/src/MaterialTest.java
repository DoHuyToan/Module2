import java.time.LocalDate;
import java.util.Scanner;

public class MaterialTest {
    public static void main(String[] args) {
        Material[] materialList = new Material [10];
        materialList[0] = new CrispyFlour("01", "Bột 01", LocalDate.of(2021,5,26), 5000, 5);
        materialList[1] = new CrispyFlour("02","Bột 02", LocalDate.of(2021,6,26), 6000, 6);
        materialList[2] = new CrispyFlour("03","Bột 03", LocalDate.of(2021,7,26), 7000, 7);
        materialList[3] = new CrispyFlour("04","Bột 04", LocalDate.of(2021,8,26), 8000, 8);
        materialList[4] = new CrispyFlour("05","Bột 05", LocalDate.of(2021,9,26), 9000, 9);
        materialList[5] = new Meat("06", "Thịt lợn", LocalDate.of(2021,9,22), 15000, 20);
        materialList[6] = new Meat("07", "Thịt bò", LocalDate.of(2021,9,25), 20000, 10);
        materialList[7] = new Meat("08", "Thịt gà", LocalDate.of(2021,9,23), 18000, 5);
        materialList[8] = new Meat("09", "Cá", LocalDate.of(2021,9,26), 17000, 3);
        materialList[9] = new Meat("10", "Tôm", LocalDate.of(2021,9,22), 16000, 2);

        MaterialManager KA = new MaterialManager();
        KA.setMaterial(materialList);


        System.out.println("Thêm phần tử vào mảng");
        Material newMaterial = newMaterial();
        KA.addNewMaterial(newMaterial);
        System.out.println(KA.getMaterial().length);
        System.out.println("Danh scahs mảng");
        KA.displayMaterial(materialList);
        System.out.println();

        System.out.println("Xóa phần tử trong mảng");
        KA.deleteMaterial(4);
        System.out.println(KA.getMaterial().length);
        KA.displayMaterial(materialList);
        System.out.println();

        System.out.println("Sửa phần tử trong mảng");
        KA.editMaterial(newMaterial, 5);
        KA.displayMaterial(materialList);

    }



    public static Material newMaterial(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id");
        String id = input.nextLine();
        System.out.println("Nhập tên");
        String name = input.nextLine();
        System.out.println("Nhập năm");
        Scanner input1 = new Scanner(System.in);
        int year = input1.nextInt();
        System.out.println("Nhập tháng");
        int month = input1.nextInt();
        System.out.println("Nhập ngày");
        int day = input1.nextInt();
        System.out.println("Nhập giá");
        int cost = input1.nextInt();
        System.out.println("Nhập chất lượng");
        int quantity = input1.nextInt();
//
//        int choose = input1.nextInt();
//        System.out.println("Menu");
//        System.out.println("1. Id");
//        System.out.println("2. Name");
//        System.out.println("3. manufacturingDate");

        Material newMaterial = new CrispyFlour(id,name, LocalDate.of(year,month,day), cost, quantity);
        return newMaterial;
    }

}
