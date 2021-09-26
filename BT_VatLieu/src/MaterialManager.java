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

    //thêm vật liệu
    public  void addMaterial(Material material){
        materialList.add(material);
    }

    //xóa vật liệu
    public void removeMaterial(Material material){
        materialList.remove(material);
    }

    //sửa vật liệu
    public void editMaterial(Material material,int index){
        boolean isExisted = false;
        for (int i=0; i<materialList.size(); i++) {
            if(i==index) {
                isExisted = true;
                materialList.get(i) = material;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", index);
        } else {
            System.out.println(materialList);
        }
    }
}
