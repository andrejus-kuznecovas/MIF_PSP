package template;

public abstract class ConstructionZoneShareholder {
	protected int buildingCount;

	public ConstructionZoneShareholder(int buildingCount) {
		this.buildingCount = buildingCount;
	}

	public final void payForProjects(int projectCount, int averageCost, int cycles) {
		for (int i = 0; i < cycles; i++) {
			considerProjects(projectCount);
			int buildingsDemolished = demolish();
			System.out.println(buildingsDemolished + " buildings were destroyed and Shareholder has to pay "
					+ buildingsDemolished * averageCost);
			int buildingsBeforeConstruction = buildingCount;
			System.out.println("Buildings before construction:" + buildingsBeforeConstruction);
			int constructionInProgressCount = build();
			int newBuildingsAfterConstruction = buildingCount - buildingsBeforeConstruction;
			System.out.println(
					"New buildings: " + newBuildingsAfterConstruction + ". In progress: " + constructionInProgressCount
							+ ". Shareholder profit: " + newBuildingsAfterConstruction * averageCost);
			System.out.println("--------   --------   --------   --------");
		}
	};

	protected abstract int demolish();

	protected abstract void considerProjects(int projectCount);

	protected abstract int build();

}
