package sinhvien;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private float diemLyThuyet;
    private float diemThucHanh;
    public SinhVien(){

    }
    public SinhVien(int maSinhVien,String hoTen, float diemLyThuyet, float diemThucHanh){
        this.maSinhVien=maSinhVien;
        this.hoTen=hoTen;
        this.diemLyThuyet=diemLyThuyet;
        this.diemThucHanh=diemThucHanh;
    }
    public int getMaSinhVien(){
        return maSinhVien;
    }
    public void  setMaSinhVien(int maSinhVien){
        this.maSinhVien=maSinhVien;
    }

    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public float getDiemLyThuyet(){
        return diemLyThuyet;
    }
    public void  setDiemLyThuyet(float diemLyThuyet){
        this.diemLyThuyet=diemLyThuyet;
    }

    public float getDiemThucHanh(){
        return diemThucHanh;
    }
    public void  setDiemThucHanh(float diemThucHanh){
        this.diemThucHanh=diemThucHanh;
    }

    float diemTrungBinh(){
        return (diemThucHanh+diemLyThuyet)/2;
    }
    public String toString(){
        return "Ma sinh vien "+maSinhVien+" ten "+hoTen+" co diem LT= "+diemLyThuyet+" va diem TH la "+diemThucHanh +"==> diem TB la "+diemTrungBinh();
    }
  public   void print()
    {
        System.out.printf("%6d %-20s %10.2f %12.2f %12.2f \n",maSinhVien,hoTen,diemLyThuyet,diemThucHanh,diemTrungBinh());
    }

}
