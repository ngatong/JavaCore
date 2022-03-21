package phanso;

public class Calculator {
    String  Tong(PhanSo a, PhanSo b){
        PhanSo c=new PhanSo();
        c.setTuSo(a.getTuSo()*b.getMauSo()+a.getMauSo()*b.getTuSo());
        c.setMauSo(a.getMauSo()*b.getMauSo());
        return (c.getTuSo()+"/"+c.getMauSo());
    }
    String Hieu(PhanSo a, PhanSo b){
        PhanSo c=new PhanSo();
        c.setTuSo(a.getTuSo()*b.getMauSo()-a.getMauSo()*b.getTuSo());
        c.setMauSo(a.getMauSo()*b.getMauSo());
        return (c.getTuSo()+"/"+c.getMauSo());
    }
    String Tich(PhanSo a, PhanSo b){
        PhanSo c=new PhanSo();
        c.setTuSo(a.getTuSo()*b.getTuSo());
        c.setMauSo(a.getMauSo()*b.getMauSo());
        return (c.getTuSo()+"/"+c.getMauSo());
    }
    String Thuong(PhanSo a, PhanSo b){
        PhanSo c=new PhanSo();
        c.setTuSo(a.getTuSo()*b.getMauSo());
        c.setMauSo(a.getMauSo()*b.getTuSo());
        return (c.getTuSo()+"/"+c.getMauSo());
    }
}
