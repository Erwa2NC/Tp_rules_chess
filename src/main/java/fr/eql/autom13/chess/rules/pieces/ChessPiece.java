package fr.eql.autom13.chess.rules.pieces;

public enum ChessPiece {
    PAWN("pion"),
    BISHOP("fou"),
    KNIGHT("cavalier"),
    ROOK("tour"),
    QUEEN("reine"),
    KING("roi");

    public String getLabel() {
        return label;
    }

    private final String label;

    ChessPiece(String label) {
        this.label = label;
    }

    public static ChessPiece getEnumFromLabel(String label) {
        for (ChessPiece chessPiece : values()) {
            if (chessPiece.label.equalsIgnoreCase(label)) {
                return chessPiece;
            }
        }
        throw new IllegalArgumentException("Pièce inconnue : " + label);
    }
}
