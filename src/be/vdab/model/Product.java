package be.vdab.model;

import java.util.Arrays;

public abstract class Product {
    private int productNummer;
    private String merk;
    private String naam;
    private int volume;
    private double prijs;

    public Product(String merk, String naam, int volume, double prijs){
        setMerk(merk);
        setNaam(naam);
        setVolume(volume);
        setPrijs(prijs);
    }

    public void setMerk(String merk){
        this.merk = this.merk;
    }
    public String getMerk(){
        return merk;
    }
    public void setNaam(String naam){
        this.naam = naam;
    }
    public String getNaam(){
        return naam;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    public void setPrijs(double prijs){
        this.prijs = prijs;
    }
    public double getPrijs(){
        return prijs;
    }
    public String getProductCode() {
        StringBuilder lettersMerk = new StringBuilder(getMerk());
        lettersMerk.delete(3, lettersMerk.length());
        StringBuilder lettersNaam = new StringBuilder(getNaam());
        lettersNaam.delete(3, lettersMerk.length());
        StringBuilder volumeWaarde = new StringBuilder(getVolume());
        volumeWaarde.delete(3, volumeWaarde.length());

        StringBuilder productCode = new StringBuilder();
        productCode.append(lettersMerk).append(lettersNaam).append(volumeWaarde);
        productCode.append(productCode.substring(0, productCode.length()).toUpperCase());

        for (int teller = 0; teller < productCode.length(); teller++) {
            if (productCode.charAt(teller) == ' ') {
                productCode.setCharAt(teller, '_');
            }
        }
        String productNummer = productCode.toString();
        return productNummer;
    }

    public sorteerOpMerkNaam(){
        String [] merken = ;
        Arrays.sort(merken, (merk1, merk2) -> merk1.compareTo(merk2));
    }

}

