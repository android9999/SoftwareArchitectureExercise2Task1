package com.mygdx.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.GdxGame;

public class GameState extends State
{
    private Ball ball;
    private Texture bg;
    public GameState(GameStateManager gsm) {
        super(gsm);
        ball = new Ball(new Vector2(-335, -640));
        bg = new Texture("background.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        ball.move(Gdx.graphics.getDeltaTime());
    }

    @Override
    public void render(SpriteBatch sb){
        sb.begin();
        sb.draw(bg, 0, 0, GdxGame.WIDTH, GdxGame.HEIGHT);
        sb.draw(ball.img, ball.position.x, ball.position.y, 8, 8);
        sb.end();
    }
    @Override
    public void dispose()
    {
        bg.dispose();
    }
}
