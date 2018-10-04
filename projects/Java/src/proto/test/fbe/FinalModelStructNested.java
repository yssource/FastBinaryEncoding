// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding StructNested final model class
public final class FinalModelStructNested extends FinalModel
{
    public final FinalModelStructOptional parent;
    public final FinalModelEnumSimple f1000;
    public final FinalModelOptionalEnumSimple f1001;
    public final FinalModelEnumTyped f1002;
    public final FinalModelOptionalEnumTyped f1003;
    public final FinalModelFlagsSimple f1004;
    public final FinalModelOptionalFlagsSimple f1005;
    public final FinalModelFlagsTyped f1006;
    public final FinalModelOptionalFlagsTyped f1007;
    public final FinalModelStructSimple f1008;
    public final FinalModelOptionalStructSimple f1009;
    public final FinalModelStructOptional f1010;
    public final FinalModelOptionalStructOptional f1011;

    public FinalModelStructNested(Buffer buffer, long offset)
    {
        super(buffer, offset);
        parent = new FinalModelStructOptional(buffer, 0);
        f1000 = new FinalModelEnumSimple(buffer, 0);
        f1001 = new FinalModelOptionalEnumSimple(buffer, 0);
        f1002 = new FinalModelEnumTyped(buffer, 0);
        f1003 = new FinalModelOptionalEnumTyped(buffer, 0);
        f1004 = new FinalModelFlagsSimple(buffer, 0);
        f1005 = new FinalModelOptionalFlagsSimple(buffer, 0);
        f1006 = new FinalModelFlagsTyped(buffer, 0);
        f1007 = new FinalModelOptionalFlagsTyped(buffer, 0);
        f1008 = new FinalModelStructSimple(buffer, 0);
        f1009 = new FinalModelOptionalStructSimple(buffer, 0);
        f1010 = new FinalModelStructOptional(buffer, 0);
        f1011 = new FinalModelOptionalStructOptional(buffer, 0);
    }

    // Get the allocation size
    public long FBEAllocationSize(StructNested fbeValue)
    {
        long fbeResult = 0
            + parent.FBEAllocationSize(fbeValue)
            + f1000.FBEAllocationSize(fbeValue.f1000)
            + f1001.FBEAllocationSize(fbeValue.f1001)
            + f1002.FBEAllocationSize(fbeValue.f1002)
            + f1003.FBEAllocationSize(fbeValue.f1003)
            + f1004.FBEAllocationSize(fbeValue.f1004)
            + f1005.FBEAllocationSize(fbeValue.f1005)
            + f1006.FBEAllocationSize(fbeValue.f1006)
            + f1007.FBEAllocationSize(fbeValue.f1007)
            + f1008.FBEAllocationSize(fbeValue.f1008)
            + f1009.FBEAllocationSize(fbeValue.f1009)
            + f1010.FBEAllocationSize(fbeValue.f1010)
            + f1011.FBEAllocationSize(fbeValue.f1011)
            ;
        return fbeResult;
    }

    // Get the field type
    public static final long FBETypeConst = 112;
    public long FBEType() { return FBETypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(FBEOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(FBEOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        long fbeCurrentOffset = 0;
        long fbeFieldSize = 0;

        parent.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = parent.verifyFields();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1000.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1000.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1001.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1001.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1002.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1002.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1003.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1003.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1004.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1004.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1005.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1005.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1006.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1006.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1007.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1007.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1008.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1008.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1009.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1009.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1010.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1010.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f1011.FBEOffset(fbeCurrentOffset);
        fbeFieldSize = f1011.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public StructNested get(Size fbeSize) { return get(fbeSize, new StructNested()); }
    public StructNested get(Size fbeSize, StructNested fbeValue)
    {
        _buffer.shift(FBEOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(FBEOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(StructNested fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        parent.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = parent.getFields(fbeValue);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1000.FBEOffset(fbeCurrentOffset);
        fbeValue.f1000 = f1000.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1001.FBEOffset(fbeCurrentOffset);
        fbeValue.f1001 = f1001.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1002.FBEOffset(fbeCurrentOffset);
        fbeValue.f1002 = f1002.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1003.FBEOffset(fbeCurrentOffset);
        fbeValue.f1003 = f1003.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1004.FBEOffset(fbeCurrentOffset);
        fbeValue.f1004 = f1004.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1005.FBEOffset(fbeCurrentOffset);
        fbeValue.f1005 = f1005.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1006.FBEOffset(fbeCurrentOffset);
        fbeValue.f1006 = f1006.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1007.FBEOffset(fbeCurrentOffset);
        fbeValue.f1007 = f1007.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1008.FBEOffset(fbeCurrentOffset);
        fbeValue.f1008 = f1008.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1009.FBEOffset(fbeCurrentOffset);
        fbeValue.f1009 = f1009.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1010.FBEOffset(fbeCurrentOffset);
        fbeValue.f1010 = f1010.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1011.FBEOffset(fbeCurrentOffset);
        fbeValue.f1011 = f1011.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(StructNested fbeValue)
    {
        _buffer.shift(FBEOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(FBEOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(StructNested fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        parent.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = parent.setFields(fbeValue);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1000.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1000.set(fbeValue.f1000);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1001.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1001.set(fbeValue.f1001);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1002.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1002.set(fbeValue.f1002);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1003.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1003.set(fbeValue.f1003);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1004.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1004.set(fbeValue.f1004);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1005.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1005.set(fbeValue.f1005);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1006.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1006.set(fbeValue.f1006);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1007.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1007.set(fbeValue.f1007);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1008.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1008.set(fbeValue.f1008);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1009.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1009.set(fbeValue.f1009);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1010.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1010.set(fbeValue.f1010);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f1011.FBEOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1011.set(fbeValue.f1011);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
