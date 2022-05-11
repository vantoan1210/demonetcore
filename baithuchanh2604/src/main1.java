import shape.Triangle;
import shape.Point;
import shape.Quadrilateral;
public class main1 {
    public static void main(String[] args) throws Exception {
        
        Point p = new Point();
        p.nhaptenDiem();
        p.nhapHoanhDo();
        p.nhapTungDo();
        p.inDiem();
        Triangle A = new Triangle();
        Triangle B = new Triangle();
        Triangle C = new Triangle();
        A.nhapToaDo();
        A.inToaDo();
        A.tinhDoDai();

        B.nhapToaDo();
        B.inToaDo();
        B.tinhDoDai();

        C.nhapToaDo();
        C.inToaDo();
        C.tinhDoDai();

        Quadrilateral q = new Quadrilateral();
        q.nhapToaDo();
        q.dodaiCanh();
        q.kiemTraTuGiac();
        q.kiemTraLoaiTuGiac();
    }
}