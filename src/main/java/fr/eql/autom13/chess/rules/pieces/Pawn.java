package fr.eql.autom13.chess.rules.pieces;

import fr.eql.autom13.chess.rules.Position;

import javax.swing.JPanel;

/**
 * Can move forward for one case. 2 if it's the first move of the pawn
 */
public class Pawn extends Pieces{

    public Pawn() {
        name = ChessPiece.PAWN;
    }

    @Override
    public boolean checkIfNewMoveIsValid(Position newPosition) {

        if(newPosition.col != piecePosition.col || Math.abs(newPosition.row - piecePosition.row) > 1)
        {
            System.out.println("Nin hin, t'a pas le droit de jouer là");
            return false;
        }

        super.move(newPosition);
        return true;
    }
}
