package comparison_numbers.wrapper;

public class WraperOut implements WrapperTest {
    public String text;

    public WraperOut(String text) {
        this.text = text;
    }


    public static void main(String[] args) {
        WrapperTest test = new Test01(new WraperOut("Кавычки"));
        test.outSout();
    }

    @Override
    public void outSout() {
        System.out.print(text);
    }
}

class Test01 implements WrapperTest {
    WrapperTest wrapperTest;

    public Test01(WrapperTest wrapperTest) {
        this.wrapperTest = wrapperTest;
    }

    @Override
    public void outSout() {
        System.out.print("\"");
        wrapperTest.outSout();
        System.out.print("\"");
    }


}
