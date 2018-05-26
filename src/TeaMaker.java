import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

public class TeaMaker {
	public static void main(String[] args){
	/* Figure out how to make a cup of tea using the classes below */
	// ask user for flavor they want
	String flavor = JOptionPane.showInputDialog("What flavor of tea do you want?");
	// ask user if they want cold or hot water
	String temperature = JOptionPane.showInputDialog("Do you want your tea hot or cold?");

	// put water in kettle
	Kettle kettle = new Kettle();
	Cup cup = new Cup();
	if(temperature.equals("hot")) {
		kettle.boil();
	}
	// put teabag in water
	TeaBag teabag = new TeaBag(flavor);
	// cook tea
	cup.makeTea(teabag, kettle.getWater());
	}
}

class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

}


