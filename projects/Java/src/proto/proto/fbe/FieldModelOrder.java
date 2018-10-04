// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package proto.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import proto.*;

// Fast Binary Encoding Order field model class
public final class FieldModelOrder extends FieldModel
{
    public final FieldModelInt32 uid;
    public final FieldModelString symbol;
    public final FieldModelOrderSide side;
    public final FieldModelOrderType type;
    public final FieldModelDouble price;
    public final FieldModelDouble volume;

    public FieldModelOrder(Buffer buffer, long offset)
    {
        super(buffer, offset);
        uid = new FieldModelInt32(buffer, 4 + 4);
        symbol = new FieldModelString(buffer, uid.FBEOffset() + uid.FBESize());
        side = new FieldModelOrderSide(buffer, symbol.FBEOffset() + symbol.FBESize());
        type = new FieldModelOrderType(buffer, side.FBEOffset() + side.FBESize());
        price = new FieldModelDouble(buffer, type.FBEOffset() + type.FBESize());
        volume = new FieldModelDouble(buffer, price.FBEOffset() + price.FBESize());
    }

    // Get the field size
    @Override
    public long FBESize() { return 4; }
    // Get the field body size
    public long FBEBody()
    {
        long fbeResult = 4 + 4
            + uid.FBESize()
            + symbol.FBESize()
            + side.FBESize()
            + type.FBESize()
            + price.FBESize()
            + volume.FBESize()
            ;
        return fbeResult;
    }
    // Get the field extra size
    @Override
    public long FBEExtra()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(FBEOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4) > _buffer.getSize()))
            return 0;

        _buffer.shift(fbeStructOffset);

        long fbeResult = FBEBody()
            + uid.FBEExtra()
            + symbol.FBEExtra()
            + side.FBEExtra()
            + type.FBEExtra()
            + price.FBEExtra()
            + volume.FBEExtra()
            ;

        _buffer.unshift(fbeStructOffset);

        return fbeResult;
    }
    // Get the field type
    public static final long FBETypeConst = 1;
    public long FBEType() { return FBETypeConst; }

    // Check if the struct value is valid
    @Override
    public boolean verify() { return verify(true); }
    public boolean verify(boolean fbeVerifyType)
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return true;

        int fbeStructOffset = readInt32(FBEOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return false;

        int fbeStructSize = readInt32(fbeStructOffset);
        if (fbeStructSize < 4 + 4)
            return false;

        int fbeStructType = readInt32(fbeStructOffset + 4);
        if (fbeVerifyType && (fbeStructType != FBEType()))
            return false;

        _buffer.shift(fbeStructOffset);
        boolean fbeResult = verifyFields(fbeStructSize);
        _buffer.unshift(fbeStructOffset);
        return fbeResult;
    }

    // Check if the struct fields are valid
    public boolean verifyFields(long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + uid.FBESize()) > fbeStructSize)
            return true;
        if (!uid.verify())
            return false;
        fbeCurrentSize += uid.FBESize();

        if ((fbeCurrentSize + symbol.FBESize()) > fbeStructSize)
            return true;
        if (!symbol.verify())
            return false;
        fbeCurrentSize += symbol.FBESize();

        if ((fbeCurrentSize + side.FBESize()) > fbeStructSize)
            return true;
        if (!side.verify())
            return false;
        fbeCurrentSize += side.FBESize();

        if ((fbeCurrentSize + type.FBESize()) > fbeStructSize)
            return true;
        if (!type.verify())
            return false;
        fbeCurrentSize += type.FBESize();

        if ((fbeCurrentSize + price.FBESize()) > fbeStructSize)
            return true;
        if (!price.verify())
            return false;
        fbeCurrentSize += price.FBESize();

        if ((fbeCurrentSize + volume.FBESize()) > fbeStructSize)
            return true;
        if (!volume.verify())
            return false;
        fbeCurrentSize += volume.FBESize();

        return true;
    }

    // Get the struct value (begin phase)
    public long getBegin()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(FBEOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + 4 + 4) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return 0;

        int fbeStructSize = readInt32(fbeStructOffset);
        assert (fbeStructSize >= 4 + 4) : "Model is broken!";
        if (fbeStructSize < 4 + 4)
            return 0;

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Get the struct value (end phase)
    public void getEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Get the struct value
    public Order get() { return get(new Order()); }
    public Order get(Order fbeValue)
    {
        long fbeBegin = getBegin();
        if (fbeBegin == 0)
            return fbeValue;

        int fbeStructSize = readInt32(0);
        getFields(fbeValue, fbeStructSize);
        getEnd(fbeBegin);
        return fbeValue;
    }

    // Get the struct fields values
    public void getFields(Order fbeValue, long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + uid.FBESize()) <= fbeStructSize)
            fbeValue.uid = uid.get();
        else
            fbeValue.uid = 0;
        fbeCurrentSize += uid.FBESize();

        if ((fbeCurrentSize + symbol.FBESize()) <= fbeStructSize)
            fbeValue.symbol = symbol.get();
        else
            fbeValue.symbol = "";
        fbeCurrentSize += symbol.FBESize();

        if ((fbeCurrentSize + side.FBESize()) <= fbeStructSize)
            fbeValue.side = side.get();
        else
            fbeValue.side = new OrderSide();
        fbeCurrentSize += side.FBESize();

        if ((fbeCurrentSize + type.FBESize()) <= fbeStructSize)
            fbeValue.type = type.get();
        else
            fbeValue.type = new OrderType();
        fbeCurrentSize += type.FBESize();

        if ((fbeCurrentSize + price.FBESize()) <= fbeStructSize)
            fbeValue.price = price.get((double)0.0d);
        else
            fbeValue.price = (double)0.0d;
        fbeCurrentSize += price.FBESize();

        if ((fbeCurrentSize + volume.FBESize()) <= fbeStructSize)
            fbeValue.volume = volume.get((double)0.0d);
        else
            fbeValue.volume = (double)0.0d;
        fbeCurrentSize += volume.FBESize();
    }

    // Set the struct value (begin phase)
    public long setBegin()
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeStructSize = (int)FBEBody();
        int fbeStructOffset = (int)(_buffer.allocate(fbeStructSize) - _buffer.getOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset <= 0) || ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) > _buffer.getSize()))
            return 0;

        write(FBEOffset(), fbeStructOffset);
        write(fbeStructOffset, fbeStructSize);
        write(fbeStructOffset + 4, (int)FBEType());

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Set the struct value (end phase)
    public void setEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Set the struct value
    public void set(Order fbeValue)
    {
        long fbeBegin = setBegin();
        if (fbeBegin == 0)
            return;

        setFields(fbeValue);
        setEnd(fbeBegin);
    }

    // Set the struct fields values
    public void setFields(Order fbeValue)
    {
        uid.set(fbeValue.uid);
        symbol.set(fbeValue.symbol);
        side.set(fbeValue.side);
        type.set(fbeValue.type);
        price.set(fbeValue.price);
        volume.set(fbeValue.volume);
    }
}
