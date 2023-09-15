package calculator;

public class LoggerCalculyatorFactory implements ICalculableFactory {
    private LovableClass lovableClass;

    public LoggerCalculyatorFactory(LovableClass lovableClass) {
        this.lovableClass = lovableClass;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LoggerCalculyator(lovableClass, new Calculator(primaryArg));
    }
}
