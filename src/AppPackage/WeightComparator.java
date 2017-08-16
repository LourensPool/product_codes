/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

/**
 *
 * @author Lourens
 */
import java.util.Comparator;

class WeightComp implements Comparator <Difference>{
		@Override
		public int compare (Difference diff1, Difference diff2){
			int weight1 = diff1.getWeight();
			int weight2 = diff2.getWeight();
			
			if (weight1 > weight2) {
				return 1;
			} else if (weight1 < weight2){
				return -1;
			} else {
				return 0;
			}
		}
	}