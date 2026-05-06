package fr.eql.autom13.chess.rules.pieces;

import fr.eql.autom13.chess.rules.Position;

/**
 * Class mère pour toute les pièces
 * Contient une méthode de vérification du prochain move et une méthode de move.
 */
public class Pieces {

    protected Position piecePosition;
    protected ChessPiece name;

    public Pieces(Position piecePosition) {
        this.piecePosition = piecePosition;
    }

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
        System.out.println(name.getLabel() + " en " + newPosition.row + " / " + newPosition.col);
        piecePosition = newPosition;
    }
}
