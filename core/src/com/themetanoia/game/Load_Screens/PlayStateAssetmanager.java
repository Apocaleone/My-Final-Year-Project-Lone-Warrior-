package com.themetanoia.game.Load_Screens;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;

/**
 * Created by MITHUN on 01-11-2016.
 */
public class PlayStateAssetmanager {
    public AssetManager manager=new AssetManager();

    public PlayStateAssetmanager() {
    }

    public void load(){
        manager.load("ButtonAtlas.pack", TextureAtlas.class);
        manager.load("MenuButtons.pack", TextureAtlas.class);
        manager.load("berserker.pack", TextureAtlas.class);
        manager.load("Warrior.pack",TextureAtlas.class);
        manager.load("Spearman.pack",TextureAtlas.class);
        manager.load("Enemies.pack",TextureAtlas.class);
        manager.load("Levels/Levels.pack",TextureAtlas.class);
        manager.load("Music/Bgmusic.ogg", Music.class);
    }

    public void dispose(){
        manager.dispose();
    }
}
