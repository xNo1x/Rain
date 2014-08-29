package com.philipp.rain.level.tile;

import com.philipp.rain.grahpics.Screen;
import com.philipp.rain.grahpics.Sprite;

public class GrassTile extends Tile {

	public GrassTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
}
