package screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.barrrtwo.ruok.FirstAidMain;

import stages.MainStage;

/**
 * Created by Joshu on 10/22/2016.
 */
public class MainScreen implements Screen {
    public static final float CAMERA_WIDTH = 188 * 5, CAMERA_HEIGHT = 128 * 5;
    FirstAidMain main;
    MainStage stage;
    public MainScreen(FirstAidMain mainI) {
        main = mainI;
        stage = new MainStage(new ExtendViewport(CAMERA_WIDTH, CAMERA_HEIGHT));

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
