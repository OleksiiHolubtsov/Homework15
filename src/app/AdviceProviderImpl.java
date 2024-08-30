package app;

public class AdviceProviderImpl implements AdviceProvider {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Порада: Постарайтеся бути продуктивним на роботі.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Рекомендації по місцях для відвідування:  музей, кінотеатр.");
                break;
            default:
                throw new IllegalArgumentException("Невідомий день: " + day);
        }
    }
}
