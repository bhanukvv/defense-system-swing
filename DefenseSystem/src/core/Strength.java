package core;

public enum Strength {
    LOW, MEDIUM, HIGH;

    public static Strength fromInt(int v) {
        switch (v) {
            case 0: return LOW;
            case 1: return MEDIUM;
            case 2: return HIGH;
            default: return MEDIUM;
        }
    }

    public int toInt() {
        switch (this) {
            case LOW: return 0;
            case MEDIUM: return 1;
            case HIGH: return 2;
            default: return 1;
        }
    }

    @Override
    public String toString() {
        switch (this) {
            case LOW: return "LOW";
            case MEDIUM: return "MEDIUM";
            case HIGH: return "HIGH";
            default: return super.toString();
        }
    }
}
