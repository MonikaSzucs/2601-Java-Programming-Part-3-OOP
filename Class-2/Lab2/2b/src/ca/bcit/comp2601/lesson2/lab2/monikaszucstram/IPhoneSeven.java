package ca.bcit.comp2601.lesson2.lab2.monikaszucstram;

import java.util.Objects;

/**
 * IPhoneSeven.java
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * Lab 2a and 2b
 *
 * @author Monika Szucs
 * @author Tram
 *
 * @version 1.0
 *
 */
class IPhoneSeven extends IPhone {
    private final boolean highResolutionCamera;
    private final int gigabytesOfMemory;

    /**
     * Constructor
     *
     * @param numberOfMinutesRemainingOnPhonePlan the number of minute that are left in the phone plan
     * @param carrier the carrier the phone is with
     * @param highResolutionCamera if the camera has high resolution or not
     * @param gigabytesOfMemory the amount of memory the phone has
     */
    IPhoneSeven(final double numberOfMinutesRemainingOnPhonePlan, final String carrier, final boolean highResolutionCamera, final int gigabytesOfMemory) {
        super(numberOfMinutesRemainingOnPhonePlan, carrier);
        this.highResolutionCamera = highResolutionCamera;
        this.gigabytesOfMemory = gigabytesOfMemory;
    }

    /**
     * Getter
     *
     * @return if the camera is high resolution or not
     */
    public boolean isHighResolutionCamera() {
        return highResolutionCamera;
    }

    /**
     * Getter
     *
     * @return how many gigabytes are in the phone
     */
    public int getGigabytesOfMemory() {
        return gigabytesOfMemory;
    }

    /**
     * Equals Method
     *
     * @param o grabbing the object of the class
     * @return if the phone is really an IPhone Seven or not
     */
    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }

        if(this == o) return true;


        if(!(o instanceof IPhoneSeven)) {
            return false;
        }

        IPhoneSeven iphoneSeven = (IPhoneSeven)o;
        return (this.highResolutionCamera == iphoneSeven.highResolutionCamera);
    }

    /**
     * hashCode Method
     *
     * @return the hashcode based on the high resolution check of the camera
     */
    @Override
    public int hashCode() {
        return Objects.hash(highResolutionCamera);
    }

    /**
     * toString method
     *
     * @return the sentence of the IPhone Sever containing the high resolution and gigabytes of memory
     */
    @Override
    public String toString() {
        return  super.toString() +
                "IPhoneSeven{" +
                ", highResolutionCamera=" + highResolutionCamera +
                ", gigabytesOfMemory='" + gigabytesOfMemory + '\'' +
                '}';
    }
}
