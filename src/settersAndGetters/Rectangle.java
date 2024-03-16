package settersAndGetters;

class Rectangle {
    double length = 0.0;
    double width = 0.0;

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }

    double getSquare() {
        return width * length;
    }

    void setLength(double l) {
        length = l;
    }
    void setWidth(double w) {
        if (w < 0) throw new Error();
        width = w;
    }
}
