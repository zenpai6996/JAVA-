class ekclass{
    int a ;
    public int getA(){
        return a;
    }
    ekclass(int v){
        this.a=v;
    }
    public int returnoone(){
        return 1;

    }
}


public class thissuper {
    public static void main(String[] args) {
        ekclass e = new ekclass(5);
        System.out.println(e.getA());
    }
    
}
