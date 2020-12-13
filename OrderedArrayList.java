import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  private NoNullArrayList<T> ar;

  public OrderedArrayList(){
    ar = new NoNullArrayList<T>();
  }

  public OrderedArrayList(int starting){
    ar = new NoNullArrayList<T>(starting);
  }

  public boolean add(T element){
    if(ar.size() == 0){
      return super.add(element);
    }
    if(ar.size() == 1){
      if(ar.get(0).compareTo(element) >= 0){
        return super.add(element);
      }
      else{
        super.add(0, element);
        return true;
      }
    }
    for(int i = 0; i < ar.size()-1; i++){
      if(ar.get(i+1).compareTo(element) > 0 && ar.get(i).compareTo(element) <= 0){
        super.add(i, element);
        return true;
      }
      super.add(element);
    }
    return false;
  }
}
