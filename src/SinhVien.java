import java.util.InputMismatchException;
import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private float diemTrungBinh;

    public SinhVien (String maSinhVien,String hoVaTen,int namSinh,float diemTrungBinh){
        this.maSinhVien=maSinhVien;
        this.hoVaTen=hoVaTen;
        this.namSinh=namSinh;
        this.diemTrungBinh=diemTrungBinh;
    }
    public SinhVien(String maSinhVien){
        this.maSinhVien=maSinhVien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public String toString(){
        return "Mã sinh viên: "+maSinhVien+" , Họ và tên: "+hoVaTen+" , Năm sinh: "+namSinh+" , Điểm trung bình: "+diemTrungBinh;
    }

}
