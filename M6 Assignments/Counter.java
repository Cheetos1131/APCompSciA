public class Counter
{
  private int myN;

  public Counter(int n)
  {
    myN = n;
  }

  public Counter nextCounter()
  {
    return new Counter(myN + 1);
  }

  public int getN()
  {
    return myN; 
  }
}