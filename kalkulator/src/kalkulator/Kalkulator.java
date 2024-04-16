package kalkulator;

public class Kalkulator {
	
	int operacja=0; // 0=nic nie rób 1= dodaj 2=odejmij 3=pomnoz 4=podziel 
	double tmp;
	double tmp_2;
	
	
	void dodaj(double tmp) {
		this.tmp=tmp;
		operacja=1;
	}
	
	void odejmij(double tmp) {
		this.tmp=tmp;
		operacja=2;
	}
	
	void pomnoz(double tmp) {
		this.tmp=tmp;
		operacja=3;
	}
	
	void podziel(double tmp) {
		this.tmp=tmp;
		operacja=4;
	}
	
	void zeruj() {
		operacja=0;
		tmp=0;
		tmp_2=0;
	}
	
	int getOperacja() {
		return operacja;
	}
	
	String equals(double tmp1) {
		tmp_2=tmp1;
		double wynik=0;
		if(operacja==1) {
			wynik=tmp+tmp_2;
		}else if(operacja==2) {
			wynik=tmp-tmp_2;
		}else if(operacja==3) {
			wynik=tmp*tmp_2;
		}else if(operacja==4) {
			wynik=tmp/tmp_2;
		}else {
		    wynik=-1; 
		}
		
		return Double.toString(wynik);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
