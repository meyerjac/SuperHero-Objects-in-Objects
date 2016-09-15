import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void Heros_InstantiatesCorrectly_true() {
    Hero myHero = new Hero("superman", 10, 10, 10);
    assertEquals(true
    , myHero instanceof Hero);
  }


}
