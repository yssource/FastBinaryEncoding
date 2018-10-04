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

// Fast Binary Encoding OrderSide field model class
public final class FieldModelOrderSide extends FieldModel
{
    public FieldModelOrderSide(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long FBESize() { return 1; }

    // Get the value
    public OrderSide get() { return get(new OrderSide()); }
    public OrderSide get(OrderSide defaults)
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return defaults;

        return new OrderSide(readByte(FBEOffset()));
    }

    // Set the value
    public void set(OrderSide value)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        write(FBEOffset(), value.getRaw());
    }
}
