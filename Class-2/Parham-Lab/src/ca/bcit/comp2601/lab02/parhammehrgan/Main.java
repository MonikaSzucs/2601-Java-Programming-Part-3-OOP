package ca.bcit.comp2601.lab02.parhammehrgan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Parham Mehrgan
 * @version 1.0
 * @2022–09-23
 */
public class Main
{
    private static final double MINS_REMAINING_EQUALS_THRESHOLD = 10.0;

    public static void main(final String[] args)
    {
        IDevice       d1;
        IDevice       d2;
        IDevice       d3;
        IDevice       d4;
        IPhone        d5;
        IPhone        d6;
        IPhone        d7;
        IPhone        d8;
        double        differenceMinsRemaining;
        List<IDevice> idevices;

        d1 = new IPod(10, 80);
        d2 = new IPod(12, 80);
        d3 = new IPad(true, "15.7");
        d4 = new IPad(false, "15.7");
        d5 = new IPhone(20, "Bell");
        d6 = new IPhone(31, "Fido");
        d7 = new IPhoneSeven(30, "Freedom", true,
                256);
        d8 = new IPhoneSeven(40, "Telus", true,
                256);

        idevices = new ArrayList<>();
        idevices.add(d1);
        idevices.add(d2);
        idevices.add(d3);
        idevices.add(d4);
        idevices.add(d5);
        idevices.add(d6);
        idevices.add(d7);
        idevices.add(d8);

        System.out.println(d1.equals(d2));   // comparing iPods
        System.out.println(d3.equals(d4));   // comparing iPads
        System.out.println(d5.equals(d6));   // comparing iPhones

        // comparing iPhoneSevens
        differenceMinsRemaining = Math.abs(d7.getMinutesRemaining() - d8.getMinutesRemaining());
        if(differenceMinsRemaining <= MINS_REMAINING_EQUALS_THRESHOLD)
        {
            System.out.println(d7.equals(d8));
        }
        else
        {
            System.out.println("false");
        }

        System.out.println();
        for(IDevice d: idevices)
        {
            d.printPurpose();
            System.out.println(d);
        }
    }
}
