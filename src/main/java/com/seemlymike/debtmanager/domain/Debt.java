package com.seemlymike.debtmanager.domain;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Objects;

@Document(collection = "debts")
public class Debt extends AbstractDocument {

    private BigDecimal value;
    @DBRef
    private User user;

    public Debt(BigDecimal value, User user) {
        this.value = value;
        this.user = user;
    }

    public Debt() {
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Debt debt = (Debt) o;
        return Objects.equals(value, debt.value) && Objects.equals(user, debt.user);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value, user);
    }

    @Override
    public String toString() {
        return "Debt{" + "value=" + value + ", user=" + user + '}';
    }
}
