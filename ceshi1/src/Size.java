public enum Size {
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LAGER("XL");

    private String abbreviation;
    Size(String abbreviation){
        this.abbreviation=abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
