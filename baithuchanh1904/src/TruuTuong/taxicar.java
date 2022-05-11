package TruuTuong;

public class taxicar implements car{
    public void move(){
        System.out.println("Toc do : 50-70 km ");
    }
    public void stop(){
        System.out.println("Dừng lại khi hết xăng hoặc hỏng! ");
    }
    public void turnleft(){
        System.out.println("Quay cần sang trái để rẽ trái : ");
    }
    public void turnright(){
        System.out.println("Quay cần sang phải để rẽ phải : ");
    }
    public void reverse(){
        System.out.println("Đảo ngược:?? ");
    }

}