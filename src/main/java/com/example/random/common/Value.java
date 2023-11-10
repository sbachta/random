package com.example.random.common;

import org.apache.commons.lang3.builder.*;

public abstract class Value<T extends Value<T>> implements Comparable<T>  {
    private static final String[] DEFAULT_EXCLUDED_FIELDS = new String[] {};

    @Override
    public int compareTo(final T o) {
        return CompareToBuilder.reflectionCompare(this, o, excludedFields());
    }

    String[] excludedFields() {
        return DEFAULT_EXCLUDED_FIELDS;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, excludedFields());
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s",
                getClass().getSimpleName(),
                ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE)
        );
    }

    @Override
    public boolean equals(final Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj, excludedFields());
    }
}