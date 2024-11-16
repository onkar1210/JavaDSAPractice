package oops.Inheritance;

public class Model extends BMW{
    public void carIsRunning(){
        System.out.println("Inside Model Class");
    }

    public void modelIsVeryGood(){
        System.out.println("Model is very good");
    }

    public static void main(String args[]){
        Model m = new Model();
        BMW m1 = new Model();
        Car m2 = new Model();

    }

}
