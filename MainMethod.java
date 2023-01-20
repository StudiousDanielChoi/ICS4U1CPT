public class MainMethod
{
    public static void main(String args[])
    {
        //done by Solomon
        // creates new object of the KW class named loyolaKW using the constructor method
        KW loyolaKW = new KW(500, 20, 6, 21, 254, 1092);
        
        // prompting accessor methods, showing the value  and what it stands for
        System.out.println("This is the amount of kilowatts per day for Loyola.");
        System.out.println(loyolaKW.getKiloPerDay());
        System.out.println("This is the amount of kilowatts per month for Loyola.");
        System.out.println(loyolaKW.getKiloPerMonth());
        System.out.println("This is the amount of kilowatts per year for Loyola.");
        System.out.println(loyolaKW.getKiloPerYear());
        System.out.println("This is the amount of carbon dioxide produced per year for Loyola.");
        System.out.println(loyolaKW.getCO2PerYear());
        System.out.println("This is the amount of carbon dioxide a student produces at Loyola.");
        System.out.println(loyolaKW.getCO2PerStudent());
        System.out.println("This is the amount of trees needed to compensate for the amount of carbon dioxide produced.");
        System.out.println(loyolaKW.getNumberTrees());
        
        // example of toString method working
        System.out.println(loyolaKW.toString());
        
        // example of modifier method working
        loyolaKW.changeLightbulb(100);
        
        // shows how the modifier method affects the program as a whole
        System.out.println(loyolaKW.toString());
        
        //done by Daniel
        
        //creates new object from the KW class
        KW gonzagaKW = new KW(1324, 40, 6, 21, 254, 1503);
        
        // prompting accessor methods, showing the value  and what it stands for
        
        System.out.println("This is the amount of kilowatts per day for Gonzaga.");
        System.out.println(gonzagaKW.getKiloPerDay());
        System.out.println("This is the amount of kilowatts per month for Gonzaga.");
        System.out.println(gonzagaKW.getKiloPerMonth());
        System.out.println("This is the amount of kilowatts per year for Gonzaga.");
        System.out.println(gonzagaKW.getKiloPerYear());
        System.out.println("This is the amount of carbon dioxide produced per year for Gonzaga.");
        System.out.println(gonzagaKW.getCO2PerYear());
        System.out.println("This is the amount of carbon dioxide a student produces at Gonzaga.");
        System.out.println(gonzagaKW.getCO2PerStudent());
        System.out.println("This is the amount of trees needed to compensate for the amount of carbon dioxide produced.");
        System.out.println(gonzagaKW.getNumberTrees());

        System.out.println(gonzagaKW.toString());
        
        //done by Solomon
        //creates new object from the KW class using the constructor method
        KW stfxKW = new KW(3202, 40, 6, 21, 254, 2321);
        
        // prompting accessor methods, showing the value  and what it stands for
        System.out.println("This is the amount of kilowatts per day for STFX.");
        System.out.println(stfxKW.getKiloPerDay());
        System.out.println("This is the amount of kilowatts per month for STFX.");
        System.out.println(stfxKW.getKiloPerMonth());
        System.out.println("This is the amount of kilowatts per year for STFX.");
        System.out.println(stfxKW.getKiloPerYear());
        System.out.println("This is the amount of carbon dioxide produced per year for STFX.");
        System.out.println(stfxKW.getCO2PerYear());
        System.out.println("This is the amount of carbon dioxide a student produces at STFX.");
        System.out.println(stfxKW.getCO2PerStudent());
        System.out.println("This is the amount of trees needed to compensate for the amount of carbon dioxide produced.");
        System.out.println(stfxKW.getNumberTrees());

        // example of toString method working
        System.out.println(stfxKW.toString());
    }
}
