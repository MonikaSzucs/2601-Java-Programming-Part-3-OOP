package ca.bcit.comp2601.lesson2.lab2.monikaszucstram;

import java.util.Objects;

abstract class IPhoneSeven extends ca.bcit.comp2601.lesson2.lab2.monikaszucstram.IPhone {
    private boolean highResolutionCamera;
    private int gigabytesOfMemory;

    IPhoneSeven(final String purpose, final double numberOfMinutesRemainingOnPhonePlan, final String carrier, final boolean highResolutionCamera, final int gigabytesOfMemory) {
        super(purpose, numberOfMinutesRemainingOnPhonePlan, carrier);
        this.highResolutionCamera = highResolutionCamera;
        this.gigabytesOfMemory = gigabytesOfMemory;
    }

    @Override
    public String toString() {
        return "IPhoneSeven{" +
                ", highResolutionCamera=" + highResolutionCamera +
                ", gigabytesOfMemory='" + gigabytesOfMemory + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }

        if(this == o) {
            return true;
        }

        if(!(o instanceof IPhoneSeven)) {
            return false;
        }

        IPhoneSeven iphoneSeven = (IPhoneSeven)o;
        return (this.highResolutionCamera == iphoneSeven.highResolutionCamera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(highResolutionCamera);
    }
}
