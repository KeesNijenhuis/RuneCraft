package nl.nijenhuis.runecraft.level;

import org.lwjgl.Sys;

import nl.nijenhuis.runecraft.blocks.BlockOre;
import nl.nijenhuis.runecraft.init.RCBlocks;

public class LevelSystem {
	
	private static final int XP_1 = 30;
	
	private static final int SKILL_MINING = 1;
	
	private static int currentXp;
	public static int levelMining = 1;
	
	public LevelSystem(int skill, int level) {
		levelUp(skill, level);
		this.levelMining = level;
	}
	
	public int addExperience(int skill, BlockOre block) {
		if(skill == SKILL_MINING) {
			if(block == RCBlocks.copperore) {
				System.out.println("ADDED XP: " + (XP_1 / 2));
				return XP_1 / 2;
			}
		}
		return 0;
	}
	
	private boolean levelUp(int skill, int level) {
		if(skill == SKILL_MINING) {
			if(level == 1) {
				if(hasEnoughXp(level, currentXp)) {
					levelMining++;
					System.out.println("MINING LEVEL: " + levelMining);
				return true;
				}
			}
			if(level == 2) {
				if(hasEnoughXp(level, currentXp)) {
					levelMining++;
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean hasEnoughXp(int level, int currentXp) {
		if(level == 1 && currentXp == XP_1) {
			System.out.println("CURRENT XP(IN HASENOUGEXP METHOD)" + currentXp);
			return true;
		} else
			return false;
	}
	
	public static int getMiningLevel() {
		return levelMining;
	}
	
	public static int getCurrentXp() {
		return currentXp;
	}

}
