package Assignment5;

class Mammals{

    public void category(){
        System.out.println("I am mammal");
    }

}

class MarineAnimals{
    public void category(){
        System.out.println("I am a marine animal");
    }

}



public class Ques1 {
    public static void main(String[] args) {
        Mammals mammal = new Mammals();
        MarineAnimals marine = new MarineAnimals();
        mammal.category();
        marine.category();
    }

}