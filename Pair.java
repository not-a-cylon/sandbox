import java.util.List;

public class Pair<G1 extends List,G2>{
    public G1 first;
    public G2 second;

    public Pair(G1 first,G2 second){
        this.first = first;
        this.second = second;
    }

    public G1 getFirst(){ return first;}
    public G2 getSecond(){ return second;}
}