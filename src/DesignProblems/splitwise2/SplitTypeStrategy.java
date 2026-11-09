package DesignProblems.splitwise2;

import java.util.List;

public interface SplitTypeStrategy {

    List<Split> calculateSplit(Expense expense , Group group);
}
