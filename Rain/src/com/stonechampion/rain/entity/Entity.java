package com.stonechampion.rain.entity;

import java.util.Random;

import com.stonechampion.rain.graphics.Screen;
import com.stonechampion.rain.level.Level;

public abstract class Entity {
	
	public int x, y;
	public boolean removed = false;
	protected Level level;
	public final Random random = new Random();
	
	public void update(){
		
	}
	
	public void render(Screen screen){
		
	}
	
	public void removed(){
		removed = true;
	}
	
	public boolean isRemoved(){
		return removed;
		
	}

}
