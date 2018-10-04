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

// Fast Binary Encoding FlagsSimple field model class
public final class FieldModelFlagsSimple extends FieldModel
{
    public FieldModelFlagsSimple(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long FBESize() { return 4; }

    // Get the value
    public FlagsSimple get() { return get(new FlagsSimple()); }
    public FlagsSimple get(FlagsSimple defaults)
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return defaults;

        return new FlagsSimple(readInt32(FBEOffset()));
    }

    // Set the value
    public void set(FlagsSimple value)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        write(FBEOffset(), value.getRaw());
    }
}
