package edu.cnm.deepdive.cards.model;

public enum Suit {

  CLUBS,
  DIAMONDS {
    @Override
    public Color getColor() {
      return Color.RED;
    }
  },
  HEARTS {
    @Override
    public Color getColor() {
      return Color.RED;
    }
  },
  SPADES;

  private static final char[] symbol = {'\u2663', '\u2662', '\u2661', '\u2660'};

  public char getSymbol() {
    return symbol[ordinal()];
  }

  public Color getColor() {
    return Color.BLACK;
  }

  public enum Color {
    BLACK, RED
  }

}
