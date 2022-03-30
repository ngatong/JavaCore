package hinhhoc;

public class HinhBinhHanh implements HinhHoc2D {
 protected int canhKe;
 protected int canhDay;
 protected int chieuCao;

    public HinhBinhHanh(int canhKe, int canhDay, int chieuCao) {
        this.canhKe = canhKe;
        this.canhDay = canhDay;
        this.chieuCao = chieuCao;
    }

    public HinhBinhHanh(int canhKe, int canhDay) {
        this.canhKe = canhKe;
        this.canhDay = canhDay;
    }

    public int getCanhKe() {
        return canhKe;
    }

    public void setCanhKe(int canhKe) {
        this.canhKe = canhKe;
    }

    public int getCanhDay() {
        return canhDay;
    }

    public void setCanhDay(int canhDay) {
        this.canhDay = canhDay;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return "HinhBinhHanh[" +
                "canhKe=" + canhKe +
                ", canhDay=" + canhDay +
                ", chieuCao=" + chieuCao +
                ']';
    }

    @Override
    public double tinhChuVi() {
        return 2*(canhKe +canhDay);
    }

    @Override
    public double tinhDienTich() {
        return chieuCao*canhDay;
    }
}
