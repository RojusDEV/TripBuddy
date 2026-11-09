package lt.tripbuddy.debt;

import java.util.List;
import java.util.Map;

public record ExpenseInput(
        long payerId,
        long amountCents,
        List<Long> participantIds,
        Map<Long, Long> customShares
) {
    public static ExpenseInput equalSplit(long payerId, long amountCents, List<Long> participantIds) {
        return new ExpenseInput(payerId, amountCents, participantIds, null);
    }

    public static ExpenseInput customSplit(long payerId, long amountCents, Map<Long, Long> customShares) {
        return new ExpenseInput(payerId, amountCents, List.copyOf(customShares.keySet()), customShares);
    }

    public boolean hasCustomShares() {
        return customShares != null && !customShares.isEmpty();
    }
}