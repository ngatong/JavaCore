package hinhhoc;

public class HinhTru extends HinhTron  implements HinhHoc3D {
protected double chieuCao;

    public HinhTru(double radius) {
        super(radius);
    }

    public HinhTru(double radius, double chieuCao) {
        super(radius);
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhTheTich() {
        return super.tinhDienTich()*chieuCao*Math.PI ;
    }

    @Override
    public String toString() {
        return "HinhTru[" +
                "radius=" + radius +
                ", chieuCao=" + chieuCao +
                ']';
    }
}
