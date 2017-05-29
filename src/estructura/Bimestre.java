package estructura;

public class Bimestre {
	private Ciencias C1,C2,C3,C4;
	private Letras L1,L2,L3,L4;
	public Bimestre(){
		C1=null;
		C2=null;
		C3=null;
		C4=null;
		L1=null;
		L2=null;
		L3=null;
		L4=null;
	}
	public Bimestre(Ciencias c1, Ciencias c2, Ciencias c3, Ciencias c4, Letras l1, Letras l2, Letras l3, Letras l4) {
		super();
		C1 = c1;
		C2 = c2;
		C3 = c3;
		C4 = c4;
		L1 = l1;
		L2 = l2;
		L3 = l3;
		L4 = l4;
	}
	public Ciencias getC1() {
		return C1;
	}
	public void setC1(Ciencias c1) {
		C1 = c1;
	}
	public Ciencias getC2() {
		return C2;
	}
	public void setC2(Ciencias c2) {
		C2 = c2;
	}
	public Ciencias getC3() {
		return C3;
	}
	public void setC3(Ciencias c3) {
		C3 = c3;
	}
	public Ciencias getC4() {
		return C4;
	}
	public void setC4(Ciencias c4) {
		C4 = c4;
	}
	public Letras getL1() {
		return L1;
	}
	public void setL1(Letras l1) {
		L1 = l1;
	}
	public Letras getL2() {
		return L2;
	}
	public void setL2(Letras l2) {
		L2 = l2;
	}
	public Letras getL3() {
		return L3;
	}
	public void setL3(Letras l3) {
		L3 = l3;
	}
	public Letras getL4() {
		return L4;
	}
	public void setL4(Letras l4) {
		L4 = l4;
	}
	@Override
	public String toString() {
		return "Bimestre [C1=" + C1 + ", C2=" + C2 + ", C3=" + C3 + ", C4=" + C4 + ", L1=" + L1 + ", L2=" + L2 + ", L3="
				+ L3 + ", L4=" + L4 + "]";
	}
	
	
	
}	
