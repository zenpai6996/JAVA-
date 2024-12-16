

class Base { 
    int X ;
    public int getX(){
        return X;
    }
    public void setX(int X){
        this.X=X;

    } 
    
    public void printMe(){
        System.out.println("I am a constructor ");
    }
}
class derived extends Base {
    int Y;

    public int getY(){
        return Y;

    }
    public void setY(int Y){
        this.Y=Y;

    }
}


public class inheritance {
    public static void main(String[] args) {
       
      //creating an object of base class 
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
      
       //creating an object of derived class  
        derived d = new derived();
        d.setX(43);
        System.out.println(d.getX());

    }
    
}
