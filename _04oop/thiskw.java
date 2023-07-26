class organism{
    int legs;
    int hands;

    public void setLegs(int legs){
        this.legs=legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setHands(int hands){
       // hands = hands;
        this.hands = hands;
    }

    public int getHands(){
        return hands;
    }
}
public class thiskw {
    public static void main(String[] args) {
        organism human = new organism();
        human.setHands(2);
        human.setLegs(2);
        System.out.println("legs: " + human.getLegs() + " hands: " + human.getHands());
    }
}
