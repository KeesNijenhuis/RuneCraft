package nl.nijenhuis.runecraft.level;

public class SkillMining extends Skill{
	
	public static int currentXp = 1;
	public  int addedXp;
	public static int currentLevel;
	public int maxLevel = 99;
	public static double experienceNeeded;
	private int MAX_EXPERIENCE = 200000000;

	public SkillMining(String skill) {
		super("mining");
	}
	
	/**
	 * 
	 * @return returns the string of the skill ed. Mining
	 */
	public String getSkillName() {
		return "mining";
	}
	/**
	 * Calculates how much exp is needed to advance to the next level with this formula:
	 * exp = 85 + (12 * current level) ^ 1.4
	 */
	public void calcMiningExpNeeded() {
		if(!isMaxLevelMining()) {
		experienceNeeded =  Math.pow((85 + (12 * this.getCurrentMiningLevel())), 1.4);
		//System.out.println(experienceNeeded);
		} else if(isMaxLevelMining()) {
			experienceNeeded = MAX_EXPERIENCE;
		}
	}
	/**
	 * if the player has enough exp to level up and is not yet level 99
	 * the level will be incremented by one and the current exp reset to 0
	 */
	public void levelUpMining() {
		if(hasEnoughMiningExp() && !isMaxLevelMining()) {
			setCurrentMiningLevel(currentLevel + 1);
			setCurrentMiningXp(0);
			//System.out.println("LEVEL UP METHOD HAS RUN: " + getCurrentLevel() + " : " + getCurrentXp());
		}
	}
	/**
	 * returns true if the player has 200 million exp in a skill
	 * @return true if player has 200mill
	 */
	public boolean hasMaxXpMining() {
		if(this.getCurrentMiningXp() == MAX_EXPERIENCE) {
			return true;
		}
		return false;
	}
	/**
	 * converts the integer of the current level to a string
	 * @return string of the current level
	 */
	public String miningLevelToString() {
		return Integer.valueOf(getCurrentMiningLevel()).toString();
	}
	/**
	 * converts the integer of the current amount of exp to a string
	 * @return string of the current amount of exp
	 */
	public String miningExpToString() {
		return Integer.valueOf(getCurrentMiningXp()).toString();
	}
	/**
	 * converts the integer of the needed amount of exp to a string
	 * @return string of the needed amount of exp
	 */
	public String miningExpNeededToString() {
		return Integer.valueOf(getMiningXpNeededForLevel()).toString();
	}

	/**
	 * checks if the player has reached the max level or not
	 * @return true if the player has given skill at 99
	 */
	public boolean isMaxLevelMining() {
		if(this.getCurrentMiningLevel() == this.getMaxMiningLevel()) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @return true if the current xp is greater than or equal to the experience needed
	 */
	public boolean hasEnoughMiningExp() {
		if(this.getCurrentMiningXp() >= this.getMiningExperienceNeeded()) {
			return true;
		} else
		return false;
	}

	/**
	 * gets the current amount of exp
	 * @return currentXp
	 */
	public int getCurrentMiningXp() {
		return currentXp;
	}
	/**
	 * sets the current experience points.
	 * @param currentXp
	 */
	public void setCurrentMiningXp(int currentXp) {
		SkillMining.currentXp = currentXp;
	}
	/**
	 * 
	 * @return addedXp
	 */
	public int getAddedMiningXp() {
		return addedXp;
	}
	/**
	 * sets an integer for the added exp
	 * @param addedXp
	 */
	public void setAddedMiningXp(int addedXp) {
		this.addedXp = addedXp;
	}
	/**
	 * fetches the current level in a skill
	 * @return the current level
	 */
	public int getCurrentMiningLevel() {
		return currentLevel;
	}
	/**
	 * sets the level for a skill
	 * @param currentLevel
	 */
	public void setCurrentMiningLevel(int currentLevel) {
		SkillMining.currentLevel = currentLevel;
	}
	/**
	 * 
	 * @return the max level for a skill
	 */
	public int getMaxMiningLevel() {
		return maxLevel;
	}
	/**
	 * 
	 * @return the amount of experience needed to advance a level
	 */
	public double getMiningExperienceNeeded() {
		return experienceNeeded;
	}
	/**
	 * sets the amount of experience needed to advance a level
	 * @param experienceNeeded
	 */
	public void setMiningExperienceNeeded(double experienceNeeded) {
		SkillMining.experienceNeeded = experienceNeeded;
	}
	/**
	 * 
	 * @return the amount of experience the player needs to advance a level
	 */
	public int getMiningXpNeededForLevel() {
		return (int) (experienceNeeded - currentXp); 
	}
	
}
