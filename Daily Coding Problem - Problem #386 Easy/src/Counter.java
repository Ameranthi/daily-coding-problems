public class Counter implements Comparable<Counter>{
    int counter = 0;

    public int getCounter(){
      return counter;
    }

    public void addCounter(){
        counter++;
    }

    @Override
    public int compareTo(Counter o) {
        return counter-o.counter;
    }
}

