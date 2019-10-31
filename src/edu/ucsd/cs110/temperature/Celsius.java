package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Celsius((float)((this.getValue() * 1.8) + 32));
    }

    public String toString()
    {
        return String.valueOf(this.getValue()) + " C";
    }
}