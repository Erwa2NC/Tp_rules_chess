package fr.eql.autom13.chess.rules;

import fr.eql.autom13.chess.rules.pieces.ChessPiece;
import fr.eql.autom13.chess.rules.pieces.Pieces;

public class Test {
    static void main() {
        Pieces pieces = new Pieces(ChessPiece.BISHOP);
        int[][] position = {{2}, {5}};
        pieces.move(position);
    }
}
