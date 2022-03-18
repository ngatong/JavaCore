package vehicle;

public class Vehicle {
    private int dungTich;
    private float giaTriXe;

    public Vehicle() {

    }

    public Vehicle(int dungTich, float giaTriXe) {
        this.dungTich = dungTich;
        this.giaTriXe = giaTriXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
  public float getGiaTriXe(){
        return giaTriXe;
  }
  public void setGiaTriXe(float giaTriXe){
        this.giaTriXe=giaTriXe;
  }
  double mucThue(){
        if(dungTich<100)
            return giaTriXe*0.01;
        if(dungTich>=100 && dungTich<=200)
            return giaTriXe*0.03;
        else
            return giaTriXe*0.05;
  }

}
