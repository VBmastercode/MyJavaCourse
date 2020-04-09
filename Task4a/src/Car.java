public class Car {
        public String type;
        public int prodyear;
        public int enginecc;

    public Car (String type, int prodyear, int enginecc) {
        this.type = type;
        this.prodyear = prodyear;
        this.enginecc = enginecc;
    }

        public int getYear () {
        return this.prodyear;
        }

    @Override
        public String toString() {
        return "Car " + type + ", production year =" + prodyear + ", enginecc =" + enginecc;
        }
}
