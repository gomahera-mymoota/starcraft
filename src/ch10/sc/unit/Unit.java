package ch10.sc.unit;

public abstract class Unit {

	int num;
	int hp;	
	
	Unit(int num, int hp) {
		this.num = num;
		this.hp = hp;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void reportStatus() {
		System.out.println(this);
	} 
	
	public void getAttacked(int atkDamage, int count) {
		this.hp -= calcDamage(atkDamage) * count;
	}
	
	// 대미지를 양수로 반환
	int calcDamage(int atkDamage) {
//		return def - atkDamage;
		return 0;
	}

	abstract void attack(Unit u, int count);

}
