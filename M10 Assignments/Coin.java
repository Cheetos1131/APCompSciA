public class Coin {
    private int mintYear;
    private double faceValue;
    private String country;

    public Coin(int year, double value, String country) {
        mintYear = year;
        faceValue = value;
        this.country = country;
    }
    
    /**
     * The getMintYear function returns the year of minting for a coin.
     * @return The year of the car
     */
    public int getMintYear() {
        return mintYear;
    }

    /**
    * The getFaceValue function returns the face value of a bond.
    * @return The face value of the die
    */
    public double getFaceValue() {
        return faceValue;
    }

    /**
    * The getCountry function returns the country of the user.
    * @return The country variable
    */
    public String getCountry() {
        return this.country;
    }

    /**
    * The setMintYear function sets the mint year of a coin.
    * @param year Set the year of the coin
    * @return A reference to the mint object
    */
    public void setMintYear(int year) {
        mintYear = year;
    }

    /**
    * The setFaceValue function sets the face value of a card.
    * @param faceValue Set the face value of the card
    * @return Nothing
    */
    public void setFaceValue(double faceValue) {
        this.faceValue = faceValue;
    }

    /**
    * The setCountry function sets the country of a person.
    * @param country Set the country variable
    * @return Nothing
    */
    public void setCountry(String country) {
        this.country = country;
    }
}