import java.util.LinkedList;

public class AppLink {
    private static void showList(LinkedList<NhanVien> nv) {
    }
    public static void main(String[] args){
        LinkedList<NhanVien> nv = new LinkedList<>();
        NhanVien nv1 = new NhanVien("1a", "Nguyen Van A", "hanoi");
        NhanVien nv2 = new NhanVien("2a", "Nguyen Van B", "bacninh"); 
        NhanVien nv3 = new NhanVien("3a", "Nguyen Van C", "haiphong");
        NhanVien nv4 = new NhanVien("4a", "Nguyen Van D", "Ninhbinh");
        nv.add(nv1);
        nv.add(nv2);
        nv.add(nv3);
        nv.remove(nv3);
        nv.set(3, nv4);
        showList(nv);
     
 }

}
