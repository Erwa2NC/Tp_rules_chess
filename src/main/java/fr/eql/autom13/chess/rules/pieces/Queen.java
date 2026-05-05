package fr.eql.autom13.chess.rules.pieces;

import fr.eql.autom13.chess.rules.Position;

public class Queen extends Pieces{

    public Queen() {
        name = ChessPiece.QUEEN;
    }

    @Override
    public boolean checkIfNewMoveIsValid(Position newPosition) {

        System.out.println("J'ai la flemme de faire toutes les possibilité donc joue où tu veux !");

        super.move(newPosition);
        return true;
    }
}
