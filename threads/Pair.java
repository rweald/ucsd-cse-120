package nachos.threads;

/**
 * class Pair
 * 
 * @author Ryan Weald
 *
 * Hold a pair of heterogenous objects.
 * Head is the first item in the pair and tail is the 
 * second item in the pair
 */
public class Pair<L,R>{
  private L head;
  private R tail;

  public Pair(L head, R tail){
    this.head = head;
    this.tail = tail;
  }

  public L getHead() {
    return this.head;
  }

  public R getTail() {
    return this.tail;
  }

}
