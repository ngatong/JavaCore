package hinhhoc;

public class HinhChuNhat extends HinhBinhHanh {
    public HinhChuNhat(int canhKe, int canhDay) {
        super(canhKe, canhDay);
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "canhKe=" + canhKe +
                ", canhDay=" + canhDay +
                '}';
    }

public double tinhDienTich(){
        return canhDay*canhKe;
}
}
