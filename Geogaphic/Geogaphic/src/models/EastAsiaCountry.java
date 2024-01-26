
package models;

public class EastAsiaCountry extends Country{
    private String countryTerrain;

    public EastAsiaCountry() {
        super();
        countryTerrain = "";
    }

    public EastAsiaCountry(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Country terrain: " + countryTerrain);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + countryTerrain; 
    }   
    
}
