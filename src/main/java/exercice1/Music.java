package exercice1;





public class Music {
	public static void main(String[] args) {
		Orchestra orchestra = new Orchestra();
		Wind wind = new Wind();
		orchestra.addWind(wind);
		Percussion percussion = new Percussion();
		orchestra.addPercussion(percussion);
		Wind wood = new Woodwind();
		orchestra.addWind(wood);
		Wind brass = new Brass();
		orchestra.addWind(brass);
		orchestra.tuneAll();
	}
}