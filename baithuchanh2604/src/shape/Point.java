package shape;

import java.util.Scanner;
public class Point {
  private float x;  
  private float y;
  public String tenDiem;
  Scanner scanner = new Scanner(System.in);
// x: hoanh do, y : tung do
  public Point() {
  }
  public void setPoint(float x, float y) {

  }
  public Point(String tenDiem, float x, float y ) {
    this.x = x;
    this.y = y;
    this.tenDiem = tenDiem;
  }
  public void setTenDiem(String tenDiem) {
    this.tenDiem = tenDiem;
  }
  public String gettenDiem() {
    return tenDiem;
  }
  public void setX(float x) {
    this.x = x;
  }
  public float getX() {
    return x;
  }
  public void setY(float y) {
    this.y = y;
  }
  public float getY() {
    return y;
  }

  public void nhaptenDiem() {
    System.out.println("Hay nhap ten diem: ");
    tenDiem = scanner.next();
  }
  public void nhapHoanhDo() {
    System.out.println("Hay nhap hoanh do cua diem: " );
    x = scanner.nextFloat();
  }
  public void nhapTungDo() { 
    System.out.println("Hay nhap tung do cua diem: " );
    y = scanner.nextFloat();
  }
  public void inDiem() {
    System.out.println("Toa do diem la:" +gettenDiem() + "(" + getX()+ "," + getY() + ")");
  }
}
