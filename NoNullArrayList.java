import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    ArrayList<T> s = new ArrayList<T>();
  }

  public NoNullArrayList(int initialCapacity){
    ArrayList<T> s = new ArrayList<T>(initialCapacity);
  }

  public T set(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("Not supposed to be null there");
    }
    T store = super.get(index);
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
