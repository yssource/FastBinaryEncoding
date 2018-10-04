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

// Fast Binary Encoding FlagsSimple array field model class
public final class FieldModelArrayFlagsSimple extends FieldModel
{
    private final FieldModelFlagsSimple _model;
    private final long _size;

    public FieldModelArrayFlagsSimple(Buffer buffer, long offset, long size)
    {
        super(buffer, offset);
        _model = new FieldModelFlagsSimple(buffer, offset);
        _size = size;
    }

    // Get the field size
    @Override
    public long FBESize() { return _size * _model.FBESize(); }
    // Get the field extra size
    @Override
    public long FBEExtra() { return 0; }

    // Get the array offset
    public long getOffset() { return 0; }
    // Get the array size
    public long getSize() { return _size; }

    // Array index operator
    public FieldModelFlagsSimple getItem(long index)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        assert (index < _size) : "Index is out of bounds!";

        _model.FBEOffset(FBEOffset());
        _model.FBEShift(index * _model.FBESize());
        return _model;
    }

    // Check if the array is valid
    @Override
    public boolean verify()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return false;

        _model.FBEOffset(FBEOffset());
        for (long i = _size; i-- > 0;)
        {
            if (!_model.verify())
                return false;
            _model.FBEShift(_model.FBESize());
        }

        return true;
    }

    // Get the array
    public FlagsSimple[] get()
    {
        var values = new FlagsSimple[(int)_size];

        var fbeModel = getItem(0);
        for (long i = 0; i < _size; i++)
        {
            values[(int)i] = fbeModel.get();
            fbeModel.FBEShift(fbeModel.FBESize());
        }
        return values;
    }

    // Get the array
    public void get(FlagsSimple[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        var fbeModel = getItem(0);
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            values[(int)i] = fbeModel.get();
            fbeModel.FBEShift(fbeModel.FBESize());
        }
    }

    // Get the array as ArrayList
    public void get(ArrayList<FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();
        values.ensureCapacity((int)_size);

        var fbeModel = getItem(0);
        for (long i = _size; i-- > 0;)
        {
            FlagsSimple value = fbeModel.get();
            values.add(value);
            fbeModel.FBEShift(fbeModel.FBESize());
        }
    }

    // Set the array
    public void set(FlagsSimple[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        var fbeModel = getItem(0);
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            fbeModel.set(values[(int)i]);
            fbeModel.FBEShift(fbeModel.FBESize());
        }
    }

    // Set the array as List
    public void set(ArrayList<FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        var fbeModel = getItem(0);
        for (long i = 0; (i < values.size()) && (i < _size); i++)
        {
            fbeModel.set(values.get((int)i));
            fbeModel.FBEShift(fbeModel.FBESize());
        }
    }
}
