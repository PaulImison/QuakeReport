package com.example.android.quakereport;

/**
 * Created by Paul on 12/05/2017.
 */

public class Earthquake {

    private Double mMagnitude;
    private String mLocation;
    private Long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(Double magnitude, String location, Long timeInMilliseconds, String url) {

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;

    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }

    @Override
    public String toString() {
        return "Earthquake{" +
                "mMagnitude=" + mMagnitude +
                ", mLocation='" + mLocation + '\'' +
                ", mTimeInMilliseconds=" + mTimeInMilliseconds +
                ", mUrl='" + mUrl + '\'' +
                '}';
    }
}
