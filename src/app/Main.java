package app;

public class Main {
    public static void main(String[] args) {
        AdviceProvider provider = new AdviceProviderImpl();

        provider.advise(Day.MONDAY);
        provider.advise(Day.FRIDAY);
        provider.advise(Day.SUNDAY);
    }
}
