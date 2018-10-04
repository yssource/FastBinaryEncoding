// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package test;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import fbe.*;
import proto.*;

public enum EnumTypedEnum
{
    ENUM_VALUE_0((char)0 + 0)
    , ENUM_VALUE_1((char)'1' + 0)
    , ENUM_VALUE_2((char)'1' + 1)
    , ENUM_VALUE_3((char)'3' + 0)
    , ENUM_VALUE_4((char)'3' + 1)
    , ENUM_VALUE_5(ENUM_VALUE_3.getRaw())
    ;

    private byte value;

    EnumTypedEnum(byte value) { this.value = value; }
    EnumTypedEnum(int value) { this.value = (byte)value; }
    EnumTypedEnum(EnumTypedEnum value) { this.value = value.value; }

    public byte getRaw() { return value; }

    public static EnumTypedEnum mapValue(byte value) { return mapping.get(value); }

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

    private static final Map<Byte, EnumTypedEnum> mapping = new HashMap<>();
    static
    {
        for (var value : EnumTypedEnum.values())
            mapping.put(value.value, value);
    }
}
