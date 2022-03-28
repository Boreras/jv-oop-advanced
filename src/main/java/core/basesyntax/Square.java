package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double areaCount(int side) {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + areaCount(getSide()) + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
