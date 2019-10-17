/**
 * 
 */
package comp3111.labs.lab7;

/**
 * @author kevinw
 * 
 * The coding style is bad in purpose.
 */
public class main {

	/**
	 * @param args
	 */
	/*
		a) The bug is in line 23-24
		b) In the forEach loop, a will be null (instead of a pointer pointing to a location of the array), so line 24 assigns an Animal object to null, the animals array is not affected. After the loop, all the elements in the animals array is still null
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animals[] = new Animal[10];
//		for (Animal a : animals)
//			a = new Animal();
		for(int i = 0; i < animals.length; i++){
			animals[i] = new Animal();
		}
		
		for (int iii = 0; iii < 10; iii++) {
			int ii = 0;
			for (; ii < 100 && animals[iii].isAlive() ; ii++) {
				System.out.print(animals[iii].getWeight() + " ");
				animals[iii].eat();
				if (ii % 3 == 0)
				animals[iii].poo();
			}
		}

	}
	

}
