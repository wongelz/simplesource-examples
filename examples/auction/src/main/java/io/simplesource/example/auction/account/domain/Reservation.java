package io.simplesource.example.auction.account.domain;

import io.simplesource.example.auction.core.Money;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public final class Reservation {
    @NonNull
    private ReservationId reservationId;
    @NonNull
    private String description;
    @NonNull
    private Money amount;
    private Status status;

    public enum Status {
        DRAFT,
        CANCELLED,
        CONFIRMED
    }
}
