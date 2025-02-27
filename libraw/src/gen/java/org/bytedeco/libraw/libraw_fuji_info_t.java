// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_fuji_info_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_fuji_info_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_fuji_info_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_fuji_info_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_fuji_info_t position(long position) {
          return (libraw_fuji_info_t)super.position(position);
      }
      @Override public libraw_fuji_info_t getPointer(long i) {
          return new libraw_fuji_info_t((Pointer)this).offsetAddress(i);
      }
  
    public native float ExpoMidPointShift(); public native libraw_fuji_info_t ExpoMidPointShift(float setter);
    public native @Cast("ushort") short DynamicRange(); public native libraw_fuji_info_t DynamicRange(short setter);
    public native @Cast("ushort") short FilmMode(); public native libraw_fuji_info_t FilmMode(short setter);
    public native @Cast("ushort") short DynamicRangeSetting(); public native libraw_fuji_info_t DynamicRangeSetting(short setter);
    public native @Cast("ushort") short DevelopmentDynamicRange(); public native libraw_fuji_info_t DevelopmentDynamicRange(short setter);
    public native @Cast("ushort") short AutoDynamicRange(); public native libraw_fuji_info_t AutoDynamicRange(short setter);
    public native @Cast("ushort") short DRangePriority(); public native libraw_fuji_info_t DRangePriority(short setter);
    public native @Cast("ushort") short DRangePriorityAuto(); public native libraw_fuji_info_t DRangePriorityAuto(short setter);
    public native @Cast("ushort") short DRangePriorityFixed(); public native libraw_fuji_info_t DRangePriorityFixed(short setter);

    /*
    tag 0x9200, converted to BrightnessCompensation
    F700, S3Pro, S5Pro, S20Pro, S200EXR
    E550, E900, F810, S5600, S6500fd, S9000, S9500, S100FS
    */
    public native float BrightnessCompensation(); public native libraw_fuji_info_t BrightnessCompensation(float setter); /* in EV, if =4, raw data * 2^4 */

    public native @Cast("ushort") short FocusMode(); public native libraw_fuji_info_t FocusMode(short setter);
    public native @Cast("ushort") short AFMode(); public native libraw_fuji_info_t AFMode(short setter);
    public native @Cast("ushort") short FocusPixel(int i); public native libraw_fuji_info_t FocusPixel(int i, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer FocusPixel();
    public native @Cast("ushort") short ImageStabilization(int i); public native libraw_fuji_info_t ImageStabilization(int i, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer ImageStabilization();
    public native @Cast("ushort") short FlashMode(); public native libraw_fuji_info_t FlashMode(short setter);
    public native @Cast("ushort") short WB_Preset(); public native libraw_fuji_info_t WB_Preset(short setter);

    /* ShutterType:
       0 - mechanical
       1 = electronic
       2 = electronic, long shutter speed
       3 = electronic, front curtain
    */
    public native @Cast("ushort") short ShutterType(); public native libraw_fuji_info_t ShutterType(short setter);
    public native @Cast("ushort") short ExrMode(); public native libraw_fuji_info_t ExrMode(short setter);
    public native @Cast("ushort") short Macro(); public native libraw_fuji_info_t Macro(short setter);
    public native @Cast("unsigned") int Rating(); public native libraw_fuji_info_t Rating(int setter);

    /* CropMode:
       1 - FF on GFX,
       2 - sports finder (mechanical shutter),
       4 - 1.25x crop (electronic shutter, continuous high)
    */
    public native @Cast("ushort") short CropMode(); public native libraw_fuji_info_t CropMode(short setter);
    public native @Cast("ushort") short FrameRate(); public native libraw_fuji_info_t FrameRate(short setter);
    public native @Cast("ushort") short FrameWidth(); public native libraw_fuji_info_t FrameWidth(short setter);
    public native @Cast("ushort") short FrameHeight(); public native libraw_fuji_info_t FrameHeight(short setter);
    public native @Cast("char") byte SerialSignature(int i); public native libraw_fuji_info_t SerialSignature(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer SerialSignature();
    public native @Cast("char") byte RAFVersion(int i); public native libraw_fuji_info_t RAFVersion(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer RAFVersion();
    public native @Cast("ushort") short RAFDataVersion(); public native libraw_fuji_info_t RAFDataVersion(short setter);
    public native int isTSNERDTS(); public native libraw_fuji_info_t isTSNERDTS(int setter);

    /* DriveMode:
       0 - single frame
       1 - continuous low
       2 - continuous high
    */
    public native short DriveMode(); public native libraw_fuji_info_t DriveMode(short setter);
  }
