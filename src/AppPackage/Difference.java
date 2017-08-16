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
public class Difference {

	private int indexOfCW;
	private int weight;
	
	Difference (int _index, int _weight) {
		this.indexOfCW = _index;
		this.weight = _weight;
	}
	
	public int getWeight () {
		return this.weight;
	}
	
	public int getIndexOfCW () {
		return this.indexOfCW;
	}
	
}
