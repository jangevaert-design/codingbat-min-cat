public class minCat {
  public String minCat(String a, String b) {
    int lena = a.length();
    int lenb = b.length();
    if (lena > lenb) {
      int dif = lena - lenb;
      return a.substring(dif, lena) + b;
    } else if (lenb > lena) {
      int dif = lenb - lena;
      return a + b.substring(dif, lenb);
    } else {
      return a + b;
    }
  }
}
