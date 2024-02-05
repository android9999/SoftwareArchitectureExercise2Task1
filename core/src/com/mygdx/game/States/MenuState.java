package com.mygdx.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuState extends State
{

    private Texture background;
    private Texture button;
    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("background.png");
        button = new Texture("button.png");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched())
        {
            //gsm.set(new PlayState(gsm));


        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {

    }

    @Override
    public void dispose()
    {
        button.dispose();
        background.dispose();
    }
}