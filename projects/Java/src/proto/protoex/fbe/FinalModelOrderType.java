// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package protoex.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import protoex.*;

// Fast Binary Encoding OrderType final model class
public final class FinalModelOrderType extends FinalModel
{
    public FinalModelOrderType(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long FBEAllocationSize(OrderType value) { return FBESize(); }

    // Get the final size
    @Override
    public long FBESize() { return 1; }

    // Check if the value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return Long.MAX_VALUE;

        return FBESize();
    }

    // Get the value
    public OrderType get(Size size)
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return new OrderType();

        size.value = FBESize();
        return new OrderType(readByte(FBEOffset()));
    }

    // Set the value
    public long set(OrderType value)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        write(FBEOffset(), value.getRaw());
        return FBESize();
    }
}
