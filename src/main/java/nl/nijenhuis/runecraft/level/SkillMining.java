package nl.nijenhuis.runecraft.level;

public class SkillMining {
	
	public static int currentXp;
	public  int addedXp;
	public static int currentLevel;
	public int maxLevel = 99;
	public static double experienceNeeded;
	
	public SkillMining() {
		
	}
	
	public void calcExpNeeded() {
		if(!isMaxLevel()) {
		experienceNeeded =  Math.pow((85 + (12 * this.getCurrentLevel())), 1.4);
		System.out.println(experienceNeeded);
		} else if(isMaxLevel()) {
			experienceNeeded = 200000000;
		}
	}
	
	public void levelUp() {
		if(hasEnoughExp() && !isMaxLevel()) {
			setCurrentLevel(currentLevel + 1);
			setCurrentXp(0);
			System.out.println("LEVEL UP METHOD HAS RUN: " + getCurrentLevel() + " : " + getCurrentXp());
		}
	}
	
	public boolean isMaxLevel() {
		if(this.getCurrentLevel() == this.getMaxLevel()) {
			return true;
		}
		return false;
	}
	
	public boolean hasEnoughExp() {
		if(this.getCurrentXp() >= this.getExperienceNeeded()) {
			return true;
		} else
		return false;
	}
	
	
	
	public int getCurrentXp() {
		return currentXp;
	}
	public static void setCurrentXp(int currentXp) {
		SkillMining.currentXp = currentXp;
	}
	public int getAddedXp() {
		return addedXp;
	}
	public void setAddedXp(int addedXp) {
		this.addedXp = addedXp;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public static void setCurrentLevel(int currentLevel) {
		SkillMining.currentLevel = currentLevel;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public double getExperienceNeeded() {
		return experienceNeeded;
	}

	public static void setExperienceNeeded(double experienceNeeded) {
		SkillMining.experienceNeeded = experienceNeeded;
	}

	public int getXpNeededForLevel() {
		return (int) (SkillMining.experienceNeeded - SkillMining.currentXp); 
	}
	
	
	
	
	
	
}
