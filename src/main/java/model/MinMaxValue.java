package model;

import java.util.Objects;

public class MinMaxValue {
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public MinMaxValue() {
    }

    public MinMaxValue(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "MinMaxValue{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinMaxValue that = (MinMaxValue) o;
        return min == that.min && max == that.max;
    }
}
