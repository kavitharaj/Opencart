package oopsprogrampractice;

public class encapsulation {
 private double r=8;
	private double p=90;
int n=9;

	void setbankinterest(double p, double r, int n) {
		this.p = p;
		this.r = r;
		this.n = n;

	}

	

	void setbankinterest1(double x, double y, int z) {
		p = x;
		r = y;
		n = z;

	}
	double  getp() {
		return p;
	}
	double  getr() {
		return r;
	}
	double  getn() {
		return n;
	}

}
