import java.util.*;
class SortHashMap{
	void getValues(HashMap<Integer, String> map){
  
         Set set = map.entrySet();
         Iterator it = set.iterator();
         ArrayList<String> list = new ArrayList<>();
         
         while(it.hasNext()){
         	Map.Entry me = (Map.Entry)it.next();
         	Object o = me.getValue();
         	String s = String.valueOf(o);
         	list.add(s);
         }
         Collections.sort(list);
         System.out.println("Sorted values of the Map: ");
         for (String s : list ) {
         	System.out.println(s);
         }
	}
}

class SortHashMapDriver13{
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(23, "Gargee");
		map.put(37, "Bijoy");
		map.put(12, "Apurva");
		map.put(10, "Hussham");
		SortHashMap ob = new SortHashMap();
		ob.getValues(map);
	}
}