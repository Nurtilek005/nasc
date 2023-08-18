public class MAgazine extends News implements Readable{

    public MAgazine(String NAME, String PAGES) {
        super(NAME, PAGES);
    }

    @Override
    public String toString() {
        return "MAgazine{}";
    }

    @Override
    public void rr() {
        System.out.println("Magazin:"+getNAME());
        System.out.println("Pages:"+getPAGES());
    }

}

