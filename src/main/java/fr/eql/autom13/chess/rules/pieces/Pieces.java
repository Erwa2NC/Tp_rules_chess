package fr.eql.autom13.chess.rules.pieces;

import fr.eql.autom13.chess.rules.Position;

import java.util.Arrays;

public class Pieces {

    protected Position piecePosition;
    protected ChessPiece name;

    public Position getPiecePosition() {
        return piecePosition;
    }

    public ChessPiece getName() {
        return name;
    }

    public boolean checkIfNewMoveIsValid(Position newPosition)
    {
        if(newPosition.col == piecePosition.col && newPosition.row == newPosition.col){
            System.out.println("Pièce non déplacée. Veuillez sélectionné une case valide.");
            return false;
        }

        return true;
    }

    public void move(Position newPosition)
    {
        System.out.println(name.getLabel() + " en " + newPosition.col + " / " + newPosition.row);
        piecePosition = newPosition;
    }
}
