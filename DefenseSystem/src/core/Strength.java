package core;

public enum Strength {
    LOW, MEDIUM, HIGH;

    public static Strength fromInt(int v) {
        return switch (v) {
            case 0 -> LOW;
            case 1 -> MEDIUM;
            case 2 -> HIGH;
            default -> MEDIUM;
        };
    }

    public int toInt() {
        return switch (this) {
            case LOW -> 0;
            case MEDIUM -> 1;
            case HIGH -> 2;
            default -> 1;
        };
    }

    @Override
    public String toString() {
        switch (this) {
            case LOW -> {
                return "LOW";
            }
            case MEDIUM -> {
                return "MEDIUM";
            }
            case HIGH -> {
                return "HIGH";
            }
        }
        return super.toString();
    }
}
