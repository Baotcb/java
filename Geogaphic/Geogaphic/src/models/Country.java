
package models;

public class Country implements Comparable<Country>{
    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public Country() {
        countryCode = countryName = "";
        totalArea = 0;
    }

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }
    
    public void display() {
        System.out.println("Country code: " + countryCode);
        System.out.println("Country name: " + countryName);
        System.out.println("Total area: " + totalArea + " km^2");
    }

    @Override
    public String toString() {
        return String.format("%-5s | %-12s | %-15f km^2", countryCode, countryName, totalArea);
    }

    @Override
    public int compareTo(Country o) {
        return countryName.compareTo(o.getCountryName());
    }   
}
