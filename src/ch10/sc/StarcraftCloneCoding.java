package ch10.sc;

import ch10.sc.unit.Marine;
import ch10.sc.unit.Unit;
import ch10.sc.unit.Zealot;
import ch10.sc.unit.Zergling;

public class StarcraftCloneCoding {

	static Marine[] marines;
	static Zergling[] zerglings;
	static Zealot[] zealots;

	public static void main(String[] args) {

		initUnits();
		reportAllUnits();

		System.out.println("\n\n마린이 저글링에 대해 2회 공격 후\n");
		marines[0].attack(zerglings[0], 2);
		zerglings[0].reportStatus();

		System.out.println("\n\n마린#2이 질럿#2에 대해 5회 공격 후\n");
		marines[1].attack(zealots[1], 5);
		zealots[1].reportStatus();

		System.out.println("\n\n저글링#1이 마린#3에 대해 3회 공격 후\n");
		zerglings[0].attack(marines[2], 3);
		marines[2].reportStatus();
		System.out.println("\n\n저글링#1이 질럿#2에 대해 7회 공격 후\n");
		zerglings[0].attack(zealots[1], 7);
		zealots[1].reportStatus();

		System.out.println("\n\n질럿#1이 마린#3에 대해 3회 공격 후\n");
		zealots[0].attack(marines[2], 3);
		marines[2].reportStatus();
		System.out.println("\n\n질럿#2이 질럿#1에 대해 3회 공격 후\n");
		zealots[1].attack(zealots[0], 7);
		zealots[0].reportStatus();

	}

	static void initUnits() {
		marines = new Marine[] { new Marine(1), new Marine(2), new Marine(3), new Marine(4), new Marine(5) };

		zerglings = new Zergling[] { new Zergling(1) };

		zealots = new Zealot[] { new Zealot(), new Zealot(2) };

	}

	static void reportAllUnits() {
		reportUnits(marines);
		reportUnits(zerglings);
		reportUnits(zealots);
//		System.out.println(zerglings[0]);
	}

	static void reportUnits(Unit[] units) {
		for (Unit unit : units) {
			unit.reportStatus();
		}
		System.out.println();
	}

}
