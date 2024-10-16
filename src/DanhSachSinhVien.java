import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach ;
    public DanhSachSinhVien(ArrayList<SinhVien> danhSach){
        this.danhSach=danhSach;
    }
    public DanhSachSinhVien(){
        this.danhSach= new ArrayList<SinhVien>();
    }

    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    public void inDanhSachSinhVien(){
        for (SinhVien sv: danhSach) {
            System.out.println(sv);
        }
    }
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }

    public int laySoLuongDanhSach(){
        return this.danhSach.size();
    }
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }
    public boolean xoaSinhVien(SinhVien sv){
        return  this.danhSach.remove(sv);
    }
    public void timSinhVien(String ten){
        for (SinhVien sv: danhSach) {
            if(sv.getHoVaTen().indexOf(ten)>=0){
                System.out.println("+ " + sv);
            }
        }
    }
    public void sapXepSinhVienGiamDanTheoDiem(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiemTrungBinh()>o2.getDiemTrungBinh()){
                    return -1;
                } else if (o1.getDiemTrungBinh()< o2.getDiemTrungBinh()) {
                    return 1;

                }else {
                    return 0;
                }
            }
        });
    }
}
