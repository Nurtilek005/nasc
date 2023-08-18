public abstract class News {
    private String NAME;
    private String PAGES;

    public News(String NAME, String PAGES) {
        this.NAME = NAME;
        this.PAGES = PAGES;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPAGES() {
        return PAGES;
    }

    public void setPAGES(String PAGES) {
        this.PAGES = PAGES;
    }

    @Override
    public String toString() {
        return "News{" +
                "NAME='" + NAME + '\'' +
                ", PAGES='" + PAGES + '\'' +
                '}';
    }
    abstract void rr();
}


