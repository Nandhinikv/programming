package org.abstractedu;

public class Arts implements Education {

	@Override
	public void ug() {
		System.out.println("bcom");
	}

	@Override
	public void pg() {
		System.out.println("mcom");
		
	}
	private void bsc() {
		System.out.println("cs");

	}
	package org.abstractedu;

        public interface Education {
	void ug();
	void pg();
	}

public static void main(String[] args) {
	Arts a= new Arts();
	a.ug();
	a.pg();
	a.bsc();
}
}
