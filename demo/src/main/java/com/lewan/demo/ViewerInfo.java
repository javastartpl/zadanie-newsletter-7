package com.lewan.demo;

public class ViewerInfo {

    private Integer numberOfVisits = 0;
    private static Integer uniqueSession = 0;
    private static Integer totalViews = 0;

    ViewerInfo() {
        this.numberOfVisits++;
        uniqueSession++;
        totalViews++;
    }

    void incrementNumberOfVisits() {
        this.numberOfVisits++;
    }

    static void incrementTotalViews() {
        totalViews++;
    }

    @Override
    public String toString() {
        return "View Info: " +
                " number of your visits = " + numberOfVisits +
                ", total views = " + totalViews +
                ", unique sessions = " + uniqueSession;
    }
}

