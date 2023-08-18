public class Newspaper extends News implements Readable{

    public Newspaper(String NAME, String PAGES) {
        super(NAME, PAGES);

    }


    @Override
    public String toString() {
        return "Newspaper{  }";



    }

    @Override
    public void rr() {
        System.out.println("Newspaper:"+getNAME());
        System.out.println("PAagest:"+getPAGES());
    }
}
