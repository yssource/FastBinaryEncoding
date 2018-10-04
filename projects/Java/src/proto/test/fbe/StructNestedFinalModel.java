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
public final class StructNestedFinalModel extends Model
{
    private final FinalModelStructNested _model;

    public StructNestedFinalModel() { _model = new FinalModelStructNested(getBuffer(), 8); }
    public StructNestedFinalModel(Buffer buffer) { super(buffer); _model = new FinalModelStructNested(getBuffer(), 8); }

    // Get the model type
    public static final long FBETypeConst = FinalModelStructNested.FBETypeConst;
    public long FBEType() { return FBETypeConst; }

    // Check if the struct value is valid
    public boolean verify()
    {
        if ((getBuffer().getOffset() + _model.FBEOffset()) > getBuffer().getSize())
            return false;

        int fbeStructSize = readInt32(_model.FBEOffset() - 8);
        int fbeStructType = readInt32(_model.FBEOffset() - 4);
        if ((fbeStructSize <= 0) || (fbeStructType != FBEType()))
            return false;

        return ((8 + _model.verify()) == fbeStructSize);
    }

    // Serialize the struct value
    public long serialize(StructNested value)
    {
        long fbeInitialSize = getBuffer().getSize();

        int fbeStructType = (int)FBEType();
        int fbeStructSize = (int)(8 + _model.FBEAllocationSize(value));
        int fbeStructOffset = (int)(getBuffer().allocate(fbeStructSize) - getBuffer().getOffset());
        assert ((getBuffer().getOffset() + fbeStructOffset + fbeStructSize) <= getBuffer().getSize()) : "Model is broken!";
        if ((getBuffer().getOffset() + fbeStructOffset + fbeStructSize) > getBuffer().getSize())
            return 0;

        fbeStructSize = (int)(8 + _model.set(value));
        getBuffer().resize(fbeInitialSize + fbeStructSize);

        write(_model.FBEOffset() - 8, fbeStructSize);
        write(_model.FBEOffset() - 4, fbeStructType);

        return fbeStructSize;
    }

    // Deserialize the struct value
    public StructNested deserialize() { var value = new StructNested(); deserialize(value); return value; }
    public long deserialize(StructNested value)
    {
        assert ((getBuffer().getOffset() + _model.FBEOffset()) <= getBuffer().getSize()) : "Model is broken!";
        if ((getBuffer().getOffset() + _model.FBEOffset()) > getBuffer().getSize())
            return 0;

        long fbeStructSize = readInt32(_model.FBEOffset() - 8);
        long fbeStructType = readInt32(_model.FBEOffset() - 4);
        assert ((fbeStructSize > 0) && (fbeStructType == FBEType())) : "Model is broken!";
        if ((fbeStructSize <= 0) || (fbeStructType != FBEType()))
            return 8;

        var fbeSize = new Size(0);
        value = _model.get(fbeSize, value);
        return 8 + fbeSize.value;
    }

    // Move to the next struct value
    public void next(long prev)
    {
        _model.FBEShift(prev);
    }
}
