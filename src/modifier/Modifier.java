package modifier;

public class Modifier {
  // public : semua tingkatan bisa akses, class, package, subclass, world
  // protected : class, package, subclass
  // default
  // private

  public String firstName;
  protected String lastName;
  String birthPlace;
  private int birthYear;

  public void setBirthYear(int year) {
    this.birthYear = year;
  }

  public int getBirthYear() {
    return this.birthYear;
  }
}

/**
 * InnerModifier
 */
class InnerModifier {
  public static void main(String[] args) {
    // INSTANCE OBJECT
    Modifier mod = new Modifier();
    mod.firstName = "Indah";
    mod.lastName = "Rahma";
    mod.birthPlace = "JKT";
    mod.setBirthYear(1995);

    // CETAK DATA
    System.out.println("=======================================");
    System.out.println("RESUME");
    System.out.println("Nama lengkap : " + mod.firstName + " " + mod.lastName);
    System.out.println("Tempat lahir : " + mod.birthPlace);
    System.out.println("Tahun lahir : " + mod.getBirthYear());
  }

}
