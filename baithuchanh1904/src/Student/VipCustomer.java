package Student;

public class VipCustomer extends Person{

  private int Discount;

  public VipCustomer() {}
  public VipCustomer( int Discount) {
      this.Discount = Discount;
  }
  public void hienThiThongTin() {
      System.out.println("\nDiscount: " + Discount);
  } 
}