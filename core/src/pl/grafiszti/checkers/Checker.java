package pl.grafiszti.checkers;

import com.badlogic.gdx.graphics.Texture;

public class Checker {
    Texture texture;
    int x, y;

    public Checker(CheckerType type, int x, int y) {
        this.texture = new Texture(type.equals(CheckerType.BLACK) ? "black_player.png" : "white_player.png");
        this.x = x;
        this.y = y;
    }

    public void render(CustomSpriteBatch batch) {
        batch.draw(this.texture, x * Constants.TILE_SIZE, y * Constants.TILE_SIZE);
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}
