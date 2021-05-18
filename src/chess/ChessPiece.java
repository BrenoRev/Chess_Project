package chess;

import boardgame.Piece;
import boardgame.Board;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;
    private int moveCount;
    
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    
    public boolean isThereAOponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor()!= color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount(){
        return moveCount;
    }
    protected void increaseMoveCount(){
       moveCount++;
    } 
    
    protected void decreseMoveCount(){
       moveCount--;
    } 
     public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }
     

}
