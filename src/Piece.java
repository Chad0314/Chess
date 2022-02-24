public class Piece {
    private static boolean white;//true=white,false=black
    private static String position;

    public Piece(boolean white, String position) {
        this.white=white;
        this.position=position;
    }

    public static boolean isWhite(){
        return white;
    }
    public static String getPosition() {
        return position;
    }
}
