public class SBI implements Bank {
    private final String BNAME;

    public SBI(String BNAME) {
        this.BNAME = BNAME;
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
