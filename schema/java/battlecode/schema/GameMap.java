// automatically generated by the FlatBuffers compiler, do not modify

package battlecode.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * The map a round is played on.
 */
public final class GameMap extends Table {
  public static GameMap getRootAsGameMap(ByteBuffer _bb) { return getRootAsGameMap(_bb, new GameMap()); }
  public static GameMap getRootAsGameMap(ByteBuffer _bb, GameMap obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public GameMap __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * The name of a map.
   */
  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  /**
   * The bottom corner of the map.
   */
  public Vec minCorner() { return minCorner(new Vec()); }
  public Vec minCorner(Vec obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  /**
   * The top corner of the map.
   */
  public Vec maxCorner() { return maxCorner(new Vec()); }
  public Vec maxCorner(Vec obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  /**
   * The map symmetry: 0 for rotation, 1 for horizontal, 2 for vertical.
   */
  public int symmetry() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  /**
   * The bodies on the map.
   */
  public SpawnedBodyTable bodies() { return bodies(new SpawnedBodyTable()); }
  public SpawnedBodyTable bodies(SpawnedBodyTable obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * The random seed of the map.
   */
  public int randomSeed() { int o = __offset(14); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  /**
   * The walls on the map.
   */
  public boolean walls(int j) { int o = __offset(16); return o != 0 ? 0!=bb.get(__vector(o) + j * 1) : false; }
  public int wallsLength() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer wallsAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public ByteBuffer wallsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 16, 1); }
  /**
   * The clouds on the map.
   */
  public boolean clouds(int j) { int o = __offset(18); return o != 0 ? 0!=bb.get(__vector(o) + j * 1) : false; }
  public int cloudsLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer cloudsAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public ByteBuffer cloudsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 1); }
  /**
   * The currents on the map.
   */
  public int currents(int j) { int o = __offset(20); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int currentsLength() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer currentsAsByteBuffer() { return __vector_as_bytebuffer(20, 4); }
  public ByteBuffer currentsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 4); }
  /**
   * The island each square on the map belongs to.
   */
  public int islands(int j) { int o = __offset(22); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int islandsLength() { int o = __offset(22); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer islandsAsByteBuffer() { return __vector_as_bytebuffer(22, 4); }
  public ByteBuffer islandsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 22, 4); }
  /**
   * The resource type each square is.
   */
  public int resources(int j) { int o = __offset(24); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int resourcesLength() { int o = __offset(24); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer resourcesAsByteBuffer() { return __vector_as_bytebuffer(24, 4); }
  public ByteBuffer resourcesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 24, 4); }

  public static void startGameMap(FlatBufferBuilder builder) { builder.startObject(11); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addMinCorner(FlatBufferBuilder builder, int minCornerOffset) { builder.addStruct(1, minCornerOffset, 0); }
  public static void addMaxCorner(FlatBufferBuilder builder, int maxCornerOffset) { builder.addStruct(2, maxCornerOffset, 0); }
  public static void addSymmetry(FlatBufferBuilder builder, int symmetry) { builder.addInt(3, symmetry, 0); }
  public static void addBodies(FlatBufferBuilder builder, int bodiesOffset) { builder.addOffset(4, bodiesOffset, 0); }
  public static void addRandomSeed(FlatBufferBuilder builder, int randomSeed) { builder.addInt(5, randomSeed, 0); }
  public static void addWalls(FlatBufferBuilder builder, int wallsOffset) { builder.addOffset(6, wallsOffset, 0); }
  public static int createWallsVector(FlatBufferBuilder builder, boolean[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addBoolean(data[i]); return builder.endVector(); }
  public static void startWallsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addClouds(FlatBufferBuilder builder, int cloudsOffset) { builder.addOffset(7, cloudsOffset, 0); }
  public static int createCloudsVector(FlatBufferBuilder builder, boolean[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addBoolean(data[i]); return builder.endVector(); }
  public static void startCloudsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addCurrents(FlatBufferBuilder builder, int currentsOffset) { builder.addOffset(8, currentsOffset, 0); }
  public static int createCurrentsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startCurrentsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIslands(FlatBufferBuilder builder, int islandsOffset) { builder.addOffset(9, islandsOffset, 0); }
  public static int createIslandsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startIslandsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addResources(FlatBufferBuilder builder, int resourcesOffset) { builder.addOffset(10, resourcesOffset, 0); }
  public static int createResourcesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startResourcesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endGameMap(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

