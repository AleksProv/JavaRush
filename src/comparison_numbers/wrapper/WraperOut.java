package comparison_numbers.wrapper;

public class WraperOut implements WrapperTest {
    @Override
    public void outSout() {
        System.out.println("Вывод на консоль");
    }
}

class Test01 extends WraperOut {
    WrapperTest wrapperTest;

    public Test01(WrapperTest wrapperTest) {
        this.wrapperTest = wrapperTest;
    }

    @Override
    public void outSout() {
        super.outSout();
        System.out.println("Колличество символов");
    }


}
