package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.States.GameState;
import com.mygdx.game.States.GameStateManager;


public class GdxGame extends ApplicationAdapter {
	// screen of my phone
	public static final int WIDTH = 1440;
	public static final int HEIGHT = 720;
	public static final String TITLE = "Exercise 1 - Technology Introduction"; // title
	private GameStateManager gsm; //very important class
	SpriteBatch batch;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		gsm = new GameStateManager();
		ScreenUtils.clear(1, 0, 0, 1);
		gsm.push(new GameState(gsm));
	}

	@Override
	public void render () {
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
