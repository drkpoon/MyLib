package com.user.derekpoon.trigolibrary;

/**
 *
 * Construct a triangle by SSS, SAS or ASA.  You can then read all sides, angles, perimeter and area of triangle.
 *
 * @author Derek Poon
 * @version 1.0.0
 * @since 18/9/2017.
 */

public class Triangle {
    private double sideA, sideB, sideC, angleA, angleB, angleC, perimeter, area;
    private boolean valid;

    /**
     *
     * <img src = "{@docRoot}/triangle.png" alt = "triangle">
     *
     * @param x    depends on construction type.
     * @param y    depends on construction type.
     * @param z    depends on construction type.
     * @param type SSS, SAS, ASA are defined.
     *             If SSS, x is side A, y is side B and z is side C.
     *             If SAS, x is side A, y is angle C and z is side B.
     *             If ASA, x is side A, y is side A and z is angle C.
     */
    public Triangle(double x, double y, double z, constructionType type) {
        switch (type) {
            case SSS:
                sideA = x;
                sideB = y;
                sideC = z;
                angleA = Math.toDegrees(Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC)));
                angleB = Math.toDegrees(Math.acos((sideA * sideA + sideC * sideC - sideB * sideB) / (2 * sideA * sideC)));
                angleC = Math.toDegrees(Math.acos((sideA * sideA + sideB * sideB - sideC * sideC) / (2 * sideA * sideB)));
                break;
            case SAS:
                sideA = x;
                angleC = y;
                sideB = z;
                sideC = Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(Math.toRadians(angleC)));
                angleA = Math.toDegrees(Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC)));
                angleB = Math.toDegrees(Math.acos((sideA * sideA + sideC * sideC - sideB * sideB) / (2 * sideA * sideC)));
                break;
            case ASA:
                angleB = x;
                angleC = z;
                sideA = y;
                angleA = 180 - x - z;
                sideB = (sideA / Math.sin(Math.toRadians(angleA))) * Math.sin(Math.toRadians(angleB));
                sideC = (sideA / Math.sin(Math.toRadians(angleA))) * Math.sin(Math.toRadians(angleC));
                break;
        }
        valid = (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
        if (valid) {
            perimeter = sideA + sideB + sideC;
            double s = 0.5f * perimeter;
            area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        } else {
            perimeter = -1;
            area = -1;
        }
    }

    /**
     * @return true if construction is valid.
     */
    private boolean isValid() {
        return valid;
    }

    private double getSideA() {
        return sideA;
    }

    private double getSideB() {
        return sideB;
    }

    private double getSideC() {
        return sideC;
    }

    private double getAngleA() {
        return angleA;
    }

    private double getAngleB() {
        return angleB;
    }

    private double getAngleC() {
        return angleC;
    }

    /**
     *
     * @return perimeter of triangle.  -1 if construction is invalid.
     */
    private double getPerimeter() {
        return perimeter;
    }

    /**
     *
     * @return area of triangle.  -1 if construction is invalid.
     */
    private double getArea() {
        return area;
    }

    @Override
    public String toString() {
        if (valid){
            return "Triangle{" +
                    "sideA=" + getSideA() +
                    ", sideB=" + getSideB() +
                    ", sideC=" + getSideC() +
                    ", angleA=" + getAngleA() +
                    ", angleB=" + getAngleB() +
                    ", angleC=" + getAngleC() +
                    ", perimeter=" + getPerimeter() +
                    ", area=" + getArea() +
                    ", valid=" + isValid() +
                    '}';
        }else {
            return "Construction is invalid.";
        }
    }

    /**
     * construction type of triangle.
     */
    public enum constructionType {
        /**
         * construct triangle by side, side, side.
         */
        SSS,
        /**
         * construct triangle by side, angle, side.
         */
        SAS,
        /**
         * construct triangle by angle, side, angle.
         */
        ASA
    }
}
