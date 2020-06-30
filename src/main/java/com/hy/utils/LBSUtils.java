package com.hy.utils;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-06-12 08:33
 **/
public class LBSUtils {
    private static double x_pi = 52.35987755982988D;

    public LBSUtils() {
    }

    public static double[] bd_encrypt(double gg_lat, double gg_lon) {
        double bd_lat = 0.0D;
        double bd_lon = 0.0D;
        double[] location = new double[2];
        double z = Math.sqrt(gg_lon * gg_lon + gg_lat * gg_lat) + 2.0E-5D * Math.sin(gg_lat * x_pi);
        double theta = Math.atan2(gg_lat, gg_lon) + 3.0E-6D * Math.cos(gg_lon * x_pi);
        bd_lon = z * Math.cos(theta) + 0.0065D;
        bd_lat = z * Math.sin(theta) + 0.006D;
        location[0] = bd_lat;
        location[1] = bd_lon;
        return location;
    }

    public static double[] bd_decrypt(double bd_lat, double bd_lon) {
        double gg_lat = 0.0D;
        double gg_lon = 0.0D;
        double[] location = new double[2];
        double x = bd_lon - 0.0065D;
        double y = bd_lat - 0.006D;
        double z = Math.sqrt(x * x + y * y) - 2.0E-5D * Math.sin(y * x_pi);
        double theta = Math.atan2(y, x) - 3.0E-6D * Math.cos(x * x_pi);
        gg_lon = z * Math.cos(theta);
        gg_lat = z * Math.sin(theta);
        location[0] = gg_lat;
        location[1] = gg_lon;
        return location;
    }
}
