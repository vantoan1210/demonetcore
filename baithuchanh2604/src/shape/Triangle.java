package shape;

public class Triangle extends Point{
  double AB;
  double BC;
  double AC;
  private float xA;
  private float yA;
  private float xB;
  private float yB;
  private float xC;
  private float yC;

  private Point pA = new Point();
  private Point pB = new Point();
  private Point pC = new Point();
  

public void nhapToaDo() {
    System.out.println("Nhap diem thu nhat: ");
    tenDiem= scanner.next();
    System.out.println("Nhap toa do xA: ");
    xA = scanner.nextFloat();
    System.out.println("Nhap toa do yA: ");
    yA = scanner.nextFloat();
    pA.setPoint(xA, yA);
    System.out.println("Nhap diem thu hai: ");
    tenDiem = scanner.next();
    System.out.println("Nhap toa do xB: ");
    xB = scanner.nextFloat();
    System.out.println("Nhap toa do yB: ");
    yB = scanner.nextFloat();
    pB.setPoint(xB, yB);
    System.out.println("Nhap diem thu ba: ");
    tenDiem = scanner.next();
    System.out.println("Nhap toa do xC: ");
    xC = scanner.nextFloat();
    System.out.println("Nhap toa do yC: ");
    yC = scanner.nextFloat();
    pC.setPoint(xC, yC);
}
public void inToaDo() {
    System.out.println(" toa do thu nhat la: " +tenDiem  +"(" + xA + "," + yA + ")"); 
    System.out.println(" toa do thu hai la: " +tenDiem +"(" + xB + "," + yB + ")");
    System.out.println(" toa do thu ba la: " +tenDiem +"(" + xC + "," + yC + ")");
}

public void tinhDoDai() {
  AB =  Math.sqrt(Math.pow((xB-xA), 2) + Math.pow((yB-yA), 2));
  System.out.println("Do dai AB la : " +AB);
  BC =  Math.sqrt(Math.pow((xC-xB), 2) + Math.pow((yC-yB), 2));
  System.out.println("Do dai BC la: " +BC);
  AC =  Math.sqrt(Math.pow((xC-xA), 2) + Math.pow((yC-yA), 2));
  System.out.println("Do dai Ac la : " +AC);

  if ((AB + BC > AC) && (AB + AC > BC) && (BC + AC > AB) &&
    (AB > 0) && (BC > 0) && (AC > 0)) {
      if ((AB == BC) && (BC == AC)) {
      System.out.println("Tam giac deu!");
    } else if ((AB == BC) || (AB == AC) || (BC == AC)) {
      System.out.println("Tam giac can!");
      } else if ((AB * AB == BC * BC + AC * AC) ||
        (BC * BC == AB * AB + AC * AC) ||
        (AC * AC == AB * AB + BC * BC)) {
          System.out.println("Tam giac vuong!");
  } else if (((AB * AB + BC * BC == AC * AC) && (AB == BC)) ||
    ((AB * AB + AC * AC == BC * BC) && (AB == AC)) ||
    ((BC * BC + AC * AC == AB * AB) && (BC == AC))) {
        System.out.println("Tam giac vuong can!");
    } else {
        System.out.println("Tam giac thuong!");
    }
  } else {
    System.out.println("3 canh cua tam giac khong thoa man dieu kien lap thanh tam giac!");
    }
 }
}


