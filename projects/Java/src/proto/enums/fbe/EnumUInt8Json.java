// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package enums;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import fbe.*;

import com.google.gson.*;

public final class EnumUInt8Json implements JsonSerializer<EnumUInt8>, JsonDeserializer<EnumUInt8>
{
    @Override
    public JsonElement serialize(EnumUInt8 src, Type typeOfSrc, JsonSerializationContext context)
    {
        return new JsonPrimitive(src.getRaw());
    }

    @Override
    public EnumUInt8 deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        return new EnumUInt8(json.getAsJsonPrimitive().getAsByte());
    }
}
