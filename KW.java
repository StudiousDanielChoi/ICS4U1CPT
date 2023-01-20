
public class KW
{
    //initialize instance variables
    // done by Solomon
    private int lightBulbs;
    private int Wattage;
    private int Hours;
    private int kiloWatts;
    private int kiloWattsPerDay;
    private int kiloWattsPerMonth;
    private int kiloWattsPerYear;
    private int dayPerMonth;
    private int dayPerYear;
    private int numberStudents;
    private double CO22PerYear;
    private double CO2PerStudent;
    private int trees;

    //initialize constant variables
    final int kilowattConversion = 1000;
    final double CO2Conversion = 0.18;
    final int treeConversion = 12;
    
    // done by Daniel
    // constructor method
    public KW(int lb, int wat, int hr, int daysPerMonth, int daysPerYear, int numStudents)
    {
        lightBulbs = lb;
        Wattage = wat;
        Hours = hr;
        dayPerMonth = daysPerMonth;
        dayPerYear = daysPerYear;
        numberStudents = numStudents;
        reCalculator();
    }

    //accessor methods
    //done by Daniel
    public int getKiloPerDay()
    {
        return kiloWattsPerDay;
    }

    public int getKiloPerMonth()
    {
        return kiloWattsPerMonth;
    }

    public int getKiloPerYear()
    {
        return kiloWattsPerYear;
    }

    public double getCO2PerYear()
    {
        return CO22PerYear;
    }

    public double getCO2PerStudent()
    {
        return CO2PerStudent;
    }

    public int getNumberTrees()
    {
        return trees;
    }

    public String toString()
    {
        return "This school uses " + kiloWattsPerDay + " kilowatts per day, " + kiloWattsPerMonth + " kilowatts per month, and " + kiloWattsPerYear + " kilowatts per year. This produces " + CO22PerYear + " kilograms of carbon dioxide per year. A single student at this school produces around " + CO2PerStudent + " kilograms of carbon dioxide just converting to electricity alone! You would need " + trees + " trees to compensate for the amount of carbon dioxide produced from this school!";
    }

    //modifier methods
    //done by Daniel
    public void changeLightbulb(int changedLightBulbs)
    {
        lightBulbs = changedLightBulbs;
        reCalculator();
    }

    public void changeWatt(int watts)
    {
        Wattage = watts;
        reCalculator();
    }

    public void changeHours(int hours)
    {
        Hours = hours;
        reCalculator();
    }
    public void changeDayPerMonth(int dayMonth)
    {
        dayPerMonth = dayMonth;
        reCalculator();
    }
    public void changeDayPerYear(int dayYear)
    {
        dayPerYear = dayYear;
        reCalculator();
    }
    public void changeNumStudents(int numberOfStudents)
    {
        numberStudents = numberOfStudents;
        reCalculator();
    }
    // method to recalculate numbers after each change
    public void reCalculator()
    {
        kiloWatts = (lightBulbs * Wattage)/ kilowattConversion;
        kiloWattsPerDay = kiloWatts * Hours;
        kiloWattsPerMonth = kiloWattsPerDay * dayPerMonth;
        kiloWattsPerYear = kiloWattsPerDay * dayPerYear;
        CO22PerYear = kiloWattsPerYear * CO2Conversion;
        CO2PerStudent = CO22PerYear / numberStudents;
        double CO2Displaced  = CO22PerYear / treeConversion;
        Math.round(CO2Displaced);
        trees = 1 + (int)CO2Displaced;
    }
}
