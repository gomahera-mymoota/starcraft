package ch08.sc;

import ch08.sc.unit.Marine;
import ch08.sc.unit.Zergling;

public class StarcraftCloneCodingStaticVariableVersion {
	
	static Marine[] marines;
	static Zergling[] zerglings;

	public static void main(String[] args) {
		
		initUnits();
		reportAllUnits();
		
		System.out.println("마린이 저글링에 대해 1회 공격 후\n");
		marines[0].attack(zerglings[0], 2);
		zerglings[0].reportStatus();

	}
	
	static void initUnits() {
		marines = new Marine[] {
				new Marine(1), new Marine(2), new Marine(3), new Marine(4), new Marine(5)
			};
		
		zerglings = new Zergling[] {
				new Zergling(1)
		};
		
	}
	
	static void reportAllUnits() {
		for (Marine m : marines) {
			m.reportStatus();
		}
		
		for (Zergling z : zerglings) {
			z.reportStatus();
		}
		
	}
	

}
