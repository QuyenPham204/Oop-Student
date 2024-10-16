import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon=0;
        do {
            System.out.println(
                    "1.	Thêm sinh viên vào danh sách.\n"
                            + "2.	In danh sách sinh viên ra màn hình.\n"
                            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                            + "5.	Làm rỗng danh sách sinh viên.\n"
                            + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                            + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "0.   Thoát khỏi chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.print("Nhập mã sinh viên:");
                    String maSinhVien = scanner.nextLine();
                    System.out.print("Nhập họ và tên sinh viên:");
                    String hoVaTen = scanner.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    int namSinh = scanner.nextInt();
                    System.out.print("Nhập điểm trung bình:");
                    float diemTrungBinh = scanner.nextFloat();
                        SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                        dssv.themSinhVien(sv);
                        break;

                case 2:
                    dssv.inDanhSachSinhVien();
                    break;
                case 3:
                    System.out.print("Danh sách: ");
                    if(dssv.kiemTraDanhSachRong()== true){
                        System.out.print("Rỗng");
                    }
                    else {
                        System.out.println("Không Rỗng ");
                    }
                    break;
                case 4:
                    System.out.println("Số lượng sinh viên trong danh sách: "+dssv.laySoLuongDanhSach());
                    break;
                case 5:
                    dssv.lamRongDanhSach();
                    System.out.println("Đã làm rỗng danh sách sinh viên");
                    break;
                case 6:
                    System.out.print("Nhập mã sinh viên để kiểm tra: ");
                    String maSinhVienKiemTra = scanner.nextLine();
                    SinhVien sinhVienKiemTra = new SinhVien(maSinhVienKiemTra);
                    if(dssv.kiemTraTonTai(sinhVienKiemTra)==true){
                        System.out.println("Sinh viên không tồn tại trong danh sách");
                    }else {
                        System.out.println("Sinh viên có tồn tại trong danh sách");
                    }
                    break;
                case 7:
                    System.out.print("Nhập mã sinh viên cần xóa:");
                    String maSinhVienCanXoa = scanner.nextLine();
                    SinhVien sinhVienCanXoa = new SinhVien(maSinhVienCanXoa);
                    dssv.xoaSinhVien(sinhVienCanXoa);
                    System.out.println("Sinh viên có mã "+ maSinhVienCanXoa +" đã xóa khỏi danh sách");
                    break;
                case 8:
                    System.out.println("Nhập tên sinh viên cần tìm: ");
                    String hoVaTenSinhVienCanTim = scanner.nextLine();
                    System.out.println("Kết quả sinh viên cần tìm: ");
                    dssv.timSinhVien(hoVaTenSinhVienCanTim);
                    break;
                case 9:
                    dssv.sapXepSinhVienGiamDanTheoDiem();
                    System.out.println("Danh sách sinh viên đã được sắp xếp có điểm từ cao đến thấp");
                    break;
                case 0:
                    System.out.println("Thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (luaChon != 0);

    }
}

