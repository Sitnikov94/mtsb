package animalsId;

public class Marathon {
	private final Animals[] animals;

	protected Marathon(Animals[] animals) {
		this.animals = animals;
	}

	public void startMarathon(double distanceRun) {
		for (int count = 0; count < animals.length; count++) {
			animals[count].run(distanceRun);
		}
	}
}

