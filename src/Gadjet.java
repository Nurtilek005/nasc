public class Gadjet extends News implements Readable {


    public Gadjet(String NAME, String PAGES) {
        super(NAME, PAGES);

    }

    @Override
    public String toString() {
        return "Gadjet{}";
    }

    @Override
    public void rr() {
        System.out.println("Gadjet:"+getNAME());
        System.out.println("Pages:"+getPAGES());

    }
}

