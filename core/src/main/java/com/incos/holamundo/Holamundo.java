package com.incos.holamundo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Holamundo extends ApplicationAdapter {
    private SpriteBatch lapiz;
    private Texture miImagen;
    private BitmapFont mitexto;

    @Override
    public void create() {
        lapiz = new SpriteBatch();
        miImagen = new Texture("messi.png");
        mitexto = new BitmapFont();

    }

    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0, 1);
        lapiz.begin();
        lapiz.draw(miImagen, 140, 210, 350,350);
        mitexto.draw(lapiz,"messi,cabra gob", 50, 200);
        lapiz.end();
    }

    @Override
    public void dispose() {
        lapiz.dispose();
        miImagen.dispose();
        mitexto.dispose();
    }
}
