import java.util.HashMap;
import java.util.HashSet;

public class Collection {
    public static void main(String[] args){
        HashMap<Integer,Integer> h1=new HashMap<>();
        int[] a={1,2,3,4,2,3,12,1};
        HashSet<Integer> m=new HashSet<>();
        for(int e:a){
            if(!h1.containsKey(e)){
                h1.put(e,1);
            }
            else{
                h1.put(e,h1.get(e)+1);
            }
        }
        for(int e:h1.keySet()){
            System.out.println(e+" "+h1.get(e));
        }
        System.out.println(" ");
        for(int y:h1.keySet()){
            if(!m.contains(y)){
                m.add(y);
            }
        }
        for(int w:m){
            System.out.print(w+" ");
        }
    }
}
