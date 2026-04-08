package packinterface.modelEntities;

import packinterface.modelServices.Color;
import packinterface.modelServices.Shape;

public abstract class AbstractShape implements Shape {
    Color color;

public AbstractShape() {}
public  AbstractShape(Color color) {
    this.color = color;
}

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
