package fr.eql.autom13.chess.rules.pieces;

import fr.eql.autom13.chess.rules.Position;

public class Knight extends Pieces{

    public Knight() {
        name = ChessPiece.KING;
    }

    @Override
    public boolean checkIfNewMoveIsValid(Position newPosition) {

        int rowDiff = Math.abs(newPosition.row - piecePosition.row);
        int colDiff = Math.abs(newPosition.col - piecePosition.col);

        boolean isLMove = (rowDiff == 2 && colDiff == 1) ||
                        (rowDiff == 1 && colDiff == 2);

        if (!isLMove) {
            System.out.println("Nin hin, t'a pas le droit de jouer là");
            return false;
        }

        super.move(newPosition);
        return true;
    }
}
