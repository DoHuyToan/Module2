import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MaterialManager {
    private List<Material> materialList;

    public MaterialManager() {
    }

    public List<Material> getMaterials() {
        return materialList;
    }

    public void setMaterials(List<Material> materialList) {
        this.materialList = materialList;
    }

    //hiển thị danh sách vật liệu
    public void displayMaterial(){
        for (Material material: materialList) {
            System.out.println(material);
        }
    }

    //tính tổng tiền sau chiếu khấu
    public double totalRealMoney(){
        double sum1 = 0;
        double sum2 = 0;
        for (Material material: materialList) {
            if(material instanceof CrispyFlour){
                sum1 += ((CrispyFlour) material).getRealMoney();
            }
            else sum2 += ((Meat)material).getRealMoney();
        }
        return sum1 + sum2;
    }

    //thêm vật liệu
    public  void addMaterial(Material material){
        materialList.add(material);
    }

    //xóa vật liệu
    public void removeMaterial(Material material){
        materialList.remove(material);
    }

    //sửa vật liệu
//    public void editMaterial(Material material,int index){
//        Scanner input = new Scanner(System.in);
//        boolean isExisted = false;
//        for (int i=0; i<materialList.size(); i++) {
//            if(i==index) {
//                isExisted = true;
//                materialList.get(i).setId() = input.nextLine();
//                materialList.get(i).setName() = input.nextLine();
//                materialList.get(i).setMfg() = input.
//            }
//        }
//        if (!isExisted) {
//            System.out.printf("id = %d not existed.\n", index);
//        } else {
//            System.out.println(materialList);
//        }
//    }
}
