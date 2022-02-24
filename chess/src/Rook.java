public class Rook extends Piece{
    public Rook(boolean white,String position){
        super(white,position);
    }

    @Override
    public String toString() {
        if(isWhite()) return "white;"+getPosition();
        return "black;"+getPosition();
    }
}
