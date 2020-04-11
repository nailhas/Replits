package replits;

import java.util.ArrayList;

public class A53_MethodsWithBoolArrayList_RepeatAll {
/*Create a static method, which returns nothing, 
takes a single parameter - Boolean ArrayList.
The method should modify its ArrayList parameter by repeating its ArrayList values.  
Ex: if the parameter is (true, false, false)
The modified ArrayList: (true, false, false, true, false, false)    */
		
		public static void main(String[] args) {
			ArrayList<Boolean> Bool = new ArrayList<Boolean>();
			Bool.add(false);
			Bool.add(true);
			Bool.add(true);
			repeatAL(Bool);
		}
		
		public static void repeatAL(ArrayList<Boolean> Bool) {
			Bool.addAll(Bool);
			System.out.println(Bool);//[false, true, true, false, true, true]
		}
	}