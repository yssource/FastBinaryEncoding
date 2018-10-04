// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package enums;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import fbe.*;

public final class EnumInt64 implements Comparable<EnumInt64>
{
    public static final EnumInt64 ENUM_VALUE_0 = new EnumInt64(EnumInt64Enum.ENUM_VALUE_0);
    public static final EnumInt64 ENUM_VALUE_1 = new EnumInt64(EnumInt64Enum.ENUM_VALUE_1);
    public static final EnumInt64 ENUM_VALUE_2 = new EnumInt64(EnumInt64Enum.ENUM_VALUE_2);
    public static final EnumInt64 ENUM_VALUE_3 = new EnumInt64(EnumInt64Enum.ENUM_VALUE_3);
    public static final EnumInt64 ENUM_VALUE_4 = new EnumInt64(EnumInt64Enum.ENUM_VALUE_4);
    public static final EnumInt64 ENUM_VALUE_5 = new EnumInt64(EnumInt64Enum.ENUM_VALUE_5);

    private EnumInt64Enum value = EnumInt64Enum.values()[0];

    public EnumInt64() {}
    public EnumInt64(long value) { setEnum(value); }
    public EnumInt64(EnumInt64Enum value) { setEnum(value); }
    public EnumInt64(EnumInt64 value) { setEnum(value); }

    public EnumInt64Enum getEnum() { return value; }
    public long getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((long)0); }

    public void setEnum(long value) { this.value = EnumInt64Enum.mapValue(value); }
    public void setEnum(EnumInt64Enum value) { this.value = value; }
    public void setEnum(EnumInt64 value) { this.value = value.value; }

    @Override
    public int compareTo(EnumInt64 other)
    {
        if (value == null)
            return -1;
        if (other.value == null)
            return 1;
        return (int)(value.getRaw() - other.value.getRaw());
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;

        if (!EnumInt64.class.isAssignableFrom(obj.getClass()))
            return false;

        final EnumInt64 other = (EnumInt64)obj;

        if ((value == null) || (other.value == null))
            return false;
        if (value.getRaw() != other.value.getRaw())
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + ((value != null) ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() { return (value != null) ? value.toString() : "<unknown>"; }
}
