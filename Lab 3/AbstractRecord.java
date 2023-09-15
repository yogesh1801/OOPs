abstract class AbstractRecord {
  abstract public Object key(); //  Object keyword just says keys() is of type Object method (any object)
  abstract public Object value();
  abstract public Comparison compare(AbstractRecord another); // Here compare is an object of type Comparison defined in another class
    // This should return PREDECESSOR if the comparison puts this before another
    //                    MATCHING if neither can be put before the other
    //                    SUCCESSOR if another comes before this
    //                    INCOMPARABLE if none of these could be said definitely
  abstract public void show();
}

// * Other Points

// * Abstract classes can have both abstract and non-abstract(with body) methods
// * gives a skeleton that can be extended by other classes - inheritance.
// * in the above abstract class we will implement all these functions.
