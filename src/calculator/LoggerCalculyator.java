package calculator;

public class LoggerCalculyator implements Calculable{
    private LovableClass lovableClass;
    private Calculable calculable;

    public LoggerCalculyator(LovableClass lovableClass, Calculable calculable) {
        this.lovableClass = lovableClass;
        this.calculable = calculable;
    }

    @Override
    public Calculable sum(int arg) {
        lovableClass.logPrint("МЫ в методе сумм: " + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        lovableClass.logPrint("МЫ в методе умножения: " + arg);
        return calculable.multi(arg);
    }

    @Override
    public int getResult() {
        lovableClass.logPrint("Получили результат.");
        return calculable.getResult();
    }
}
