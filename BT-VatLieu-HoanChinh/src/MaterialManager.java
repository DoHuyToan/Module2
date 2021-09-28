public class MaterialManager {
    private Material[] materialist = {};

    public Material[] getMaterial() {
        return materialist;
    }

    public void setMaterial(Material[] materialist) {
        this.materialist = materialist;
    }

    public void displayMaterial(Material[] materialist){
        for (int i=0; i<materialist.length; i++){
            System.out.println(materialist[i]);
        }
    }

    public void addNewMaterial(Material newMaterial){
        Material [] newMaterialist = new Material[materialist.length + 1];
        for (int i=0; i<materialist.length; i++){
            newMaterialist[i] = materialist[i];
        }
        newMaterialist[newMaterialist.length - 1] = newMaterial;
        materialist = newMaterialist;
    }

    public void deleteMaterial(int index){
        Material [] newMaterialist = new Material[materialist.length - 1];
        for (int i=0; i<index; i++){
            newMaterialist[i] = materialist[i];
        }
        for (int i=index, j=index; i<materialist.length -1 ; i++, j++){
            newMaterialist[i] = materialist[j+1];
        }
        materialist = newMaterialist;
    }

    public void editMaterial(Material newMaterial, int index){
        Material [] newMaterialist = new Material[materialist.length];
        for (int i=0; i<materialist.length; i++){
            if(i == index){
                newMaterialist[i] = newMaterial;
            }
        }
        materialist = newMaterialist;
    }








}
