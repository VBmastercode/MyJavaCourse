public class Plant {

    public enum Color {White, Red, Blue}

    public enum Type {Rose, Tulip, Sunflower}

    private final Type type;
    private final Color color;
    private final int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Type t = typeStrToEnum(type);
        Color c = colorStrToEnum(color);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.Blue;
            case "red":
                return Color.Red;
            case "white":
                return Color.White;
            default:
                throw new ColorException("Input only color blue, red or white");
        }
    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "rose":
                return Type.Rose;
            case "tulip":
                return Type.Tulip;
            case "sunflower":
                return Type.Sunflower;
            default:
                throw new TypeException("Input only rose, tulip or sunflower");
        }
    }

}

class ColorException extends Exception {
    public ColorException(String arg0) {
        super(arg0);
    }
}

class TypeException extends Exception{
    public TypeException(String arg0) {
        super(arg0);
    }
}


