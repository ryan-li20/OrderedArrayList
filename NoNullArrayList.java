import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{
  private ArrayList<T> s;

  public NoNullArrayList(){
    s = new ArrayList<T>();
  }

  public NoNullArrayList(int initialCapacity){
    s = new ArrayList<T>(initialCapacity);
  }

  public T set(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("Not supposed to be null there");
    }
    T store = element;
    super.set(index, element);
    return store;
  }

  public boolean add(T element){
    if(element != null){
      super.add(element);
      return true;
    }
    else{
      throw new IllegalArgumentException("Added element cannot be null");
    }
  }

  public void add(int index, T element){
    if(element != null){
      super.add(index, element);
    }
    else{
      throw new IllegalArgumentException("Added element cannot be null");
    }
  }
}
