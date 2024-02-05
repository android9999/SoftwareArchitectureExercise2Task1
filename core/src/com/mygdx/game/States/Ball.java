package com.mygdx.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.GdxGame;

public class Ball
{
    public Vector2 position;
    private Vector2 velocity;
    private Vector2 boundary;
    private float x_v;
    private float y_v;
    public Texture img;
    public Ball(Vector2 velocity) {
        img = new Texture("ball.png");
        position = new Vector2(0,0);
        this.velocity = velocity;
        x_v = velocity.x;
        y_v = velocity.y;
        boundary = new Vector2(GdxGame.WIDTH, GdxGame.HEIGHT);
    }
    public void move(float dt)
    {
        float x = position.x;

        if(x < 0)
        {
            velocity.x = -x_v;
        }

        else if(x > boundary.x - img.getWidth())
        {
            velocity.x = x_v;
        }

        float y = position.y;
        if(y < 0)
        {
            velocity.y = -y_v;
        }

        else if(y > boundary.y - img.getHeight())
        {
            velocity.y = y_v;
        }

        position.x += velocity.x* dt;
        position.y += velocity.y* dt;
    }
}
