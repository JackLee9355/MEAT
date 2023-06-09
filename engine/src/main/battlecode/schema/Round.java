// automatically generated by the FlatBuffers compiler, do not modify

package battlecode.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * A single time-step in a Game.
 * The bulk of the data in the file is stored in tables like this.
 * Note that a struct-of-arrays format is more space efficient than an array-
 * of-structs.
 */
public final class Round extends Table {
  public static Round getRootAsRound(ByteBuffer _bb) { return getRootAsRound(_bb, new Round()); }
  public static Round getRootAsRound(ByteBuffer _bb, Round obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Round __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * The IDs of teams in the Game.
   */
  public int teamIDs(int j) { int o = __offset(4); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int teamIDsLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer teamIDsAsByteBuffer() { return __vector_as_bytebuffer(4, 4); }
  public ByteBuffer teamIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 4); }
  /**
   * The total amount of Ad change of this team, this round
   */
  public int teamAdChanges(int j) { int o = __offset(6); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int teamAdChangesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer teamAdChangesAsByteBuffer() { return __vector_as_bytebuffer(6, 4); }
  public ByteBuffer teamAdChangesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 4); }
  /**
   * The total amount of Mn change of this team, this round
   */
  public int teamMnChanges(int j) { int o = __offset(8); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int teamMnChangesLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer teamMnChangesAsByteBuffer() { return __vector_as_bytebuffer(8, 4); }
  public ByteBuffer teamMnChangesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 4); }
  /**
   * The total amount of Ex change of this team, this round
   */
  public int teamExChanges(int j) { int o = __offset(10); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int teamExChangesLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer teamExChangesAsByteBuffer() { return __vector_as_bytebuffer(10, 4); }
  public ByteBuffer teamExChangesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 4); }
  /**
   * The IDs of bodies that moved.
   */
  public int movedIDs(int j) { int o = __offset(12); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int movedIDsLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer movedIDsAsByteBuffer() { return __vector_as_bytebuffer(12, 4); }
  public ByteBuffer movedIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 4); }
  /**
   * The new locations of bodies that have moved.
   */
  public VecTable movedLocs() { return movedLocs(new VecTable()); }
  public VecTable movedLocs(VecTable obj) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * New bodies.
   */
  public SpawnedBodyTable spawnedBodies() { return spawnedBodies(new SpawnedBodyTable()); }
  public SpawnedBodyTable spawnedBodies(SpawnedBodyTable obj) { int o = __offset(16); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * The IDs of bodies that died.
   */
  public int diedIDs(int j) { int o = __offset(18); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int diedIDsLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer diedIDsAsByteBuffer() { return __vector_as_bytebuffer(18, 4); }
  public ByteBuffer diedIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 4); }
  /**
   * The IDs of robots that performed actions.
   * IDs may repeat.
   */
  public int actionIDs(int j) { int o = __offset(20); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int actionIDsLength() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer actionIDsAsByteBuffer() { return __vector_as_bytebuffer(20, 4); }
  public ByteBuffer actionIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 4); }
  /**
   * The actions performed. These actions allow us to track many things about the current state.
   */
  public byte actions(int j) { int o = __offset(22); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int actionsLength() { int o = __offset(22); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer actionsAsByteBuffer() { return __vector_as_bytebuffer(22, 1); }
  public ByteBuffer actionsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 22, 1); }
  /**
   * The 'targets' of the performed actions. Actions without targets may have any value
   */
  public int actionTargets(int j) { int o = __offset(24); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int actionTargetsLength() { int o = __offset(24); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer actionTargetsAsByteBuffer() { return __vector_as_bytebuffer(24, 4); }
  public ByteBuffer actionTargetsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 24, 4); }
  /**
   * The IDs of all islands
   */
  public int islandIDs(int j) { int o = __offset(26); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int islandIDsLength() { int o = __offset(26); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer islandIDsAsByteBuffer() { return __vector_as_bytebuffer(26, 4); }
  public ByteBuffer islandIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 26, 4); }
  /**
   * The number of turns the opposing team has been occupying each island
   */
  public int islandTurnoverTurns(int j) { int o = __offset(28); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int islandTurnoverTurnsLength() { int o = __offset(28); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer islandTurnoverTurnsAsByteBuffer() { return __vector_as_bytebuffer(28, 4); }
  public ByteBuffer islandTurnoverTurnsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 28, 4); }
  /**
   * The teamID for the owners of each island. 
   */
  public int islandOwnership(int j) { int o = __offset(30); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int islandOwnershipLength() { int o = __offset(30); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer islandOwnershipAsByteBuffer() { return __vector_as_bytebuffer(30, 4); }
  public ByteBuffer islandOwnershipInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 30, 4); }
  /**
   * The locations of the resources wells being given resources as x + y*width
   */
  public int resourceWellLocs(int j) { int o = __offset(32); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int resourceWellLocsLength() { int o = __offset(32); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer resourceWellLocsAsByteBuffer() { return __vector_as_bytebuffer(32, 4); }
  public ByteBuffer resourceWellLocsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 32, 4); }
  /**
   * The adamantium stored in the well
   */
  public int wellAdamantiumValues(int j) { int o = __offset(34); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int wellAdamantiumValuesLength() { int o = __offset(34); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer wellAdamantiumValuesAsByteBuffer() { return __vector_as_bytebuffer(34, 4); }
  public ByteBuffer wellAdamantiumValuesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 34, 4); }
  /**
   * The mana stored in the well
   */
  public int wellManaValues(int j) { int o = __offset(36); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int wellManaValuesLength() { int o = __offset(36); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer wellManaValuesAsByteBuffer() { return __vector_as_bytebuffer(36, 4); }
  public ByteBuffer wellManaValuesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 36, 4); }
  /**
   * The elixir stored in the well
   */
  public int wellElixirValues(int j) { int o = __offset(38); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int wellElixirValuesLength() { int o = __offset(38); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer wellElixirValuesAsByteBuffer() { return __vector_as_bytebuffer(38, 4); }
  public ByteBuffer wellElixirValuesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 38, 4); }
  /**
   * The ID for the resource this well contains
   */
  public int resourceID(int j) { int o = __offset(40); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int resourceIDLength() { int o = __offset(40); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer resourceIDAsByteBuffer() { return __vector_as_bytebuffer(40, 4); }
  public ByteBuffer resourceIDInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 40, 4); }
  /**
   * The acceleration ID for this resource well: 1 is accelerated, 0 is not
   */
  public int wellAccelerationID(int j) { int o = __offset(42); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int wellAccelerationIDLength() { int o = __offset(42); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer wellAccelerationIDAsByteBuffer() { return __vector_as_bytebuffer(42, 4); }
  public ByteBuffer wellAccelerationIDInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 42, 4); }
  /**
   * The IDs of the robots who changed their indicator strings
   */
  public int indicatorStringIDs(int j) { int o = __offset(44); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int indicatorStringIDsLength() { int o = __offset(44); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer indicatorStringIDsAsByteBuffer() { return __vector_as_bytebuffer(44, 4); }
  public ByteBuffer indicatorStringIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 44, 4); }
  /**
   * The messages of the robots who changed their indicator strings
   */
  public String indicatorStrings(int j) { int o = __offset(46); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int indicatorStringsLength() { int o = __offset(46); return o != 0 ? __vector_len(o) : 0; }
  /**
   * The IDs of bodies that set indicator dots
   */
  public int indicatorDotIDs(int j) { int o = __offset(48); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int indicatorDotIDsLength() { int o = __offset(48); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer indicatorDotIDsAsByteBuffer() { return __vector_as_bytebuffer(48, 4); }
  public ByteBuffer indicatorDotIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 48, 4); }
  /**
   * The location of the indicator dots
   */
  public VecTable indicatorDotLocs() { return indicatorDotLocs(new VecTable()); }
  public VecTable indicatorDotLocs(VecTable obj) { int o = __offset(50); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * The RGB values of the indicator dots
   */
  public RGBTable indicatorDotRGBs() { return indicatorDotRGBs(new RGBTable()); }
  public RGBTable indicatorDotRGBs(RGBTable obj) { int o = __offset(52); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * The IDs of bodies that set indicator lines
   */
  public int indicatorLineIDs(int j) { int o = __offset(54); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int indicatorLineIDsLength() { int o = __offset(54); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer indicatorLineIDsAsByteBuffer() { return __vector_as_bytebuffer(54, 4); }
  public ByteBuffer indicatorLineIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 54, 4); }
  /**
   * The start location of the indicator lines
   */
  public VecTable indicatorLineStartLocs() { return indicatorLineStartLocs(new VecTable()); }
  public VecTable indicatorLineStartLocs(VecTable obj) { int o = __offset(56); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * The end location of the indicator lines
   */
  public VecTable indicatorLineEndLocs() { return indicatorLineEndLocs(new VecTable()); }
  public VecTable indicatorLineEndLocs(VecTable obj) { int o = __offset(58); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * The RGB values of the indicator lines
   */
  public RGBTable indicatorLineRGBs() { return indicatorLineRGBs(new RGBTable()); }
  public RGBTable indicatorLineRGBs(RGBTable obj) { int o = __offset(60); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * The first sent Round in a match should have index 1. (The starting state,
   * created by the MatchHeader, can be thought to have index 0.)
   * It should increase by one for each following round.
   */
  public int roundID() { int o = __offset(62); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  /**
   * The IDs of player bodies.
   */
  public int bytecodeIDs(int j) { int o = __offset(64); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int bytecodeIDsLength() { int o = __offset(64); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer bytecodeIDsAsByteBuffer() { return __vector_as_bytebuffer(64, 4); }
  public ByteBuffer bytecodeIDsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 64, 4); }
  /**
   * The bytecodes used by the player bodies.
   */
  public int bytecodesUsed(int j) { int o = __offset(66); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int bytecodesUsedLength() { int o = __offset(66); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer bytecodesUsedAsByteBuffer() { return __vector_as_bytebuffer(66, 4); }
  public ByteBuffer bytecodesUsedInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 66, 4); }

  public static int createRound(FlatBufferBuilder builder,
      int teamIDsOffset,
      int teamAdChangesOffset,
      int teamMnChangesOffset,
      int teamExChangesOffset,
      int movedIDsOffset,
      int movedLocsOffset,
      int spawnedBodiesOffset,
      int diedIDsOffset,
      int actionIDsOffset,
      int actionsOffset,
      int actionTargetsOffset,
      int islandIDsOffset,
      int islandTurnoverTurnsOffset,
      int islandOwnershipOffset,
      int resourceWellLocsOffset,
      int wellAdamantiumValuesOffset,
      int wellManaValuesOffset,
      int wellElixirValuesOffset,
      int resourceIDOffset,
      int wellAccelerationIDOffset,
      int indicatorStringIDsOffset,
      int indicatorStringsOffset,
      int indicatorDotIDsOffset,
      int indicatorDotLocsOffset,
      int indicatorDotRGBsOffset,
      int indicatorLineIDsOffset,
      int indicatorLineStartLocsOffset,
      int indicatorLineEndLocsOffset,
      int indicatorLineRGBsOffset,
      int roundID,
      int bytecodeIDsOffset,
      int bytecodesUsedOffset) {
    builder.startObject(32);
    Round.addBytecodesUsed(builder, bytecodesUsedOffset);
    Round.addBytecodeIDs(builder, bytecodeIDsOffset);
    Round.addRoundID(builder, roundID);
    Round.addIndicatorLineRGBs(builder, indicatorLineRGBsOffset);
    Round.addIndicatorLineEndLocs(builder, indicatorLineEndLocsOffset);
    Round.addIndicatorLineStartLocs(builder, indicatorLineStartLocsOffset);
    Round.addIndicatorLineIDs(builder, indicatorLineIDsOffset);
    Round.addIndicatorDotRGBs(builder, indicatorDotRGBsOffset);
    Round.addIndicatorDotLocs(builder, indicatorDotLocsOffset);
    Round.addIndicatorDotIDs(builder, indicatorDotIDsOffset);
    Round.addIndicatorStrings(builder, indicatorStringsOffset);
    Round.addIndicatorStringIDs(builder, indicatorStringIDsOffset);
    Round.addWellAccelerationID(builder, wellAccelerationIDOffset);
    Round.addResourceID(builder, resourceIDOffset);
    Round.addWellElixirValues(builder, wellElixirValuesOffset);
    Round.addWellManaValues(builder, wellManaValuesOffset);
    Round.addWellAdamantiumValues(builder, wellAdamantiumValuesOffset);
    Round.addResourceWellLocs(builder, resourceWellLocsOffset);
    Round.addIslandOwnership(builder, islandOwnershipOffset);
    Round.addIslandTurnoverTurns(builder, islandTurnoverTurnsOffset);
    Round.addIslandIDs(builder, islandIDsOffset);
    Round.addActionTargets(builder, actionTargetsOffset);
    Round.addActions(builder, actionsOffset);
    Round.addActionIDs(builder, actionIDsOffset);
    Round.addDiedIDs(builder, diedIDsOffset);
    Round.addSpawnedBodies(builder, spawnedBodiesOffset);
    Round.addMovedLocs(builder, movedLocsOffset);
    Round.addMovedIDs(builder, movedIDsOffset);
    Round.addTeamExChanges(builder, teamExChangesOffset);
    Round.addTeamMnChanges(builder, teamMnChangesOffset);
    Round.addTeamAdChanges(builder, teamAdChangesOffset);
    Round.addTeamIDs(builder, teamIDsOffset);
    return Round.endRound(builder);
  }

  public static void startRound(FlatBufferBuilder builder) { builder.startObject(32); }
  public static void addTeamIDs(FlatBufferBuilder builder, int teamIDsOffset) { builder.addOffset(0, teamIDsOffset, 0); }
  public static int createTeamIDsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startTeamIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addTeamAdChanges(FlatBufferBuilder builder, int teamAdChangesOffset) { builder.addOffset(1, teamAdChangesOffset, 0); }
  public static int createTeamAdChangesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startTeamAdChangesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addTeamMnChanges(FlatBufferBuilder builder, int teamMnChangesOffset) { builder.addOffset(2, teamMnChangesOffset, 0); }
  public static int createTeamMnChangesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startTeamMnChangesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addTeamExChanges(FlatBufferBuilder builder, int teamExChangesOffset) { builder.addOffset(3, teamExChangesOffset, 0); }
  public static int createTeamExChangesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startTeamExChangesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMovedIDs(FlatBufferBuilder builder, int movedIDsOffset) { builder.addOffset(4, movedIDsOffset, 0); }
  public static int createMovedIDsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startMovedIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMovedLocs(FlatBufferBuilder builder, int movedLocsOffset) { builder.addOffset(5, movedLocsOffset, 0); }
  public static void addSpawnedBodies(FlatBufferBuilder builder, int spawnedBodiesOffset) { builder.addOffset(6, spawnedBodiesOffset, 0); }
  public static void addDiedIDs(FlatBufferBuilder builder, int diedIDsOffset) { builder.addOffset(7, diedIDsOffset, 0); }
  public static int createDiedIDsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startDiedIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addActionIDs(FlatBufferBuilder builder, int actionIDsOffset) { builder.addOffset(8, actionIDsOffset, 0); }
  public static int createActionIDsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startActionIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addActions(FlatBufferBuilder builder, int actionsOffset) { builder.addOffset(9, actionsOffset, 0); }
  public static int createActionsVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startActionsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addActionTargets(FlatBufferBuilder builder, int actionTargetsOffset) { builder.addOffset(10, actionTargetsOffset, 0); }
  public static int createActionTargetsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startActionTargetsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIslandIDs(FlatBufferBuilder builder, int islandIDsOffset) { builder.addOffset(11, islandIDsOffset, 0); }
  public static int createIslandIDsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startIslandIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIslandTurnoverTurns(FlatBufferBuilder builder, int islandTurnoverTurnsOffset) { builder.addOffset(12, islandTurnoverTurnsOffset, 0); }
  public static int createIslandTurnoverTurnsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startIslandTurnoverTurnsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIslandOwnership(FlatBufferBuilder builder, int islandOwnershipOffset) { builder.addOffset(13, islandOwnershipOffset, 0); }
  public static int createIslandOwnershipVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startIslandOwnershipVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addResourceWellLocs(FlatBufferBuilder builder, int resourceWellLocsOffset) { builder.addOffset(14, resourceWellLocsOffset, 0); }
  public static int createResourceWellLocsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startResourceWellLocsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addWellAdamantiumValues(FlatBufferBuilder builder, int wellAdamantiumValuesOffset) { builder.addOffset(15, wellAdamantiumValuesOffset, 0); }
  public static int createWellAdamantiumValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startWellAdamantiumValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addWellManaValues(FlatBufferBuilder builder, int wellManaValuesOffset) { builder.addOffset(16, wellManaValuesOffset, 0); }
  public static int createWellManaValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startWellManaValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addWellElixirValues(FlatBufferBuilder builder, int wellElixirValuesOffset) { builder.addOffset(17, wellElixirValuesOffset, 0); }
  public static int createWellElixirValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startWellElixirValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addResourceID(FlatBufferBuilder builder, int resourceIDOffset) { builder.addOffset(18, resourceIDOffset, 0); }
  public static int createResourceIDVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startResourceIDVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addWellAccelerationID(FlatBufferBuilder builder, int wellAccelerationIDOffset) { builder.addOffset(19, wellAccelerationIDOffset, 0); }
  public static int createWellAccelerationIDVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startWellAccelerationIDVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIndicatorStringIDs(FlatBufferBuilder builder, int indicatorStringIDsOffset) { builder.addOffset(20, indicatorStringIDsOffset, 0); }
  public static int createIndicatorStringIDsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startIndicatorStringIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIndicatorStrings(FlatBufferBuilder builder, int indicatorStringsOffset) { builder.addOffset(21, indicatorStringsOffset, 0); }
  public static int createIndicatorStringsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startIndicatorStringsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIndicatorDotIDs(FlatBufferBuilder builder, int indicatorDotIDsOffset) { builder.addOffset(22, indicatorDotIDsOffset, 0); }
  public static int createIndicatorDotIDsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startIndicatorDotIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIndicatorDotLocs(FlatBufferBuilder builder, int indicatorDotLocsOffset) { builder.addOffset(23, indicatorDotLocsOffset, 0); }
  public static void addIndicatorDotRGBs(FlatBufferBuilder builder, int indicatorDotRGBsOffset) { builder.addOffset(24, indicatorDotRGBsOffset, 0); }
  public static void addIndicatorLineIDs(FlatBufferBuilder builder, int indicatorLineIDsOffset) { builder.addOffset(25, indicatorLineIDsOffset, 0); }
  public static int createIndicatorLineIDsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startIndicatorLineIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIndicatorLineStartLocs(FlatBufferBuilder builder, int indicatorLineStartLocsOffset) { builder.addOffset(26, indicatorLineStartLocsOffset, 0); }
  public static void addIndicatorLineEndLocs(FlatBufferBuilder builder, int indicatorLineEndLocsOffset) { builder.addOffset(27, indicatorLineEndLocsOffset, 0); }
  public static void addIndicatorLineRGBs(FlatBufferBuilder builder, int indicatorLineRGBsOffset) { builder.addOffset(28, indicatorLineRGBsOffset, 0); }
  public static void addRoundID(FlatBufferBuilder builder, int roundID) { builder.addInt(29, roundID, 0); }
  public static void addBytecodeIDs(FlatBufferBuilder builder, int bytecodeIDsOffset) { builder.addOffset(30, bytecodeIDsOffset, 0); }
  public static int createBytecodeIDsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startBytecodeIDsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addBytecodesUsed(FlatBufferBuilder builder, int bytecodesUsedOffset) { builder.addOffset(31, bytecodesUsedOffset, 0); }
  public static int createBytecodesUsedVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startBytecodesUsedVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endRound(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

