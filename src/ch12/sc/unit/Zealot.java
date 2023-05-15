package ch12.sc.unit;

public class Zealot extends Unit implements Attackable {

	static int atk;
	static int def;
	static final String WEAPON;
	static final String TYPE;
	
	int shield;
	
	static {
		atk = 8 * 2;
		def = 1;
		WEAPON = "사이오닉 검";
		TYPE = "질럿";
	}

	public Zealot() {
		this(1);
	}

	public Zealot(int num) {
		this(num, 100);
	}

	Zealot(int num, int hp) {
		super(num, hp);
		this.shield = 60;
	}

	@Override
	int calcDamage(int atkDamage) {
		this.shield -= atkDamage;
//		int result = 0;
		
		if (this.shield < 0) {
			int result = this.shield + Zealot.def;
			this.shield = 0;
			return -result;
		}
		
		return 0;
	}
	
	@Override
	public void getAttacked(int atkDamage, int count) {
		if (count > 0) {
			this.hp -= calcDamage(atkDamage);
			getAttacked(atkDamage, count - 1);
		}
	}
	
	@Override
	public String toString() {
		String result = TYPE + "#" + num + ":\n";
		result += String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 보호막: %d, 무기 이름: %s]",  
				this.hp, atk, def, this.shield, WEAPON);
		
		return result;
	}
	
	@Override
	public void attack(Unit u, int count) {
		u.getAttacked(atk, count);
	}
}
