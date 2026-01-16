package com.sorting.cropmonitor;
class SensorReading {
    long timestamp;      // Time when data was recorded
    double temperature;  // Soil temperature

    SensorReading(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}