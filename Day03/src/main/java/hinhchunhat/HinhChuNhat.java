package hinhchunhat;

public class HinhChuNhat {
    double chieuDai, chieuRong;

    public HinhChuNhat() {

    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public String toString() {
        return "Chieu dai= "+chieuDai +", chieu rong= "+chieuRong +" co chu vi la "+tinhChuVi()+" va dien tich la "+tinhDienTich();
    }
}
