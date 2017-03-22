package com.javarush.task.task21.task2106;

import java.util.Date;

/* 
Ошибка в equals/hashCode
*/
public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solution solution1 = (Solution) o;

        if (anInt != solution1.anInt) return false;
        if (Double.compare(solution1.aDouble, aDouble) != 0) return false;
        if (!string.equals(solution1.string)) return false;
        if (!date.equals(solution1.date)) return false;
        return solution.equals(solution1.solution);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = anInt;
        result = 31 * result + string.hashCode();
        temp = Double.doubleToLongBits(aDouble);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + date.hashCode();
        result = 31 * result + solution.hashCode();
        return result;
    }

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

}