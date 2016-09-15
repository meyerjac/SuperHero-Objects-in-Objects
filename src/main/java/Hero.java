import java.util.*;

public class Hero{
  private String mName;
  private int mAge;
  private int mSuperPower;
  private int mWeakness;
  private static ArrayList<Hero> instances = new ArrayList<Hero>();
  private int mId;

public Hero(String name, int age, int superPower, int weakness) {
  mName = name;
  mAge = age;
  mSuperPower = superPower;
  mWeakness = weakness;
  instances.add(this);
  mId = instances.size();
  }
  public String getName(){
    return mName;
  }
  public int getAge(){
    return mAge;
  }
  public int getSuperPower(){
    return mSuperPower;
  }
  public int getWeakness(){
    return mWeakness;
  }
  public static ArrayList<Hero> all () {
    return instances;
  }
  public static void clear() {
    instances.clear();
  }
  public int getId() {
    return mId;
  }
  public static Hero find(int id) {
    return instances.get(id-1);
  }
}
