package fr.eql.autom13.chess.rules.pieces;

import fr.eql.autom13.chess.rules.Position;

public class Bishop extends Pieces{

    public Bishop(Position piecePosition) {
        super(piecePosition);
        name = ChessPiece.BISHOP;
    }

    @Override
    public boolean checkIfNewMoveIsValid(Position newPosition) {

        if(newPosition.col == piecePosition.col || newPosition.row == piecePosition.row)
        {
            System.out.println("Nin hin, t'a pas le droit de jouer là");
            return false;
        }

        super.move(newPosition);
        return true;
    }
}
