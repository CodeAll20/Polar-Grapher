import java.util.*;
import apcslib.*;

public interface Function
{
  public double getValue(double theta);
  public void draw (double angleFrom, int angleTo);
  public String toString();
}
