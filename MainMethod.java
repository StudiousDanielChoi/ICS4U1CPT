public class MainMethod
{
    public static void main(String args[])
    {
        KW loyolaKW = new KW(500, 20, 6, 21, 254, 1092);

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

        System.out.println(loyolaKW.toString());

        loyolaKW.changeLightbulb(100);

        System.out.println(loyolaKW.toString());
        
        KW gonzagaKW = new KW(1324, 40, 6, 21, 254, 1503);
        System.out.println("This is the amount of kilowatts per day for Loyola.");
        System.out.println(gonzagaKW.getKiloPerDay());
        System.out.println("This is the amount of kilowatts per month for Loyola.");
        System.out.println(gonzagaKW.getKiloPerMonth());
        System.out.println("This is the amount of kilowatts per year for Loyola.");
        System.out.println(gonzagaKW.getKiloPerYear());
        System.out.println("This is the amount of carbon dioxide produced per year for Loyola.");
        System.out.println(gonzagaKW.getCO2PerYear());
        System.out.println("This is the amount of carbon dioxide a student produces at Loyola.");
        System.out.println(gonzagaKW.getCO2PerStudent());
        System.out.println("This is the amount of trees needed to compensate for the amount of carbon dioxide produced.");
        System.out.println(gonzagaKW.getNumberTrees());

        System.out.println(gonzagaKW.toString());
        
        KW stfxKW = new KW(3202, 40, 6, 21, 254, 2321);
        System.out.println("This is the amount of kilowatts per day for Loyola.");
        System.out.println(stfxaKW.getKiloPerDay());
        System.out.println("This is the amount of kilowatts per month for Loyola.");
        System.out.println(stfxKW.getKiloPerMonth());
        System.out.println("This is the amount of kilowatts per year for Loyola.");
        System.out.println(stfxKW.getKiloPerYear());
        System.out.println("This is the amount of carbon dioxide produced per year for Loyola.");
        System.out.println(stfxKW.getCO2PerYear());
        System.out.println("This is the amount of carbon dioxide a student produces at Loyola.");
        System.out.println(stfxKW.getCO2PerStudent());
        System.out.println("This is the amount of trees needed to compensate for the amount of carbon dioxide produced.");
        System.out.println(stfxKW.getNumberTrees());

        System.out.println(stfxKW.toString());
    }
}
