package DesignProblems.splitwise2;

public class SplitTypeStrategyFactory {
    public static SplitTypeStrategy getSplitTypeStrategy(SplitType splitType) {
        switch (splitType) {
            case EQUAL:
                return new EqualSplitStrategy();
            case EXACT:
                // return new ExactSplitStrategy();
            case PERCENTAGE:
               // return new PercentageSplitStrategy();
            default:
                throw new IllegalArgumentException("Invalid split type");
        }
    }
}
