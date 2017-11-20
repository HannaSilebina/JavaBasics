package by.epam.baronina.task5;

public class Fraction {
  private int m;
  private int n;

  public int getM() {
    return this.m;
  }

  public void setM(int m) {
    this.m = m;
  }

  public int getN() {
    return this.n;
  }

  public void setN(int n) {
    this.n = n;
  }

  @Override
  public String toString() {
    return "Fraction{" +
        "m=" + m +
        ", n=" + n +
        '}';
  }
}
