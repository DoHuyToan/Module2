package BT_Sach;

public class TestBook {
    public static void main(String[] args) {
        Book p1 = new ProgrammningBook("001", "Thép đã tôi thế đấy", 300, "Duy", "Russia", "fw1");
        Book p2 = new ProgrammningBook("002", "Đón bình minh", 360, "Toàn", "Java", "fw2");
        Book p3 = new ProgrammningBook("003", "Đắc nhân tâm", 100, "Tuấn", "USD", "fw3");
        Book p4 = new ProgrammningBook("004", "Rồng vàng", 200, "Long", "VietNam", "fw4");
        Book p5 = new ProgrammningBook("005", "Sinh tử", 150, "Thảo", "Trung Quốc", "fw5");

        Book f1 = new FictionBook("006", "Làm giàm", 300, "KA", "CT1");
        Book f2 = new FictionBook("007", "Ai nhanh hơn", 250, "Ronaldo", "CT2");
        Book f3 = new FictionBook("008", "Chạy án", 180,"Bổng", "CT3");
        Book f4 = new FictionBook("009", "Chiến tranh và Hòa bình", 120,"Obama", "CT4");
        Book f5 = new FictionBook("010", "An nhiên", 230, "Tuệ Tâm", "CT5");

        Book[] array = {p1, p2, p3, p5, p5, f1, f2, f3, f4, f5};
        double total = 0;
        for (int i = 0; i<array.length; i++){
            total += array[i].getPrice();
        }
        System.out.println(total);


        Book[] array1 = {p1, p2, p3 , p4, p5};
        int conut = 0;
        for (int i=0; i<array1.length; i++){
            if(((ProgrammningBook)array1[i]).getLanguage().equalsIgnoreCase("Java")){
                conut++;
            }
        }
        System.out.println(conut);
    }
}
