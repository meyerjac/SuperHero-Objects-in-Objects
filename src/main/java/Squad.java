import java.util.List;
import java.util.ArrayList;

public class Squad {
  private String mName;
  private int mDedication;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mId;
  private List<Hero> mHeros;

  public Squad(String name, int dedication) {
    mName = name;
    mDedication = dedication;
    instances.add(this);
    mId = instances.size();
    mHeros = new ArrayList<Hero>();
  }

  public String getName() {
    return mName;
  }
  public int getDedication() {
    return mDedication;
  }

  public static List<Squad> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Squad find(int id) {
    return instances.get(id - 1);
  }

  public List<Hero> getHeros() {
    return mHeros;
  }

  public void addHero(Hero hero) {
    mHeros.add(hero);
  }
}
