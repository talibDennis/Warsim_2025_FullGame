package warrior; // a package is a folder.

import java.util.Random;

// an abstract class protects the class
// from being directly instantiated!
public abstract class Warrior {
  protected int health;
  protected int strength;
  protected int dexterity;
  protected String warriorType;
  protected Random randNum = new Random(); 
  
  public Warrior() {
  } // constructor

  // Getters
  public int getHealth() {
    return this.health;
  } // getHealth()
  public int getStrength() {
    return this.strength;
  } // getStrength()
  public int getDexterity() {
    return this.dexterity;
  } // getDeterity()
  public String getWarriorType() {
    return this.warriorType;
  } // getWarriorType()
  public boolean isAlive() {
    if(this.health > 0)
      return true;
    else
      return false;
  } // isAlive()

  // Setters 
  public void setHealth(int health) {
    this.health = health;
  } // setHealth()
  public void setStrength(int strength) {
    this.strength = strength;
  } // setStrength()
  public void setDexterity(int dexterity) {
    this.dexterity = dexterity;
  } // setDeterity()
  public void setWarriorType(String warriorType) {
    this.warriorType = warriorType;
  } // setWarriorType()
  public void takeDamage(int damageAmount) {
    if (damageAmount > 0) 
      this.health -= damageAmount;
  } // takeDamage()
} // class