package fr.eql.autom13.chess.rules.pieces;

import fr.eql.autom13.chess.rules.Position;

public class King extends Pieces{
    public King(Position piecePosition) {
        super(piecePosition);
        name = ChessPiece.KING;
    }

    @Override
    public boolean checkIfNewMoveIsValid(Position newPosition) {

        if(Math.abs(newPosition.row - piecePosition.row) > 1
                || Math.abs(newPosition.col - piecePosition.col) > 1)
        {
            System.out.println("Nin hin, t'a pas le droit de jouer là");
            return false;
        }

        super.move(newPosition);
        return true;
    }
}
