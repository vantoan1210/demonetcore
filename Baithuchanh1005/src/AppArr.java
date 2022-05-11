import java.util.ArrayList;
public class AppArr{
    private static void showList(ArrayList<NhanVien> nv) {
    }
    public static void main(String[] args){
       ArrayList<NhanVien> nv = new ArrayList<>();
       NhanVien nv1 = new NhanVien("1a", "Nguyen Van A", "Hanoi");
       NhanVien nv2 = new NhanVien("2a", "Nguyen Van B", "HCM"); 
       NhanVien nv3 = new NhanVien("3a", "Nguyen Van C", "Danang");
       NhanVien nv4 = new NhanVien("4a", "Nguyen Van D", "Ninhbinh");
       nv.add(nv1);
       nv.add(nv2);
       nv.add(nv3);
       nv.remove(nv3);
       nv.set(3, nv4);
       showList(nv);

}
 
}