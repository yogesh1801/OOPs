import java.util.Scanner; // Why do we need this?

class DictionaryApp {
  // Provides only a main method for instantiating and demonstrating a dictionary
  public static void main(String[] args) {
    int size; // Maximum possible number of elements in the dictionary
    int count; // Current number of elements in the dictionary
    Scanner myScanner = new Scanner(System.in);

    System.out.print("Size of Dictionary: ");
    size = myScanner.nextInt(); // was size=Integer.parseInt(args[0]);

    System.out.print("Count of entries: ");
    count = myScanner.nextInt(); // was count=Integer.parseInt(args[1]);
    // What is the difference between size and count?

    System.out.println("Reading " + count + " elements into a dictionary of size " + size);
    MyDictionary d = new MyDictionary(size); // Create a dictionary of the given size

    for (int i = 0; i < count; i++) { // Insert each element into the dictionary
      double nextValue;
      System.out.print("Enter element: ");
      nextValue = myScanner.nextDouble();
      d.put(new Record((Object)nextValue));
    }
    myScanner.close(); // Is this necessary? What does this do? Can you use this instance Scanner
                       // again?
    // myScanner.close() flushes the buffer of the previous argument
    // yes we can use but need to take care of buffers and use correct methods for desired outputs
    d.show();
    d.get(new Record((Object)(double)1));
    // Wants a record as input , but our input is an integer , hence (Object)integer
    // making it a record new Record(object)
    // make sure to convert it into a double
    d.put(new Record((double)2));
    d.put(new Record((double)2.2458));
    d.getSize();
    d.getLength();
    d.isFull();
    d.remove(new Record((double)2));
    d.show();
  }
}
