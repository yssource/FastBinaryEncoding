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

public class StructMap implements Comparable<Object>
{
    public TreeMap<Integer, Byte> f1 = new TreeMap<Integer, Byte>();
    public TreeMap<Integer, Byte> f2 = new TreeMap<Integer, Byte>();
    public TreeMap<Integer, byte[]> f3 = new TreeMap<Integer, byte[]>();
    public TreeMap<Integer, byte[]> f4 = new TreeMap<Integer, byte[]>();
    public TreeMap<Integer, EnumSimple> f5 = new TreeMap<Integer, EnumSimple>();
    public TreeMap<Integer, EnumSimple> f6 = new TreeMap<Integer, EnumSimple>();
    public TreeMap<Integer, FlagsSimple> f7 = new TreeMap<Integer, FlagsSimple>();
    public TreeMap<Integer, FlagsSimple> f8 = new TreeMap<Integer, FlagsSimple>();
    public TreeMap<Integer, StructSimple> f9 = new TreeMap<Integer, StructSimple>();
    public TreeMap<Integer, StructSimple> f10 = new TreeMap<Integer, StructSimple>();

    public StructMap() {}

    public StructMap(TreeMap<Integer, Byte> f1, TreeMap<Integer, Byte> f2, TreeMap<Integer, byte[]> f3, TreeMap<Integer, byte[]> f4, TreeMap<Integer, EnumSimple> f5, TreeMap<Integer, EnumSimple> f6, TreeMap<Integer, FlagsSimple> f7, TreeMap<Integer, FlagsSimple> f8, TreeMap<Integer, StructSimple> f9, TreeMap<Integer, StructSimple> f10)
    {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
        this.f5 = f5;
        this.f6 = f6;
        this.f7 = f7;
        this.f8 = f8;
        this.f9 = f9;
        this.f10 = f10;
    }

    public StructMap(StructMap other)
    {
        this.f1 = other.f1;
        this.f2 = other.f2;
        this.f3 = other.f3;
        this.f4 = other.f4;
        this.f5 = other.f5;
        this.f6 = other.f6;
        this.f7 = other.f7;
        this.f8 = other.f8;
        this.f9 = other.f9;
        this.f10 = other.f10;
    }

    public StructMap clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new test.fbe.StructMapModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new test.fbe.StructMapModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object obj)
    {
        if (obj == null)
            return -1;

        if (!StructMap.class.isAssignableFrom(obj.getClass()))
            return -1;

        final StructMap other = (StructMap)obj;

        int result = 0;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;

        if (!StructMap.class.isAssignableFrom(obj.getClass()))
            return false;

        final StructMap other = (StructMap)obj;

        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("StructMap(");
        if (f1 != null)
        {
            boolean first = true;
            sb.append("f1=[").append(f1.size()).append("]<{");
            for (var item : f1.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                sb.append(item.getValue());
                first = false;
            }
            sb.append("}>");
        }
        if (f2 != null)
        {
            boolean first = true;
            sb.append(",f2=[").append(f2.size()).append("]<{");
            for (var item : f2.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                if (item.getValue() != null) sb.append(item.getValue()); else sb.append("null");
                first = false;
            }
            sb.append("}>");
        }
        if (f3 != null)
        {
            boolean first = true;
            sb.append(",f3=[").append(f3.size()).append("]<{");
            for (var item : f3.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                if (item.getValue() != null) sb.append("bytes[").append(item.getValue().length).append("]"); else sb.append("null");
                first = false;
            }
            sb.append("}>");
        }
        if (f4 != null)
        {
            boolean first = true;
            sb.append(",f4=[").append(f4.size()).append("]<{");
            for (var item : f4.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                if (item.getValue() != null) sb.append("bytes[").append(item.getValue().length).append("]"); else sb.append("null");
                first = false;
            }
            sb.append("}>");
        }
        if (f5 != null)
        {
            boolean first = true;
            sb.append(",f5=[").append(f5.size()).append("]<{");
            for (var item : f5.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                sb.append(item.getValue());
                first = false;
            }
            sb.append("}>");
        }
        if (f6 != null)
        {
            boolean first = true;
            sb.append(",f6=[").append(f6.size()).append("]<{");
            for (var item : f6.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                if (item.getValue() != null) sb.append(item.getValue()); else sb.append("null");
                first = false;
            }
            sb.append("}>");
        }
        if (f7 != null)
        {
            boolean first = true;
            sb.append(",f7=[").append(f7.size()).append("]<{");
            for (var item : f7.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                sb.append(item.getValue());
                first = false;
            }
            sb.append("}>");
        }
        if (f8 != null)
        {
            boolean first = true;
            sb.append(",f8=[").append(f8.size()).append("]<{");
            for (var item : f8.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                if (item.getValue() != null) sb.append(item.getValue()); else sb.append("null");
                first = false;
            }
            sb.append("}>");
        }
        if (f9 != null)
        {
            boolean first = true;
            sb.append(",f9=[").append(f9.size()).append("]<{");
            for (var item : f9.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                sb.append(item.getValue());
                first = false;
            }
            sb.append("}>");
        }
        if (f10 != null)
        {
            boolean first = true;
            sb.append(",f10=[").append(f10.size()).append("]<{");
            for (var item : f10.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                if (item.getValue() != null) sb.append(item.getValue()); else sb.append("null");
                first = false;
            }
            sb.append("}>");
        }
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return test.fbe.Json.getJsonEngine().toJson(this); }
    public static StructMap fromJson(String json) { return test.fbe.Json.getJsonEngine().fromJson(json, StructMap.class); }
}
