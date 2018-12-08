import java.awt.*;

public class Food extends Entity{

    private Rectangle food;
    private Grid grid;


    public Food(Tile tile, Grid grid){
        super("Food");
        this.grid = grid;
        food = new Rectangle(tile.getLocation().getColumn() * 20 + 8, tile.getLocation().getRow() * 20 + 8, 4, 4);
    }

    public void eat(){
        grid.removeFood(this);
    }

    @Override
    public Location getLocation() {
        return null;
    }

    @Override
    public void move() {

    }

    @Override
    public void setDirection(Direction direction) {

    }

    @Override
    public Direction getDirection() {
        return null;
    }

    public Shape getShape(){
        return food;
    }

}
