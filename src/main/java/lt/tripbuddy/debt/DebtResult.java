package lt.tripbuddy.debt;

import java.util.List;
import java.util.Map;

public record DebtResult(
        Map<Long, Long> paidCents,
        Map<Long, Long> shareCents,
        Map<Long, Long> balanceCents,
        List<Transfer> transfers
) {}
