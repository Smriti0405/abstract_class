public abstract class Compartment {
    public abstract void notice();
}
class First_class extends Compartment{
    public void notice(){
        System.out.println("Its first class.");
    }
}
class Ladies extends  Compartment{
    public void notice(){
        System.out.println("Its ladies class.");
    }
}
class Luggage extends Compartment {
    public void notice() {
        System.out.println("Its luggage class.");
    }
}
class General extends Compartment{
    public void notice(){
        System.out.println("Its general class.");
    }
}
class  Test_compartment{
    public static void main(String[] args) {
        Compartment[] arr= new Compartment[10];
        double i = Math.random()*5;
        int x = (int)i;
        System.out.println(x);
        if(x== 0){
            arr[0] = new First_class();
            arr[0].notice();
        }
        else if (x== 1){
            arr[1] = new Ladies();
            arr[1].notice();
        }
        else if (x== 2){
            arr[2] = new Luggage();
            arr[2].notice();
        }
        else if (x== 3){
            arr[3] = new General();
            arr[3].notice();
        }
    }
}
