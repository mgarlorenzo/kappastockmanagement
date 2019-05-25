package org.jbcnconf.realtime.datagrid.utils;

public class SkuUtil {
    public static final long TIPO_PRODUCTO_MULT = 1000000000000L;
    public static final long MODELO_MULT = 100000000L;
    public static final int CALIDAD_MULT = 100000;
    public static final int COLOR_MULT = 100;
    public static final int TIPO_PRODUCTO_MOD = 10;
    public static final int MODELO_MOD = 10000;
    public static final int CALIDAD_MOD = 1000;
    public static final int COLOR_MOD = 1000;
    public static final int TALLA_MOD = 100;

    public static long newPmcct(byte tipoProducto, short modelo, short calidad, short color, short talla)
    {
        return tipoProducto * 1000000000000L + modelo * 100000000L + calidad * 100000 + color * 100 + talla;
    }

    public static byte getTipoProducto(long pmcct)
    {
        return (byte)(int)(pmcct / 1000000000000L % 10L);
    }

    public static short getModelo(long pmcct)
    {
        return (short)(int)(pmcct / 100000000L % 10000L);
    }

    public static short getCalidad(long pmcct)
    {
        return (short)(int)(pmcct / 100000L % 1000L);
    }

    public static short getColor(long pmcct)
    {
        return (short)(int)(pmcct / 100L % 1000L);
    }

    public static short getTalla(long pmcct)
    {
        return (short)(int)(pmcct % 100L);
    }

    public static String getSku(long pmcct)
    {
        return String.format("%013d", new Object[] { Long.valueOf(pmcct) });
    }

    public static long getPMQ(long pmcct)
    {
        return pmcct / 100000L;
    }

    public static long getPMQC(long pmcct)
    {
        return pmcct / 100L;
    }
}

