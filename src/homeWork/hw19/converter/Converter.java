package homeWork.hw19.converter;

public class Converter {
    private String name;

    public Converter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int convertToInt(byte b) {
        return (int) b;
    }

    public int convertToInt(short s) {
        return (int) s;
    }

    public int convertToInt(int i) {
        return i;
    }

    public int convertToInt(long l) {
        return (int) l;
    }

    public int convertToInt(char c) {
        return (int) c;
    }

    public int convertToInt(float f) {
        return (int) f;
    }

    public int convertToInt(double d) {
        return (int) d;
    }

    public int convertToInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            if (s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false")) {
                System.out.println("Cannot convert boolean to int");
            } else {
                System.out.println("Cannot convert " + s + " to int");
            }
            return 0;
        }
    }

    public double convertToDouble(byte b) {
        return (double) b;
    }

    public double convertToDouble(short s) {
        return (double) s;
    }

    public double convertToDouble(int i) {
        return (double) i;
    }

    public double convertToDouble(long l) {
        return (double) l;
    }

    public double convertToDouble(char c) {
        return (double) c;
    }

    public double convertToDouble(float f) {
        return (double) f;
    }

    public double convertToDouble(double d) {
        return d;
    }

    public double convertToDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            if (s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false")) {
                System.out.println("Cannot convert boolean to double");
            } else {
                System.out.println("Cannot convert " + s + " to double");
            }
            return 0.0;
        }
    }

    public String convertToString(byte b) {
        return String.valueOf(b);
    }

    public String convertToString(short s) {
        return String.valueOf(s);
    }

    public String convertToString(int i) {
        return String.valueOf(i);
    }

    public String convertToString(long l) {
        return String.valueOf(l);
    }

    public String convertToString(char c) {
        return String.valueOf(c);
    }

    public String convertToString(boolean b) {
        return String.valueOf(b);
    }

    public String convertToString(float f) {
        return String.valueOf(f);
    }

    public String convertToString(double d) {
        return String.valueOf(d);
    }

    public String convertToString(String s) {
        return s;
    }
}
