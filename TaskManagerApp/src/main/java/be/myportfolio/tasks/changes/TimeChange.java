package be.myportfolio.tasks.changes;

import jakarta.validation.constraints.NotNull;

import java.time.LocalTime;

public record TimeChange(@NotNull LocalTime time) {
}
