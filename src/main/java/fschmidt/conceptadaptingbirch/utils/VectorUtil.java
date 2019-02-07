package fschmidt.conceptadaptingbirch.utils;

import static java.lang.Math.*;
import java.util.logging.Logger;

/**
 * @author fschmidt
 */
public class VectorUtil {

    static final Logger logger = Logger.getLogger(VectorUtil.class.getName());

    public static double[] sumVec(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }

    public static double[] subVec(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = v1[i] - v2[i];
        }
        return result;
    }

    public static double[] multVec(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = v1[i] * v2[i];
        }
        return result;
    }

    public static double[] multVec(double[] v1, double d) {
        double[] result = new double[v1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = v1[i] * d;
        }
        return result;
    }

    public static double[] divVec(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = v1[i] / v2[i];
        }
        return result;
    }

    public static double[] divVec(double[] v1, double d) {
        double[] result = new double[v1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = v1[i] / d;
        }
        return result;
    }

    public static double[] sqrtVec(double[] v) {
        double[] result = new double[v.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = sqrt(v[i]);
        }
        return result;
    }

    public static double lengthVec(double[] v) {
        double result = 0.0;
        for (double aV : v) {
            result += pow(aV, 2);
        }
        return sqrt(result);
    }

    public static double[] absVec(double[] v) {
        double[] result = new double[v.length];
        for (int i = 0; i < v.length; i++) {
            result[i] = abs(v[i]);
        }
        return result;
    }

}
