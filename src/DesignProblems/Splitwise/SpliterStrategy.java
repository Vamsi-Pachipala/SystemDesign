package DesignProblems.Splitwise;

import java.util.List;

public interface SpliterStrategy {
    List<Split> split(Expense expense);
}
