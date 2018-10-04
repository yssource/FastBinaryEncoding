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

// Fast Binary Encoding String->OptionalFlagsSimple map field model class
public final class FieldModelMapStringOptionalFlagsSimple extends FieldModel
{
    private final FieldModelString _modelKey;
    private final FieldModelOptionalFlagsSimple _modelValue;

    public FieldModelMapStringOptionalFlagsSimple(Buffer buffer, long offset)
    {
        super(buffer, offset);
        _modelKey = new FieldModelString(buffer, offset);
        _modelValue = new FieldModelOptionalFlagsSimple(buffer, offset);
    }

    // Get the field size
    @Override
    public long FBESize() { return 4; }
    // Get the field extra size
    @Override
    public long FBEExtra()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeMapOffset = readInt32(FBEOffset());
        if ((fbeMapOffset == 0) || ((_buffer.getOffset() + fbeMapOffset + 4) > _buffer.getSize()))
            return 0;

        int fbeMapSize = readInt32(fbeMapOffset);

        long fbeResult = 4;
        _modelKey.FBEOffset(fbeMapOffset + 4);
        _modelValue.FBEOffset(fbeMapOffset + 4 + _modelKey.FBESize());
        for (int i = fbeMapSize; i-- > 0;)
        {
            fbeResult += _modelKey.FBESize() + _modelKey.FBEExtra();
            _modelKey.FBEShift(_modelKey.FBESize() + _modelValue.FBESize());

            fbeResult += _modelValue.FBESize() + _modelValue.FBEExtra();
            _modelValue.FBEShift(_modelKey.FBESize() + _modelValue.FBESize());
        }
        return fbeResult;
    }

    // Get the map offset
    public long getOffset()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeMapOffset = readInt32(FBEOffset());
        return fbeMapOffset;
    }

    // Get the map size
    public long getSize()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeMapOffset = readInt32(FBEOffset());
        if ((fbeMapOffset == 0) || ((_buffer.getOffset() + fbeMapOffset + 4) > _buffer.getSize()))
            return 0;

        int fbeMapSize = readInt32(fbeMapOffset);
        return fbeMapSize;
    }

    // Map index operator
    public Pair<FieldModelString, FieldModelOptionalFlagsSimple> getItem(long index)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";

        int fbeMapOffset = readInt32(FBEOffset());
        assert ((fbeMapOffset > 0) && ((_buffer.getOffset() + fbeMapOffset + 4) <= _buffer.getSize())) : "Model is broken!";

        int fbeMapSize = readInt32(fbeMapOffset);
        assert (index < fbeMapSize) : "Index is out of bounds!";

        _modelKey.FBEOffset(fbeMapOffset + 4);
        _modelValue.FBEOffset(fbeMapOffset + 4 + _modelKey.FBESize());
        _modelKey.FBEShift(index * (_modelKey.FBESize() + _modelValue.FBESize()));
        _modelValue.FBEShift(index * (_modelKey.FBESize() + _modelValue.FBESize()));
        return new Pair<FieldModelString, FieldModelOptionalFlagsSimple>(_modelKey, _modelValue);
    }

    // Resize the map and get its first model
    public Pair<FieldModelString, FieldModelOptionalFlagsSimple> resize(long size)
    {
        _modelKey.FBEOffset(FBEOffset());
        _modelValue.FBEOffset(FBEOffset() + _modelKey.FBESize());

        int fbeMapSize = (int)(size * (_modelKey.FBESize() + _modelValue.FBESize()));
        int fbeMapOffset = (int)(_buffer.allocate(4 + fbeMapSize) - _buffer.getOffset());
        assert ((fbeMapOffset > 0) && ((_buffer.getOffset() + fbeMapOffset + 4) <= _buffer.getSize())) : "Model is broken!";

        write(FBEOffset(), fbeMapOffset);
        write(fbeMapOffset, (int)size);
        write(fbeMapOffset + 4, (byte)0, fbeMapSize);

        _modelKey.FBEOffset(fbeMapOffset + 4);
        _modelValue.FBEOffset(fbeMapOffset + 4 + _modelKey.FBESize());
        return new Pair<FieldModelString, FieldModelOptionalFlagsSimple>(_modelKey, _modelValue);
    }

    // Check if the map is valid
    @Override
    public boolean verify()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return true;

        int fbeMapOffset = readInt32(FBEOffset());
        if (fbeMapOffset == 0)
            return true;

        if ((_buffer.getOffset() + fbeMapOffset + 4) > _buffer.getSize())
            return false;

        int fbeMapSize = readInt32(fbeMapOffset);

        _modelKey.FBEOffset(fbeMapOffset + 4);
        _modelValue.FBEOffset(fbeMapOffset + 4 + _modelKey.FBESize());
        for (int i = fbeMapSize; i-- > 0;)
        {
            if (!_modelKey.verify())
                return false;
            _modelKey.FBEShift(_modelKey.FBESize() + _modelValue.FBESize());
            if (!_modelValue.verify())
                return false;
            _modelValue.FBEShift(_modelKey.FBESize() + _modelValue.FBESize());
        }

        return true;
    }

    // Get the map as TreeMap
    public void get(TreeMap<String, FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        long fbeMapSize = getSize();
        if (fbeMapSize == 0)
            return;

        var fbeModel = getItem(0);
        for (long i = fbeMapSize; i-- > 0;)
        {
            String key = fbeModel.getKey().get();
            FlagsSimple value = fbeModel.getValue().get();
            values.put(key, value);
            fbeModel.getKey().FBEShift(fbeModel.getKey().FBESize() + fbeModel.getValue().FBESize());
            fbeModel.getValue().FBEShift(fbeModel.getKey().FBESize() + fbeModel.getValue().FBESize());
        }
    }

    // Get the map as HashMap
    public void get(HashMap<String, FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        long fbeMapSize = getSize();
        if (fbeMapSize == 0)
            return;

        var fbeModel = getItem(0);
        for (long i = fbeMapSize; i-- > 0;)
        {
            String key = fbeModel.getKey().get();
            FlagsSimple value = fbeModel.getValue().get();
            values.put(key, value);
            fbeModel.getKey().FBEShift(fbeModel.getKey().FBESize() + fbeModel.getValue().FBESize());
            fbeModel.getValue().FBEShift(fbeModel.getKey().FBESize() + fbeModel.getValue().FBESize());
        }
    }

    // Set the map as TreeMap
    public void set(TreeMap<String, FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        var fbeModel = resize(values.size());
        for (var value : values.entrySet())
        {
            fbeModel.getKey().set(value.getKey());
            fbeModel.getKey().FBEShift(fbeModel.getKey().FBESize() + fbeModel.getValue().FBESize());
            fbeModel.getValue().set(value.getValue());
            fbeModel.getValue().FBEShift(fbeModel.getKey().FBESize() + fbeModel.getValue().FBESize());
        }
    }

    // Set the vector as HashMap
    public void set(HashMap<String, FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        var fbeModel = resize(values.size());
        for (var value : values.entrySet())
        {
            fbeModel.getKey().set(value.getKey());
            fbeModel.getKey().FBEShift(fbeModel.getKey().FBESize() + fbeModel.getValue().FBESize());
            fbeModel.getValue().set(value.getValue());
            fbeModel.getValue().FBEShift(fbeModel.getKey().FBESize() + fbeModel.getValue().FBESize());
        }
    }
}
