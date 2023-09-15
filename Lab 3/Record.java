class Record extends AbstractRecord {
  // our record class will use our Abstract record hence we need to define all the defined methods in the Abstract Record
  private Object valueObject=0; // Concreting
  public Record(Object val) { // Concreting
    valueObject=val;
  } //  giving value to our valueObject
  public Object key() { // Can you generalize or abstract this further away?
    return (Object)Math.round((double)value()); // An ad-hoc arrangement.
  }

  // key return the key how?
  // value() return value object of type float which is typecast to double and then Math.round rounds this which then again is typecast to an Object
  public Object value() {
    return valueObject;
  }
  public Comparison compare(AbstractRecord another) {
    long k1=(long)key(), k2=(long)(another.key()); // The same ad-hoc arrangement
    boolean b1=(k1<=k2), b2=(k1>=k2); // All this should be evident
    // added brackets for better understanding.

    if(b1 && b2) return Comparison.MATCHING;
    if(b1 && !b2) return Comparison.PREDECESSOR;
    if(!b1 && b2) return Comparison.SUCCESSOR;
    return Comparison.INCOMPARABLE;
  }
  public void show() {
    System.out.print(" [Key: "+key()+"] [Value: "+value()+"] ");
  }
}
