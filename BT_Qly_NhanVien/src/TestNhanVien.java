import java.util.Scanner;

public class TestNhanVien {
    public static void main(String[] args) {
        NhanVien[] nhanViens = new NhanVien[5];
        nhanViens[0] = new NhanVienFullTime("001", "Tiến", 32, "091966", "dhtoan89@gmail.com", 1000, 200, 10000);
        nhanViens[1] = new NhanVienFullTime("002", "Mạnh", 30, "099999", "duy@gmail.com", 1500, 500, 12000);
        nhanViens[2] = new NhanVienFullTime("003", "Long", 20, "095555", "long@gmail.com", 500, 100, 10000);
        nhanViens[3] = new NhanVienPartTime("004", "Hùng", 26, "093333", "hung@gmail.com", 100);
        nhanViens[4] = new NhanVienPartTime("005", "Cường", 18, "096666", "cuong@gmail.com", 120);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hiển thị danh sách nhân viên");
        showEmployee(nhanViens);
        System.out.println();

        System.out.print("Tổng lương nhân viên Partime: ");
        System.out.println(totalSalaryPartime(nhanViens));
        System.out.println();

        System.out.println("Sắp xếp salary nhân viên fulltime");
        soutSalaryFull(nhanViens);
        System.out.println();

        System.out.println("Mức lương trung bình");
        System.out.println(LuongTB(nhanViens));
        System.out.println("Danh sách nv full lương thấp hơn lương trung bình");
        DSNVfullmin(nhanViens);


    }

    //hiển thị danh sách nhân viên
    public static void showEmployee(NhanVien[] nhanViens) {
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i]);
        }
    }

    //phương thức total lương nhân viên partime
    public static int totalSalaryPartime(NhanVien[] nhanViens) {
        int total = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof NhanVienPartTime) {
                total += nhanViens[i].salary();
            }
        }
        return total;
    }

    //sắp xếp lương nhân viên fulltime
    public static void soutSalaryFull(NhanVien[] nhanViens) {
        int count = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof NhanVienFullTime) {
                count++;
            }
        }
        NhanVien[] nhanViens1 = new NhanVien[count];
        for (int j = 0, i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof NhanVienFullTime) {
                nhanViens1[j] = nhanViens[i];
                j++;
            }
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (nhanViens1[j].salary() > nhanViens1[j + 1].salary()) {
                    NhanVien temp = nhanViens1[j];
                    nhanViens1[j + 1] = temp;
                    nhanViens1[j] = nhanViens1[j + 1];
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(nhanViens1[i]);
        }
    }

    //danh sách nv full lương dưới mức TB
    public static int LuongTB(NhanVien[] nhanViens) {
        int total = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            total += nhanViens[i].salary();
        }
        return (total / nhanViens.length);
    }

    public static void DSNVfullmin(NhanVien[] nhanViens) {
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof NhanVienFullTime && nhanViens[i].salary() < LuongTB(nhanViens)) {
                System.out.println(nhanViens[i]);
            }
        }
    }
}
