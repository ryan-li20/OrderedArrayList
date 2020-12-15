import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  private NoNullArrayList<T> ar;

  public OrderedArrayList(){
    NoNullArrayList<T> ar = new NoNullArrayList<T>();
  }

  public OrderedArrayList(int starting){
    NoNullArrayList<T> ar = new NoNullArrayList<T>(starting);
  }


  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException("not allowed >:(");
    }
    if(super.size() == 0){
      super.add(element);
      System.out.println("no fukcing way");
      return true;
    }


    if(super.size() == 1){
      if(element.compareTo(super.get(0)) >= 0){
        super.add(element);
        System.out.println("monkey");
        System.out.println(element);
        return true;
      }
      else{
        super.add(0, element);
        System.out.println("fucking everyhting");
        return true;
      }
    }


    if(super.size() > 1){

      if(element.compareTo(super.get(0)) <= 0){
        super.add(0, element);
        System.out.println("Smallest");
        return true;
      }
      if(element.compareTo(super.get(super.size()-1)) >= 0){
        super.add(element);
        System.out.println("Biggest");
        return true;
      }
      for(int i = 0; i < super.size()-1; i++){
        T here = super.get(i);
        T next = super.get(i+1);
        if(element.compareTo(here) > 0 && element.compareTo(next) <= 0){
          super.add(i+1, element);
          i++;
          System.out.println("Middling");
          return true;
        }

      }
    }

    return false;
  }

  public void add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("null not allowed >:(");
    }
    if(super.size() == 0){
      super.add(element);
      return;
    }


    if(super.size() == 1){
      if(element.compareTo(super.get(0)) >= 0){
        super.add(element);
        System.out.println(element);
        return;
      }
      else{
        super.add(0, element);
        return;
      }
    }


    if(super.size() > 1){

      if(element.compareTo(super.get(0)) <= 0){
        super.add(0, element);
        return;
      }
      if(element.compareTo(super.get(super.size()-1)) >= 0){
        super.add(element);
        return;
      }
      for(int i = 0; i < super.size()-1; i++){
        T here = super.get(i);
        T next = super.get(i+1);
        if(element.compareTo(here) > 0 && element.compareTo(next) <= 0){
          super.add(i+1, element);
          i++;
          return;
        }

      }
    }
  }
}
