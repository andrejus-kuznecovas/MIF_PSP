package template;

public abstract class ConstructionZoneBoard {

	protected int buildingCount;

	public ConstructionZoneBoard(int buildingCount) {
		this.buildingCount = buildingCount;
	}

	final public void performBuildingSequence(int projectCount) {
		considerProjects(projectCount);
		int buildingsDemolished = demolish();
		System.out.println("Buildings demolished: " + buildingsDemolished + ". Buildings left: " + buildingCount);
		int constructionInProgressCount = build();
		System.out.println("After construction there are " + buildingCount + " buildings and "
				+ constructionInProgressCount + " constructions in progress");
	}

	protected abstract int demolish();

	protected abstract void considerProjects(int projectCount);

	protected abstract int build();

}
