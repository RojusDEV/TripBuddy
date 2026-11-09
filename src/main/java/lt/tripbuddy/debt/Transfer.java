package lt.tripbuddy.debt;

public record Transfer(long fromId, long toId, long amountCents) {}