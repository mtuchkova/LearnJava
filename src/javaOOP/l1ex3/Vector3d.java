package javaOOP.l1ex3;

public class Vector3d {


        private int coordinateX;
        private int coordinateY;
        private int coordinateZ;
        private double resultScalarProduct;


        public Vector3d(int coordinateX, int coordinateY, int coordinateZ) {
            this.coordinateX = coordinateX;
            this.coordinateY = coordinateY;
            this.coordinateZ = coordinateZ;
        }


        public Vector3d() {
        }

        public int getCoordinateX() {
            return coordinateX;
        }

        public int getCoordinateY() {
            return coordinateY;
        }

        public int getCoordinateZ() {
            return coordinateZ;
        }

        public void setCoordinateX(int coordinateX) {
            this.coordinateX = coordinateX;
        }

        public void setCoordinateY(int coordinateY) {
            this.coordinateY = coordinateY;
        }

        public void setCoordinateZ(int coordinateZ) {
            this.coordinateZ = coordinateZ;
        }

        @Override
        public String toString() {
            return "Vector3d{" +
                    "coordinateX=" + coordinateX +
                    ", coordinateY=" + coordinateY +
                    ", coordinateZ=" + coordinateZ +
                    ", coordinateZ=" + coordinateZ +
                    '}';
        }

        public Vector3d vectorAddition(Vector3d c, Vector3d a, Vector3d b) {

            c.coordinateX = a.coordinateX + b.coordinateX;
            c.coordinateY = a.coordinateY + b.coordinateY;
            c.coordinateZ = a.coordinateZ + b.coordinateZ;

            return c;
        }

        public double scalarProduct(Vector3d a) {

            resultScalarProduct = (coordinateX * a.coordinateX) + (coordinateY * a.coordinateY) + (coordinateZ * a.coordinateZ);

            return resultScalarProduct;
        }

        public Vector3d vectorProduct(Vector3d c, Vector3d a, Vector3d b) {

            c.coordinateX = (a.coordinateY * b.coordinateZ) - (a.coordinateZ * b.coordinateY);
            c.coordinateY = (a.coordinateZ + b.coordinateX) - (a.coordinateX + b.coordinateZ);
            c.coordinateZ = (a.coordinateX + b.coordinateY) - (a.coordinateY + b.coordinateX);
            return c;
        }



}
