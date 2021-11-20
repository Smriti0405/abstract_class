public abstract class Instrument {
    public abstract void play();
}
class Piano extends Instrument{
    public void play(){
        System.out.println("Piano is playing  tan tan tan tan");
    }
}
class Flute extends Instrument{
    public void play(){
        System.out.println("Flute is playing  toot toot toot toot");
    }
}
class Guitar extends Instrument{
    public void play(){
        System.out.println("Guitar is playing  tin  tin  tin");
    }
}
class TestInstrument{
    public static void main(String[] args) {
        Instrument[] arr = new Instrument[10];
        for (int i=0; i<10; i++) {
            double a = Math.random() * 4;
            int x = (int)a;
            if (x == 1)
                arr[i] =new Flute();
            else if (x == 2)
                arr[i] = new Guitar();
            else if(x == 3)
                arr[i] = new Piano();
        }
        for (int j=0; j<10; j++){
            if (arr[j] instanceof Flute){
                arr[j].play();
                System.out.println(j);
            }
            else if (arr[j] instanceof Guitar){
                arr[j].play();
                System.out.println(j);
            }
            else if (arr[j] instanceof Piano){
                arr[j].play();
                System.out.println(j);
            }

        }
    }
}

