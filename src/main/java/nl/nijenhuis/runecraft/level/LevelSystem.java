package nl.nijenhuis.runecraft.level;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class LevelSystem {
	
	public int amountXp;
	public String skill;
	
	public int levelMining = 1;
	public int maxLevel = 99;
	
	World world;
	BlockPos pos;
	EntityPlayer player;
	
	private int EXP_NEEDED = 30;
	private int MULTIPLIER = 3;
	
	public void levelSystem(World world, int exp, Block block, String skill, BlockPos pos) {
		this.amountXp = this.amountXp + exp;
		this.skill = skill;
		this.world =  world;
		this.pos = pos;
		
		if(amountXp >= EXP_NEEDED + MULTIPLIER * levelMining) {
			levelUp(skill, levelMining);
			
			amountXp = 0;
		}
		
	}
	
	public void levelUp(String skill, int level) {
		if(skill == "mining") {
			if(amountXp == 30) {
				levelMining = levelMining + 1;
				System.out.println("MINING LEVEL:" + levelMining);
			}
		}
	}
	
	public int getMiningLevel() {
		return levelMining;
	}
	
	public int setMiningLevel() {
		return levelMining;
		
	}

}
