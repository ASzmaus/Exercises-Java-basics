package GoodsThreads;

import java.util.ArrayList;

public class GoodsList {

		public static GoodsList lt;
		public ArrayList<Towar> GoodsList;
		
		public GoodsList() {
			GoodsList=new ArrayList<Towar>();
		}
			
		public static  GoodsList getInstance() {
			if(lt==null) {
			lt = new GoodsList();
			} 
			return lt;
		}

		public void add(Towar towar) {
			getInstance();
			GoodsList.add(towar);
		}
		
		public int size() {
			getInstance();
			return GoodsList.size();
		}
		
		public Towar get(int i) {
			getInstance();
			return GoodsList.get(i);
		}

		public boolean isEmpty() {
			if(GoodsList.isEmpty()) {
				return true;
			}else {
				return false;	
			}
		}
	
}
