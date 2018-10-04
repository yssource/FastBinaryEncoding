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

public enum EnumInt64Enum
{
    ENUM_VALUE_0((long)0L + 0)
    , ENUM_VALUE_1((long)-9223372036854775807L + 0)
    , ENUM_VALUE_2((long)-9223372036854775807L + 1)
    , ENUM_VALUE_3((long)9223372036854775806L + 0)
    , ENUM_VALUE_4((long)9223372036854775806L + 1)
    , ENUM_VALUE_5(ENUM_VALUE_3.getRaw())
    ;

    private long value;

    EnumInt64Enum(long value) { this.value = value; }
    EnumInt64Enum(int value) { this.value = (long)value; }
    EnumInt64Enum(EnumInt64Enum value) { this.value = value.value; }

    public long getRaw() { return value; }

    public static EnumInt64Enum mapValue(long value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0";
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1";
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2";
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3";
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4";
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5";
        return "<unknown>";
    }

    private static final Map<Long, EnumInt64Enum> mapping = new HashMap<>();
    static
    {
        for (var value : EnumInt64Enum.values())
            mapping.put(value.value, value);
    }
}
