import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaterialTest {
    public static void main(String[] args) {
        Material materialList1 = new CrispyFlour("01","Bột 01", LocalDate.of(2021,9,26), 5000, 5);
        Material materialList2 = new CrispyFlour("02","Bột 02", LocalDate.of(2021,9,26), 6000, 6);
        Material materialList3 = new CrispyFlour("03","Bột 03", LocalDate.of(2021,9,26), 7000, 7);
        Material materialList4 = new CrispyFlour("04","Bột 04", LocalDate.of(2021,9,26), 8000, 8);
        Material materialList5 = new CrispyFlour("05","Bột 05", LocalDate.of(2021,9,26), 9000, 9);
        Material materialList6 = new Meat("06", "Thịt lợn", LocalDate.of(2021,9,22), 15000, 20);
        Material materialList7 = new Meat("07", "Thịt bò", LocalDate.of(2021,9,25), 20000, 10);
        Material materialList8 = new Meat("08", "Thịt gà", LocalDate.of(2021,9,23), 18000, 5);
        Material materialList9 = new Meat("09", "Cá", LocalDate.of(2021,9,26), 17000, 3);

        Material materialList10 = new Meat("10", "Tôm", LocalDate.of(2021,9,22), 16000, 2);

        List<Material> materialList = new ArrayList<>();
        materialList.add(materialList1);
        materialList.add(materialList2);
        materialList.add(materialList3);
        materialList.add(materialList4);
        materialList.add(materialList5);
        materialList.add(materialList6);
        materialList.add(materialList7);
        materialList.add(materialList8);
        materialList.add(materialList9);

        MaterialManager materialManager = new MaterialManager();

        //Hiển thị danh sách Material
        System.out.println("Hiển thị danh sách");
        materialManager.setMaterials(materialList);
        materialManager.displayMaterial();
        System.out.println();

        //Tổng tiền sau chiết khấu
        System.out.println("Tổng tiền sau chiết khấu");
        System.out.println(materialManager.totalRealMoney());
        System.out.println();

        //Thêm phẩn tử vào Material
        System.out.println("Thêm phần tử vào");
        materialManager.addMaterial(materialList10);
        materialManager.displayMaterial();
        System.out.println();

        //Xóa phần tử trong Material
        System.out.println("Xóa phần tử");
        materialManager.removeMaterial(materialList4);
        materialManager.displayMaterial();
        System.out.println();


        //Sửa phần tử trong Material
//        System.out.println("Sửa phần tử");
//        Scanner input = new Scanner(System.in);
//        double index = input.nextDouble();
//        materialManager.editMaterial(materialList10, index);
//        materialManager.displayMaterial();
    }
}
