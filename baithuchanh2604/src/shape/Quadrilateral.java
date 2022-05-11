package shape;
import java.util.Scanner;
public class Quadrilateral  {
    
  private Point pA = new Point();
  private Point pB = new Point();
  private Point pC = new Point();
  private Point pD = new Point();
  private int vuong;
  private float xA;
  private float yA;
  private float xB;
  private float yB;
  private float xC;
  private float yC;
  private float xD;
  private float yD;
  private float AB, BC, CD, DA, AC, BD;

  public void nhapToaDo() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap diem thu nhat: ");
    
    System.out.println("Nhap toa do xA: ");
    xA = scanner.nextFloat();
    System.out.println("Nhap toa do yA: ");
    yA = scanner.nextFloat();
    pA.setPoint(xA, yA);
    System.out.println("Nhap diem thu hai: ");
    
    System.out.println("Nhap toa do xB: ");
    xB = scanner.nextFloat();
    System.out.println("Nhap toa do yB: ");
    yB = scanner.nextFloat();
    pB.setPoint(xB, yB);
    System.out.println("Nhap diem thu ba: ");
    System.out.println("Nhap toa do xC: ");
    xC = scanner.nextFloat();
    System.out.println("Nhap toa do yC: ");
    yC = scanner.nextFloat();
    pC.setPoint(xC, yC);
    System.out.println("Nhap diem thu tu: ");
    System.out.println("Nhap toa do xD: ");
    xC = scanner.nextFloat();
    System.out.println("Nhap toa do yD: ");
    yD = scanner.nextFloat();
    pD.setPoint(xD, yD);
    scanner.close();}
    

  public void dodaiCanh() {
    AB =  (float) Math.sqrt(Math.pow((xB-xA), 2) + Math.pow((yB-yA), 2));
    System.out.println("Do dai AB la : " +AB);
    BC =  (float) Math.sqrt(Math.pow((xC-xB), 2) + Math.pow((yC-yB), 2));
    System.out.println("Do dai BC la: " +BC);
    CD =  (float) Math.sqrt(Math.pow((xC-xD), 2) + Math.pow((yC-yD), 2));
    System.out.println("Do dai AC la : " +CD);
    DA =  (float) Math.sqrt(Math.pow((xA-xD), 2) + Math.pow((yA-yD), 2));
    System.out.println("Do dai AD la : " +DA);
    AC = (float)Math.sqrt(Math.pow(xA-xC, 2)+Math.pow(yA-yC, 2));
    BD = (float)Math.sqrt(Math.pow(xB-xD, 2)+Math.pow(yB-yD, 2));
  }
  public Boolean kiemTraTuGiac(){
    if(AB + BC == AC || BC + CD == BD || CD + DA == AC || AB + DA == BD)
      return false;
    else return true;
}
public String kiemTraLoaiTuGiac(){
    vuong = 0;
    if(kiemTraTuGiac() == true){
        //Kiem tra goc vuong
    if(Math.pow(AB,2)+Math.pow(BC, 2) == Math.pow(AC, 2))
    vuong++;
    if(Math.pow(BC,2)+Math.pow(CD, 2) == Math.pow(BD, 2))
    vuong++;
    if(Math.pow(CD,2)+Math.pow(DA, 2) == Math.pow(AC, 2))
    vuong++;
    if(Math.pow(AB,2)+Math.pow(DA, 2) == Math.pow(BD, 2))
    vuong++;

    if(AB == BC && CD == DA && BC == CD){
        if(vuong >= 1)
            System.out.println("Hinh vuong.");
        else
            System.out.println( "thoi.");
    } else if(AB == CD || BC == DA){
        if(vuong >= 1)
           System.out.println( "Hinh chu nhat.");
        else
            System.out.println( "Hinh binh hanh.");
    } 
    return "Tu giac thuong";
        } else
            return "Khong phai la tu giac";
}
}