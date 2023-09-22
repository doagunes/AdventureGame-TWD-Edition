public class Inventory {
    private String weaponName;
    private double weaponDamage;
    private double currentAmmo;
    private int ammoPerMagazine;
    private int extraMagazine;
    private static int bandageNumber;

    public Inventory(String weaponName) {
        this.weaponName = weaponName;
        weaponDamage = 45;
        currentAmmo = 6;
        ammoPerMagazine = 6;
        extraMagazine = 5;
        bandageNumber = 10;
    }


    public Inventory() {
    }

    public static int getBandageNumber() {
        return bandageNumber;
    }

    public static void setBandageNumber(int bandageNumber) {
        Inventory.bandageNumber = bandageNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public double getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(double weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public double getCurrentAmmo() {
        return currentAmmo;
    }

    public void setCurrentAmmo(double currentAmmo) {
        this.currentAmmo = currentAmmo;
    }

    public int getAmmoPerMagazine() {
        return ammoPerMagazine;
    }

    public void setAmmoPerMagazine(int ammoPerMagazine) {
        this.ammoPerMagazine = ammoPerMagazine;
    }

    public int getExtraMagazine() {
        return extraMagazine;
    }

    public void setExtraMagazine(int extraMagazine) {
        this.extraMagazine = extraMagazine;
    }

}
